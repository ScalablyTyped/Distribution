package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDotJs.PIXINs.accessibilityNs.AccessibleTarget
import typings.pixiDotJs.PIXINs.interactionNs.InteractionEvent
import typings.pixiDotJs.PIXINs.interactionNs.InteractionEventTypes
import typings.pixiDotJs.PIXINs.interactionNs.InteractionTrackingData
import typings.pixiDotJs.PIXINs.interactionNs.InteractiveTarget
import typings.pixiDotJs.PIXINs.utilsNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all objects that are rendered on the screen.
  * This is an abstract class and should not be used on its own rather it should be extended.
  */
@JSGlobal("PIXI.DisplayObject")
@js.native
class DisplayObject ()
  extends EventEmitter
     with InteractiveTarget
     with AccessibleTarget {
  var _bounds: Bounds = js.native
  var _boundsID: Double = js.native
  var _boundsRect: Rectangle = js.native
  // begin extras.cacheAsBitmap
  var _cacheAsBitmap: Boolean = js.native
  var _cacheData: Boolean = js.native
  val _destroyed: Boolean = js.native
  var _enabledFilters: js.Array[Filter[_]] | Null = js.native
  var _filters: js.Array[Filter[_]] | Null = js.native
  var _lastBoundsID: Double = js.native
  var _localBoundsRect: Rectangle = js.native
  var _mask: Graphics | Sprite | Null = js.native
  /* CompleteClass */
  override var accessible: Boolean = js.native
  /* CompleteClass */
  override var accessibleHint: String | Null = js.native
  /* CompleteClass */
  override var accessibleTitle: String | Null = js.native
  var alpha: Double = js.native
  /**
    * If enabled, the mouse cursor use the pointer behavior when hovered over the displayObject if it is interactive
    * Setting this changes the "cursor" property to `"pointer"`.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.buttonMode = true;
    */
  /* CompleteClass */
  override var buttonMode: Boolean = js.native
  /**
    * Set this to true if you want this display object to be cached as a bitmap.
    * This basically takes a snap shot of the display object as it is at that moment. It can
    * provide a performance benefit for complex static displayObjects.
    * To remove simply set this property to "false"
    *
    * IMPORTANT GOTCHA - make sure that all your textures are preloaded BEFORE setting this property to true
    * as it will take a snapshot of what is currently there. If the textures have not loaded then they will not appear.
    */
  var cacheAsBitmap: Boolean = js.native
  /**
    * This defines what cursor mode is used when the mouse cursor
    * is hovered over the displayObject.
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.cursor = "wait";
    * @see https://developer.mozilla.org/en/docs/Web/CSS/cursor
    */
  /* CompleteClass */
  override var cursor: String = js.native
  /** @deprecated */
  /* CompleteClass */
  override var defaultCursor: String = js.native
  var filterArea: Rectangle | Null = js.native
  var filters: js.Array[Filter[_]] | Null = js.native
  /**
    * Interaction shape. Children will be hit first, then this shape will be checked.
    * Setting this will cause this shape to be checked in hit tests rather than the displayObject"s bounds.
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.hitArea = new PIXI.Rectangle(0, 0, 100, 100);
    */
  /* CompleteClass */
  override var hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle | HitArea = js.native
  /**
    * Enable interaction events for the DisplayObject. Touch, pointer and mouse
    * events will not be emitted unless `interactive` is set to `true`.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.on("tap", (event) => {
    *    //handle event
    * });
    */
  /* CompleteClass */
  override var interactive: Boolean = js.native
  /**
    * Determines if the children to the displayObject can be clicked/touched
    * Setting this to false allows PixiJS to bypass a recursive `hitTest` function
    */
  /* CompleteClass */
  override var interactiveChildren: Boolean = js.native
  var localTransform: Matrix = js.native
  var mask: Graphics | Sprite | Null = js.native
  // end extras.cacheAsBitmap
  // begin extras.getChildByName
  /**
    * The instance name of the object.
    */
  var name: String | Null = js.native
  var parent: Container = js.native
  var pivot: Point | ObservablePoint = js.native
  var position: Point | ObservablePoint = js.native
  var renderable: Boolean = js.native
  var rotation: Double = js.native
  var scale: Point | ObservablePoint = js.native
  var skew: ObservablePoint = js.native
  /* CompleteClass */
  override var tabIndex: Double = js.native
  /* CompleteClass */
  override var trackedPointers: NumberDictionary[InteractionTrackingData] = js.native
  // end interactive target
  var transform: TransformBase = js.native
  var visible: Boolean = js.native
  var worldAlpha: Double = js.native
  var worldTransform: Matrix = js.native
  var worldVisible: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
  /* protected */ def _cacheAsBitmapDestroy(options: js.Any): Unit = js.native
  /* protected */ def _cacheAsBitmapDestroy(options: Boolean): Unit = js.native
  /* protected */ def _calculateCachedBounds(): Rectangle = js.native
  /* protected */ def _destroyCachedDisplayObject(): Unit = js.native
  /* protected */ def _getCachedLocalBounds(): Rectangle = js.native
  /* protected */ def _initCachedDisplayObject(renderer: WebGLRenderer): Unit = js.native
  /* protected */ def _initCachedDisplayObjectCanvas(renderer: CanvasRenderer): Unit = js.native
  /**
    * recursively updates transform of all objects from the root to this one
    * internal function for toLocal()
    */
  /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
  /* protected */ def _renderCachedCanvas(renderer: CanvasRenderer): Unit = js.native
  /* protected */ def _renderCachedWebGL(renderer: WebGLRenderer): Unit = js.native
  def addListener(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def addListener(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  /**
    * Base destroy method for generic display objects. This will automatically
    * remove the display object from its parent Container as well as remove
    * all current event listeners and internal references. Do not use a DisplayObject
    * after calling `destroy`.
    */
  def destroy(): Unit = js.native
  /* protected */ def displayObjectUpdateTransform(): Unit = js.native
  /**
    * Retrieves the bounds of the displayObject as a rectangle object.
    *
    * @param skipUpdate - setting to true will stop the transforms of the scene graph from
    *  being updated. This means the calculation returned MAY be out of date BUT will give you a
    *  nice performance boost
    * @param rect - Optional rectangle to store the result of the bounds calculation
    * @return the rectangular bounding area
    */
  def getBounds(): Rectangle = js.native
  def getBounds(skipUpdate: Boolean): Rectangle = js.native
  def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
  // end extras.getChildByName
  // begin extras.getGlobalPosition
  /**
    * Returns the global position of the displayObject. Does not depend on object scale, rotation and pivot.
    *
    * @param point - the point to write the global value to. If null a new point will be returned
    * @param skipUpdate - setting to true will stop the transforms of the scene graph from
    *  being updated. This means the calculation returned MAY be out of date BUT will give you a
    *  nice performance boost
    * @return The updated point
    */
  def getGlobalPosition(): Point = js.native
  def getGlobalPosition(point: Point): Point = js.native
  def getGlobalPosition(point: Point, skipUpdate: Boolean): Point = js.native
  /**
    * Retrieves the local bounds of the displayObject as a rectangle object
    *
    * @param [rect] - Optional rectangle to store the result of the bounds calculation
    * @return the rectangular bounding area
    */
  def getLocalBounds(): Rectangle = js.native
  def getLocalBounds(rect: Rectangle): Rectangle = js.native
  def off(event: InteractionEventTypes): this.type = js.native
  def off(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def off(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def on(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def on(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def once(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def once(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def removeAllListeners(event: InteractionEventTypes): this.type = js.native
  def removeListener(event: InteractionEventTypes): this.type = js.native
  def removeListener(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def removeListener(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def renderCanvas(renderer: CanvasRenderer): Unit = js.native
  /**
    * Renders the object using the WebGL renderer
    *
    * @param renderer - The renderer
    */
  def renderWebGL(renderer: WebGLRenderer): Unit = js.native
  def setParent(container: Container): Container = js.native
  /**
    * Convenience function to set the position, scale, skew and pivot at once.
    *
    * @param [x=0] - The X position
    * @param [y=0] - The Y position
    * @param [scaleX=1] - The X scale value
    * @param [scaleY=1] - The Y scale value
    * @param [rotation=0] - The rotation
    * @param [skewX=0] - The X skew value
    * @param [skewY=0] - The Y skew value
    * @param [pivotX=0] - The X pivot value
    * @param [pivotY=0] - The Y pivot value
    * @return The DisplayObject instance
    */
  def setTransform(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    scaleX: js.UndefOr[Double],
    scaleY: js.UndefOr[Double],
    rotation: js.UndefOr[Double],
    skewX: js.UndefOr[Double],
    skewY: js.UndefOr[Double],
    pivotX: js.UndefOr[Double],
    pivotY: js.UndefOr[Double]
  ): DisplayObject = js.native
  /**
    * Calculates the global position of the display object
    *
    * @param position - The world origin to calculate from
    * @param [point] - A Point object in which to store the value, optional
    *  (otherwise will create a new Point)
    * @param [skipUpdate=false] - Should we skip the update transform.
    * @return A point object representing the position of this object
    */
  def toGlobal(position: PointLike): Point = js.native
  def toGlobal[T /* <: PointLike */](position: PointLike, point: T): T = js.native
  def toGlobal[T /* <: PointLike */](position: PointLike, point: T, skipUpdate: Boolean): T = js.native
  /**
    * Calculates the global position of the display object
    *
    * @param position - The world origin to calculate from
    * @param [point] - A Point object in which to store the value, optional
    *  (otherwise will create a new Point)
    * @param [skipUpdate=false] - Should we skip the update transform.
    * @return A point object representing the position of this object
    */
  @JSName("toGlobal")
  def toGlobal_T_PointLike_T[T /* <: PointLike */](position: PointLike): T = js.native
  //creates and returns a new point
  def toLocal(position: PointLike): Point = js.native
  def toLocal(position: PointLike, from: DisplayObject): Point = js.native
  def toLocal[T /* <: PointLike */](position: PointLike, from: DisplayObject, point: T): T = js.native
  def toLocal[T /* <: PointLike */](position: PointLike, from: DisplayObject, point: T, skipUpdate: Boolean): T = js.native
  /**
    * Calculates the local position of the display object relative to another point
    *
    * @param position - The world origin to calculate from
    * @param [from] - The DisplayObject to calculate the global position from
    * @param [point] - A Point object in which to store the value, optional
    *  (otherwise will create a new Point)
    * @param [skipUpdate=false] - Should we skip the update transform
    * @return A point object representing the position of this object
    */
  @JSName("toLocal")
  def toLocal_T_PointLike_T[T /* <: PointLike */](position: PointLike): T = js.native
  @JSName("toLocal")
  def toLocal_T_PointLike_T[T /* <: PointLike */](position: PointLike, from: DisplayObject): T = js.native
  /**
    * Updates the object transform for rendering
    *
    * TODO - Optimization pass!
    */
  def updateTransform(): Unit = js.native
}

