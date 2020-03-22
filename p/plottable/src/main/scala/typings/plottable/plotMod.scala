package typings.plottable

import typings.d3Collection.mod.Map_
import typings.d3Selection.mod.Selection_
import typings.plottable.animatorMod.IAnimator
import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.commonsMod.ILightweightPlotEntity
import typings.plottable.commonsMod.IPlotEntity
import typings.plottable.componentMod.Component
import typings.plottable.datasetMod.Dataset
import typings.plottable.drawStepMod.AppliedDrawStep
import typings.plottable.drawStepMod.DrawStep
import typings.plottable.drawerMod.ProxyDrawer
import typings.plottable.entityStoreMod.IEntityStore
import typings.plottable.interfacesMod.AttributeToProjector
import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.IRangeProjector
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.Range
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.scaleMod.Scale
import typings.plottable.utilsMod.Map
import typings.std.HTMLCanvasElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/plot", JSImport.Namespace)
@js.native
object plotMod extends js.Object {
  @js.native
  /**
    * A Plot draws some visualization of the inputted Datasets.
    *
    * @constructor
    */
  class Plot () extends Component {
    var _animate: js.Any = js.native
    /**
      * The Animators for this plot. Each plot exposes a set of "animator key" strings that
      * define how different parts of that particular Plot animates. For instance, Rectangle
      * Plots have a "rectangles" animator key which controls how the <rect>s are animated.
      * @see animator()
      *
      * There are two common animators that most Plots respect: "main" and "reset". In general,
      * Plots draw in two steps: first they "reset" their visual elements (e.g. scatter plots set
      * all the dots to size 0), and then they do the "main" animation into the correct visualization
      * (e.g. scatter plot dots grow to their specified size).
      */
    var _animators: js.Any = js.native
    /**
      * Mapping from attribute names to the AccessorScale that defines that attribute.
      */
    var _attrBindings: js.Any = js.native
    /**
      * Mapping from attribute names to the extents ([min, max]) values that that attribute takes on.
      */
    var _attrExtents: js.Any = js.native
    var _bufferCanvas: Selection_[HTMLCanvasElement, _, _, _] = js.native
    var _bufferCanvasValid: Boolean = js.native
    var _cachedAttrToProjector: js.Any = js.native
    /**
      * _cachedEntityStore is a cache of all the entities in the plot. It, at times
      * may be undefined and shouldn't be accessed directly. Instead, use _getEntityStore
      * to access the entity store.
      */
    var _cachedEntityStore: js.Any = js.native
    /**
      * The canvas element that this Plot will render to if using the canvas
      * renderer, or null if not using the SVG renderer. The node may be
      * parent-less (which means that the plot isn't setup yet but is still using
      * the canvas renderer).
      */
    var _canvas: Selection_[HTMLCanvasElement, _, _, _] = js.native
    /**
      * Whether the backing datasets have changed since this plot's last render.
      */
    var _dataChanged: js.Any = js.native
    /**
      * Stores the Drawer for each dataset attached to this plot.
      */
    var _datasetToDrawer: js.Any = js.native
    var _deferredResetEntityStore: js.Any = js.native
    /**
      * Callback that we register onto Scales that get bound to this Plot.
      *
      * TODO make this an arrow method instead of re-defining it in constructor()
      */
    var _includedValuesProvider: js.Any = js.native
    /**
      * Callback that triggers when any Dataset that's bound to this plot Updates.
      *
      * TODO make this an arrow method insteade of re-defining it in constructor()
      */
    var _onDatasetUpdateCallback: js.Any = js.native
    /**
      * Mapping from property names to the AccessorScale that defines that
      * property.
      *
      * e.g. Line may register an "x" -> binding and a "y" -> binding; Rectangle
      * would register "x", "y", "x2", and "y2"
      *
      * Only subclasses control how they register properties, while attrs can be
      * registered by the user. By default, only attrs are passed to the
      * _generateDrawStep's attrToProjector; properties are not.
      */
    var _propertyBindings: Map_[IAccessorScaleBinding[_, _]] = js.native
    /**
      * Mapping from property names to the extents ([min, max]) values that that
      * property takes on.
      */
    var _propertyExtents: js.Any = js.native
    /**
      * The _renderArea is the main SVG drawing area upon which this plot should draw to.
      */
    var _renderArea: Selection_[SVGGElement, _, _, _] = js.native
    /* protected */ def _addDataset(dataset: Dataset): this.type = js.native
    /* protected */ def _additionalPaint(time: Double): Unit = js.native
    /* protected */ def _animateOnNextRender(): Boolean = js.native
    /* private */ def _appendCanvasNode(): js.Any = js.native
    /* protected */ def _bindAttr(attr: String, valueOrFn: js.Any, scale: Scale[_, _]): Unit = js.native
    /* protected */ def _bindAttr(attr: String, valueOrFn: js.Function, scale: Scale[_, _]): Unit = js.native
    /* protected */ def _bindProperty(property: String, valueOrFn: js.Any, scale: Scale[_, _]): Unit = js.native
    /* protected */ def _bindProperty(property: String, valueOrFn: js.Any, scale: Scale[_, _], postScale: IRangeProjector[_]): Unit = js.native
    /* protected */ def _bindProperty(property: String, valueOrFn: js.Function, scale: Scale[_, _]): Unit = js.native
    /* protected */ def _bindProperty(property: String, valueOrFn: js.Function, scale: Scale[_, _], postScale: IRangeProjector[_]): Unit = js.native
    /**
      * _buildLightweightPlotEntities constucts {LightweightPlotEntity[]} from
      * all the entities in the plot
      * @param {Dataset[]} [datasets] - datasets comprising this plot
      */
    /* protected */ def _buildLightweightPlotEntities(datasets: js.Array[Dataset]): js.Array[ILightweightPlotEntity] = js.native
    /* protected */ def _clearAttrToProjectorCache(): Unit = js.native
    /**
      * Create a new Drawer. Subclasses should override this to return
      * a Drawer that draws the correct shapes for this plot.
      */
    /* protected */ def _createDrawer(dataset: Dataset): ProxyDrawer = js.native
    /**
      * Setup the DOM nodes for the given dataset. This is a separate
      * step from "creating the Drawer" since the element may not be setup yet
      * (in which case the _renderArea is null because the .element() and .content()
      * are null). Also because subclasses may do more than just configure one
      * single drawer (e.g. adding text drawing capabilities).
      */
    /* protected */ def _createNodesForDataset(dataset: Dataset): typings.plottable.drawersMod.ProxyDrawer = js.native
    /* protected */ def _entityBounds(entity: ILightweightPlotEntity): AnonHeightWidth = js.native
    /* protected */ def _entityBounds(entity: IPlotEntity): AnonHeightWidth = js.native
    /* protected */ def _filterForProperty(property: String): IAccessor[Boolean] = js.native
    /* protected */ def _generateAttrToProjector(): AttributeToProjector = js.native
    /* protected */ def _generateDrawSteps(): js.Array[DrawStep] = js.native
    /* protected */ def _getAnimator(key: String): IAnimator = js.native
    /* protected */ def _getAttrToProjector(): AttributeToProjector = js.native
    /* protected */ def _getDataToDraw(): Map[Dataset, js.Array[_]] = js.native
    /**
      * _getEntityStore returns the store of all Entities associated with the specified dataset
      *
      * @param {Dataset[]} [datasets] - The datasets with which to construct the store. If no datasets
      * are specified all datasets will be used.
      */
    /* protected */ def _getEntityStore(): IEntityStore[ILightweightPlotEntity] = js.native
    /* protected */ def _getEntityStore(datasets: js.Array[Dataset]): IEntityStore[ILightweightPlotEntity] = js.native
    /* private */ def _includedValuesForScale[D](scale: js.Any): js.Any = js.native
    /* private */ def _includedValuesForScale[D](scale: js.Any, ignoreAttachState: js.Any): js.Any = js.native
    /* protected */ def _installScaleForKey(scale: Scale[_, _], key: String): Unit = js.native
    /* protected */ def _lightweightPlotEntityToPlotEntity(entity: ILightweightPlotEntity): IPlotEntity = js.native
    /**
      * _localOriginBounds returns bounds of the plot from its own origin, rather than from parent origin (as provided by `this.bounds()`)
      *
      * @return {Bounds}
      */
    /* protected */ def _localOriginBounds(): Bounds = js.native
    /* protected */ def _onDatasetUpdate(): Unit = js.native
    /* private */ def _paint(): js.Any = js.native
    /* protected */ def _pixelPoint(datum: js.Any, index: Double, dataset: Dataset): Point = js.native
    /* protected */ def _propertyProjectors(): AttributeToProjector = js.native
    /* protected */ def _removeDataset(dataset: Dataset): this.type = js.native
    /* protected */ def _removeDatasetNodes(dataset: Dataset): Unit = js.native
    /**
      * Callback that triggers when any scale that's bound to this plot Updates.
      * This is used by extending classes to defer the actual rendering.
      *
      * TODO make this an arrow method instead of re-defining it in constructor()
      */
    /* protected */ def _renderCallback(): Unit = js.native
    /* protected */ def _resetEntityStore(): Unit = js.native
    /**
      * @returns {Scale[]} A unique array of all scales currently used by the Plot.
      */
    /* private */ def _scales(): js.Any = js.native
    /* protected */ def _uninstallScaleForKey(scale: Scale[_, _], key: String): Unit = js.native
    /**
      * Updates the extents associated with each attribute, then autodomains all scales the Plot uses.
      */
    /* protected */ def _updateExtents(): Unit = js.native
    /**
      * Adds a Dataset to the Plot.
      *
      * @param {Dataset} dataset
      * @returns {Plot} The calling Plot.
      */
    def addDataset(dataset: Dataset): this.type = js.native
    /**
      * Returns whether the plot will be animated.
      */
    def animated(): Boolean = js.native
    /**
      * Enables or disables animation.
      */
    def animated(willAnimate: Boolean): this.type = js.native
    /**
      * Get the Animator associated with the specified Animator key.
      *
      * @return {Animator}
      */
    def animator(animatorKey: String): IAnimator = js.native
    /**
      * Set the Animator associated with the specified Animator key.
      *
      * @param {string} animatorKey
      * @param {Animator} animator
      * @returns {Plot} The calling Plot.
      */
    def animator(animatorKey: String, animator: IAnimator): this.type = js.native
    def attr(attr: String, attrValue: String): this.type = js.native
    /**
      * Sets a particular attribute to a constant value or the result of an Accessor.
      *
      * @param {string} attr
      * @param {number|string|Accessor<number>|Accessor<string>|Accessor<boolean>} attrValue
      * @returns {Plot} The calling Plot.
      */
    def attr(attr: String, attrValue: Double): this.type = js.native
    def attr(attr: String, attrValue: IAccessor[Boolean | Double | String]): this.type = js.native
    /**
      * Gets the AccessorScaleBinding for a particular attribute.
      *
      * @param {string} attr
      */
    def attr[A](attr: String): IAccessorScaleBinding[A, Double | String] = js.native
    /**
      * Sets a particular attribute to a scaled constant value or scaled result of an Accessor.
      * The provided Scale will account for the attribute values when autoDomain()-ing.
      *
      * @param {string} attr
      * @param {A|Accessor<A>} attrValue
      * @param {Scale<A, number | string>} scale The Scale used to scale the attrValue.
      * @returns {Plot} The calling Plot.
      */
    def attr[A](attr: String, attrValue: A, scale: Scale[A, Double | String]): this.type = js.native
    def attr[A](attr: String, attrValue: IAccessor[A], scale: Scale[A, Double | String]): this.type = js.native
    def datasets(): js.Array[Dataset] = js.native
    def datasets(datasets: js.Array[Dataset]): this.type = js.native
    /**
      * Gets the Entities associated with the specified Datasets.
      *
      * @param {Dataset[]} datasets The Datasets to retrieve the Entities for.
      *   If not provided, returns defaults to all Datasets on the Plot.
      * @return {Plots.PlotEntity[]}
      */
    def entities(): js.Array[IPlotEntity] = js.native
    def entities(datasets: js.Array[Dataset]): js.Array[IPlotEntity] = js.native
    /**
      * Gets the PlotEntities at a particular Point.
      *
      * Each plot type determines how to locate entities at or near the query
      * point. For example, line and area charts will return the nearest entity,
      * but bar charts will only return the entities that fully contain the query
      * point.
      *
      * @param {Point} point The point to query.
      * @returns {PlotEntity[]} The PlotEntities at the particular point
      */
    def entitiesAt(point: Point): js.Array[IPlotEntity] = js.native
    /**
      * @deprecated Use `entitiesInBounds` instead
      *
      * Gets the Entities that intersect the Bounds.
      *
      * @param {Bounds} bounds
      * @returns {PlotEntity[]}
      */
    def entitiesIn(bounds: Bounds): js.Array[IPlotEntity] = js.native
    /**
      * @deprecated Use `entitiesInBounds` instead
      *
      * Gets the Entities that intersect the area defined by the ranges.
      *
      * @param {Range} xRange
      * @param {Range} yRange
      * @returns {PlotEntity[]}
      */
    def entitiesIn(xRange: Range, yRange: Range): js.Array[IPlotEntity] = js.native
    /**
      * Returns the entites whose bounding boxes overlap the parameter.
      *
      * `queryBounds` are in pixel space, measured from the origin of this plot.
      */
    def entitiesInBounds(queryBounds: IEntityBounds): js.Array[IPlotEntity] = js.native
    /**
      * Returns the entites whose bounding boxes overlap the `queryBounds`
      * parameter on the x-axis.
      *
      * `queryBounds` are in pixel space, measured from the origin of this plot.
      */
    def entitiesInXBounds(queryBounds: IEntityBounds): js.Array[IPlotEntity] = js.native
    /**
      * Returns the entites whose bounding boxes overlap the `queryBounds`
      * parameter on the y-axis.
      *
      * `queryBounds` are in pixel space, measured from the origin of this plot.
      */
    def entitiesInYBounds(queryBounds: IEntityBounds): js.Array[IPlotEntity] = js.native
    /**
      * Returns the {Plots.PlotEntity} nearest to the query point,
      * or undefined if no {Plots.PlotEntity} can be found.
      *
      * @param {Point} queryPoint
      * @returns {Plots.PlotEntity} The nearest PlotEntity, or undefined if no {Plots.PlotEntity} can be found.
      */
    def entityNearest(queryPoint: Point): IPlotEntity = js.native
    /**
      * Gets the `Plots.PlotEntity`s in the plot, whereby the
      * `Plots.ILightweightPlotEntity`s are filtered by the provided predicate.
      * Since `_lightweightPlotEntityToPlotEntity` can be expensive, this method
      * can be useful for performance optimization.
      *
      * @param where A filter predicate that is applied to lightweight entities
      * before upconverting them to full plot entities
      * @return {Plots.PlotEntity[]}
      */
    def filterEntities(where: js.Function2[/* entity */ ILightweightPlotEntity, /* index */ Double, Boolean]): js.Array[IPlotEntity] = js.native
    /* protected */ def getExtentsForAttr(attr: String): js.Array[js.Array[_]] = js.native
    /**
      * Override in subclass to add special extents, such as included values
      */
    /* protected */ def getExtentsForProperty(property: String): js.Array[js.Array[_]] = js.native
    /**
      * Removes a Dataset from the Plot.
      *
      * @param {Dataset} dataset
      * @returns {Plot} The calling Plot.
      */
    def removeDataset(dataset: Dataset): this.type = js.native
    /**
      * Get the renderer for this Plot, either "svg" or "canvas".
      */
    def renderer(): Renderer = js.native
    /**
      * Set the Renderer to be either "svg" or "canvas" on this Plot.
      * @param renderer
      */
    def renderer(renderer: Renderer): this.type = js.native
    /**
      * Retrieves the drawn visual elements for the specified Datasets as a d3 Selection.
      * Not supported on canvas renderer.
      *
      * @param {Dataset[]} [datasets] The Datasets to retrieve the Selections for.
      *   If not provided, Selections will be retrieved for all Datasets on the Plot.
      * @returns {d3.Selection}
      */
    def selections(): SimpleSelection[_] = js.native
    def selections(datasets: js.Array[Dataset]): SimpleSelection[_] = js.native
  }
  
  /* static members */
  @js.native
  object Plot extends js.Object {
    var OPTIMIZE_MEMOIZE_PROJECTORS: Boolean = js.native
    var _ANIMATION_MAX_DURATION: Double = js.native
    /* protected */ def _scaledAccessor[D, R](binding: IAccessorScaleBinding[D, R]): IAccessor[_] = js.native
    def applyDrawSteps(drawSteps: js.Array[DrawStep], dataset: Dataset): js.Array[AppliedDrawStep] = js.native
    def getTotalDrawTime(data: js.Array[_], drawSteps: js.Array[DrawStep]): Double = js.native
  }
  
  @js.native
  object Renderer extends js.Object {
    var canvas: typings.plottable.plottableStrings.canvas = js.native
    var svg: typings.plottable.plottableStrings.svg = js.native
  }
  
  type Renderer = String
}

