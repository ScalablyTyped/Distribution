package typings
package plottableLib.buildSrcPlotsPlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/plot", "Plot")
@js.native
class Plot ()
  extends plottableLib.buildSrcComponentsComponentMod.Component {
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
  var _bufferCanvas: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.HTMLCanvasElement, _, _, _] = js.native
  var _bufferCanvasValid: scala.Boolean = js.native
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
  var _canvas: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.HTMLCanvasElement, _, _, _] = js.native
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
  var _propertyBindings: d3DashCollectionLib.d3DashCollectionMod.Map[plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[_, _]] = js.native
  /**
       * Mapping from property names to the extents ([min, max]) values that that
       * property takes on.
       */
  var _propertyExtents: js.Any = js.native
  /**
       * The _renderArea is the main SVG drawing area upon which this plot should draw to.
       */
  var _renderArea: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGGElement, _, _, _] = js.native
  /* protected */ def _addDataset(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): this.type = js.native
  /* protected */ def _additionalPaint(time: scala.Double): scala.Unit = js.native
  /* protected */ def _animateOnNextRender(): scala.Boolean = js.native
  /* private */ def _appendCanvasNode(): js.Any = js.native
  /* protected */ def _bindAttr(attr: java.lang.String, valueOrFn: js.Any, scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]): scala.Unit = js.native
  /* protected */ def _bindAttr(
    attr: java.lang.String,
    valueOrFn: js.Function,
    scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]
  ): scala.Unit = js.native
  /* protected */ def _bindProperty(
    property: java.lang.String,
    valueOrFn: js.Any,
    scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]
  ): scala.Unit = js.native
  /* protected */ def _bindProperty(
    property: java.lang.String,
    valueOrFn: js.Any,
    scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _],
    postScale: plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[_]
  ): scala.Unit = js.native
  /* protected */ def _bindProperty(
    property: java.lang.String,
    valueOrFn: js.Function,
    scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _]
  ): scala.Unit = js.native
  /* protected */ def _bindProperty(
    property: java.lang.String,
    valueOrFn: js.Function,
    scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _],
    postScale: plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[_]
  ): scala.Unit = js.native
  /**
       * _buildLightweightPlotEntities constucts {LightweightPlotEntity[]} from
       * all the entities in the plot
       * @param {Dataset[]} [datasets] - datasets comprising this plot
       */
  /* protected */ def _buildLightweightPlotEntities(datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset]): js.Array[plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity] = js.native
  /* protected */ def _clearAttrToProjectorCache(): scala.Unit = js.native
  /**
       * Create a new Drawer. Subclasses should override this to return
       * a Drawer that draws the correct shapes for this plot.
       */
  /* protected */ def _createDrawer(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): plottableLib.buildSrcDrawersDrawerMod.ProxyDrawer = js.native
  /**
       * Setup the DOM nodes for the given dataset. This is a separate
       * step from "creating the Drawer" since the element may not be setup yet
       * (in which case the _renderArea is null because the .element() and .content()
       * are null). Also because subclasses may do more than just configure one
       * single drawer (e.g. adding text drawing capabilities).
       */
  /* protected */ def _createNodesForDataset(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): plottableLib.buildSrcDrawersMod.ProxyDrawer = js.native
  /* protected */ def _entityBounds(entity: plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity): plottableLib.Anon_YX = js.native
  /* protected */ def _entityBounds(entity: plottableLib.buildSrcPlotsCommonsMod.IPlotEntity): plottableLib.Anon_YX = js.native
  /* protected */ def _filterForProperty(property: java.lang.String): plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Boolean] = js.native
  /* protected */ def _generateAttrToProjector(): plottableLib.buildSrcCoreInterfacesMod.AttributeToProjector = js.native
  /* protected */ def _generateDrawSteps(): js.Array[plottableLib.buildSrcDrawersDrawStepMod.DrawStep] = js.native
  /* protected */ def _getAnimator(key: java.lang.String): plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator = js.native
  /* protected */ def _getAttrToProjector(): plottableLib.buildSrcCoreInterfacesMod.AttributeToProjector = js.native
  /* protected */ def _getDataToDraw(): plottableLib.buildSrcUtilsMod.Map[plottableLib.buildSrcCoreDatasetMod.Dataset, js.Array[_]] = js.native
  /**
       * _getEntityStore returns the store of all Entities associated with the specified dataset
       *
       * @param {Dataset[]} [datasets] - The datasets with which to construct the store. If no datasets
       * are specified all datasets will be used.
       */
  /* protected */ def _getEntityStore(): plottableLib.buildSrcUtilsEntityStoreMod.IEntityStore[plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity] = js.native
  /**
       * _getEntityStore returns the store of all Entities associated with the specified dataset
       *
       * @param {Dataset[]} [datasets] - The datasets with which to construct the store. If no datasets
       * are specified all datasets will be used.
       */
  /* protected */ def _getEntityStore(datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset]): plottableLib.buildSrcUtilsEntityStoreMod.IEntityStore[plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity] = js.native
  /* private */ def _includedValuesForScale[D](scale: js.Any): js.Any = js.native
  /* private */ def _includedValuesForScale[D](scale: js.Any, ignoreAttachState: js.Any): js.Any = js.native
  /* protected */ def _installScaleForKey(scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _], key: java.lang.String): scala.Unit = js.native
  /* protected */ def _lightweightPlotEntityToPlotEntity(entity: plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity): plottableLib.buildSrcPlotsCommonsMod.IPlotEntity = js.native
  /**
       * _localOriginBounds returns bounds of the plot from its own origin, rather than from parent origin (as provided by `this.bounds()`)
       *
       * @return {Bounds}
       */
  /* protected */ def _localOriginBounds(): plottableLib.buildSrcCoreInterfacesMod.Bounds = js.native
  /* protected */ def _onDatasetUpdate(): scala.Unit = js.native
  /* private */ def _paint(): js.Any = js.native
  /* protected */ def _pixelPoint(datum: js.Any, index: scala.Double, dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): plottableLib.buildSrcCoreInterfacesMod.Point = js.native
  /* protected */ def _propertyProjectors(): plottableLib.buildSrcCoreInterfacesMod.AttributeToProjector = js.native
  /* protected */ def _removeDataset(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): this.type = js.native
  /* protected */ def _removeDatasetNodes(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): scala.Unit = js.native
  /**
       * Callback that triggers when any scale that's bound to this plot Updates.
       * This is used by extending classes to defer the actual rendering.
       *
       * TODO make this an arrow method instead of re-defining it in constructor()
       */
  /* protected */ def _renderCallback(): scala.Unit = js.native
  /* protected */ def _resetEntityStore(): scala.Unit = js.native
  /**
       * @returns {Scale[]} A unique array of all scales currently used by the Plot.
       */
  /* private */ def _scales(): js.Any = js.native
  /* protected */ def _uninstallScaleForKey(scale: plottableLib.buildSrcScalesScaleMod.Scale[_, _], key: java.lang.String): scala.Unit = js.native
  /**
       * Updates the extents associated with each attribute, then autodomains all scales the Plot uses.
       */
  /* protected */ def _updateExtents(): scala.Unit = js.native
  /**
       * Adds a Dataset to the Plot.
       *
       * @param {Dataset} dataset
       * @returns {Plot} The calling Plot.
       */
  def addDataset(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): this.type = js.native
  /**
       * Returns whether the plot will be animated.
       */
  def animated(): scala.Boolean = js.native
  /**
       * Enables or disables animation.
       */
  def animated(willAnimate: scala.Boolean): this.type = js.native
  /**
       * Get the Animator associated with the specified Animator key.
       *
       * @return {Animator}
       */
  def animator(animatorKey: java.lang.String): plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator = js.native
  /**
       * Set the Animator associated with the specified Animator key.
       *
       * @param {string} animatorKey
       * @param {Animator} animator
       * @returns {Plot} The calling Plot.
       */
  def animator(animatorKey: java.lang.String, animator: plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator): this.type = js.native
  /**
       * Sets a particular attribute to a constant value or the result of an Accessor.
       *
       * @param {string} attr
       * @param {number|string|Accessor<number>|Accessor<string>} attrValue
       * @returns {Plot} The calling Plot.
       */
  def attr(attr: java.lang.String, attrValue: java.lang.String): this.type = js.native
  /**
       * Sets a particular attribute to a constant value or the result of an Accessor.
       *
       * @param {string} attr
       * @param {number|string|Accessor<number>|Accessor<string>} attrValue
       * @returns {Plot} The calling Plot.
       */
  def attr(
    attr: java.lang.String,
    attrValue: plottableLib.buildSrcCoreInterfacesMod.IAccessor[java.lang.String | scala.Double]
  ): this.type = js.native
  /**
       * Sets a particular attribute to a constant value or the result of an Accessor.
       *
       * @param {string} attr
       * @param {number|string|Accessor<number>|Accessor<string>} attrValue
       * @returns {Plot} The calling Plot.
       */
  def attr(attr: java.lang.String, attrValue: scala.Double): this.type = js.native
  /**
       * Gets the AccessorScaleBinding for a particular attribute.
       *
       * @param {string} attr
       */
  def attr[A](attr: java.lang.String): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[A, scala.Double | java.lang.String] = js.native
  /**
       * Sets a particular attribute to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the attribute values when autoDomain()-ing.
       *
       * @param {string} attr
       * @param {A|Accessor<A>} attrValue
       * @param {Scale<A, number | string>} scale The Scale used to scale the attrValue.
       * @returns {Plot} The calling Plot.
       */
  def attr[A](
    attr: java.lang.String,
    attrValue: A,
    scale: plottableLib.buildSrcScalesScaleMod.Scale[A, scala.Double | java.lang.String]
  ): this.type = js.native
  /**
       * Sets a particular attribute to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the attribute values when autoDomain()-ing.
       *
       * @param {string} attr
       * @param {A|Accessor<A>} attrValue
       * @param {Scale<A, number | string>} scale The Scale used to scale the attrValue.
       * @returns {Plot} The calling Plot.
       */
  def attr[A](
    attr: java.lang.String,
    attrValue: plottableLib.buildSrcCoreInterfacesMod.IAccessor[A],
    scale: plottableLib.buildSrcScalesScaleMod.Scale[A, scala.Double | java.lang.String]
  ): this.type = js.native
  def datasets(): js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset] = js.native
  def datasets(datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset]): this.type = js.native
  /**
       * Gets the Entities associated with the specified Datasets.
       *
       * @param {Dataset[]} datasets The Datasets to retrieve the Entities for.
       *   If not provided, returns defaults to all Datasets on the Plot.
       * @return {Plots.PlotEntity[]}
       */
  def entities(): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * Gets the Entities associated with the specified Datasets.
       *
       * @param {Dataset[]} datasets The Datasets to retrieve the Entities for.
       *   If not provided, returns defaults to all Datasets on the Plot.
       * @return {Plots.PlotEntity[]}
       */
  def entities(datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset]): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
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
  def entitiesAt(point: plottableLib.buildSrcCoreInterfacesMod.Point): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * @deprecated Use `entitiesInBounds` instead
       *
       * Gets the Entities that intersect the Bounds.
       *
       * @param {Bounds} bounds
       * @returns {PlotEntity[]}
       */
  def entitiesIn(bounds: plottableLib.buildSrcCoreInterfacesMod.Bounds): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * @deprecated Use `entitiesInBounds` instead
       *
       * Gets the Entities that intersect the area defined by the ranges.
       *
       * @param {Range} xRange
       * @param {Range} yRange
       * @returns {PlotEntity[]}
       */
  def entitiesIn(
    xRange: plottableLib.buildSrcCoreInterfacesMod.Range,
    yRange: plottableLib.buildSrcCoreInterfacesMod.Range
  ): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * Returns the entites whose bounding boxes overlap the parameter.
       *
       * `queryBounds` are in pixel space, measured from the origin of this plot.
       */
  def entitiesInBounds(queryBounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * Returns the entites whose bounding boxes overlap the `queryBounds`
       * parameter on the x-axis.
       *
       * `queryBounds` are in pixel space, measured from the origin of this plot.
       */
  def entitiesInXBounds(queryBounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * Returns the entites whose bounding boxes overlap the `queryBounds`
       * parameter on the y-axis.
       *
       * `queryBounds` are in pixel space, measured from the origin of this plot.
       */
  def entitiesInYBounds(queryBounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /**
       * Returns the {Plots.PlotEntity} nearest to the query point,
       * or undefined if no {Plots.PlotEntity} can be found.
       *
       * @param {Point} queryPoint
       * @returns {Plots.PlotEntity} The nearest PlotEntity, or undefined if no {Plots.PlotEntity} can be found.
       */
  def entityNearest(queryPoint: plottableLib.buildSrcCoreInterfacesMod.Point): plottableLib.buildSrcPlotsCommonsMod.IPlotEntity = js.native
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
  def filterEntities(
    where: js.Function2[
      /* entity */ plottableLib.buildSrcPlotsCommonsMod.ILightweightPlotEntity, 
      /* index */ scala.Double, 
      scala.Boolean
    ]
  ): js.Array[plottableLib.buildSrcPlotsCommonsMod.IPlotEntity] = js.native
  /* protected */ def getExtentsForAttr(attr: java.lang.String): js.Array[js.Array[_]] = js.native
  /**
       * Override in subclass to add special extents, such as included values
       */
  /* protected */ def getExtentsForProperty(property: java.lang.String): js.Array[js.Array[_]] = js.native
  /**
       * Removes a Dataset from the Plot.
       *
       * @param {Dataset} dataset
       * @returns {Plot} The calling Plot.
       */
  def removeDataset(dataset: plottableLib.buildSrcCoreDatasetMod.Dataset): this.type = js.native
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
  def selections(): plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_] = js.native
  /**
       * Retrieves the drawn visual elements for the specified Datasets as a d3 Selection.
       * Not supported on canvas renderer.
       *
       * @param {Dataset[]} [datasets] The Datasets to retrieve the Selections for.
       *   If not provided, Selections will be retrieved for all Datasets on the Plot.
       * @returns {d3.Selection}
       */
  def selections(datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset]): plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_] = js.native
}

@JSImport("plottable/build/src/plots/plot", "Plot")
@js.native
object Plot extends js.Object {
  var OPTIMIZE_MEMOIZE_PROJECTORS: scala.Boolean = js.native
  var _ANIMATION_MAX_DURATION: scala.Double = js.native
  /* protected */ def _scaledAccessor[D, R](binding: plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[D, R]): plottableLib.buildSrcCoreInterfacesMod.IAccessor[_] = js.native
  def applyDrawSteps(
    drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.DrawStep],
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset
  ): js.Array[plottableLib.buildSrcDrawersDrawStepMod.AppliedDrawStep] = js.native
  def getTotalDrawTime(data: js.Array[_], drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.DrawStep]): scala.Double = js.native
}

