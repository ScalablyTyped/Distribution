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
  /* CompleteClass */
  override var buttonMode: Boolean = js.native
  var cacheAsBitmap: Boolean = js.native
  /* CompleteClass */
  override var cursor: String = js.native
  // Deprecated
  /* CompleteClass */
  override var defaultCursor: String = js.native
  var filterArea: Rectangle | Null = js.native
  var filters: js.Array[Filter[_]] | Null = js.native
  /* CompleteClass */
  override var hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle | HitArea = js.native
  /* CompleteClass */
  override var interactive: Boolean = js.native
  /* CompleteClass */
  override var interactiveChildren: Boolean = js.native
  var localTransform: Matrix = js.native
  var mask: Graphics | Sprite | Null = js.native
  // end extras.cacheAsBitmap
  // begin extras.getChildByName
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
  /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
  /* protected */ def _renderCachedCanvas(renderer: CanvasRenderer): Unit = js.native
  /* protected */ def _renderCachedWebGL(renderer: WebGLRenderer): Unit = js.native
  def addListener(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def addListener(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def destroy(): Unit = js.native
  /* protected */ def displayObjectUpdateTransform(): Unit = js.native
  def getBounds(): Rectangle = js.native
  def getBounds(skipUpdate: Boolean): Rectangle = js.native
  def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
  // end extras.getChildByName
  // begin extras.getGlobalPosition
  def getGlobalPosition(): Point = js.native
  def getGlobalPosition(point: Point): Point = js.native
  def getGlobalPosition(point: Point, skipUpdate: Boolean): Point = js.native
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
  def renderWebGL(renderer: WebGLRenderer): Unit = js.native
  def setParent(container: Container): Container = js.native
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
  //creates and returns a new point
  def toGlobal(position: PointLike): Point = js.native
  def toGlobal[T /* <: PointLike */](position: PointLike, point: T): T = js.native
  def toGlobal[T /* <: PointLike */](position: PointLike, point: T, skipUpdate: Boolean): T = js.native
  //modifies the x and y of the passed point and returns it
  @JSName("toGlobal")
  def toGlobal_T_PointLike_T[T /* <: PointLike */](position: PointLike): T = js.native
  //creates and returns a new point
  def toLocal(position: PointLike): Point = js.native
  def toLocal(position: PointLike, from: DisplayObject): Point = js.native
  def toLocal[T /* <: PointLike */](position: PointLike, from: DisplayObject, point: T): T = js.native
  def toLocal[T /* <: PointLike */](position: PointLike, from: DisplayObject, point: T, skipUpdate: Boolean): T = js.native
  //modifies the x and y of the passed point and returns it
  @JSName("toLocal")
  def toLocal_T_PointLike_T[T /* <: PointLike */](position: PointLike): T = js.native
  @JSName("toLocal")
  def toLocal_T_PointLike_T[T /* <: PointLike */](position: PointLike, from: DisplayObject): T = js.native
  def updateTransform(): Unit = js.native
}

