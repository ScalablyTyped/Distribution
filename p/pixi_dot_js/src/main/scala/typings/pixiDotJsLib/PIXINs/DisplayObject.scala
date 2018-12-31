package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.DisplayObject")
@js.native
class DisplayObject ()
  extends pixiDotJsLib.PIXINs.utilsNs.EventEmitter
     with pixiDotJsLib.PIXINs.interactionNs.InteractiveTarget
     with pixiDotJsLib.PIXINs.accessibilityNs.AccessibleTarget {
  var _bounds: Bounds = js.native
  var _boundsID: scala.Double = js.native
  var _boundsRect: Rectangle = js.native
  // begin extras.cacheAsBitmap
  var _cacheAsBitmap: scala.Boolean = js.native
  var _cacheData: scala.Boolean = js.native
  val _destroyed: scala.Boolean = js.native
  var _enabledFilters: js.Array[Filter[_]] | scala.Null = js.native
  var _filters: js.Array[Filter[_]] | scala.Null = js.native
  var _lastBoundsID: scala.Double = js.native
  var _localBoundsRect: Rectangle = js.native
  var _mask: Graphics | Sprite | scala.Null = js.native
  /* CompleteClass */
  override var accessible: scala.Boolean = js.native
  /* CompleteClass */
  override var accessibleHint: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override var accessibleTitle: java.lang.String | scala.Null = js.native
  var alpha: scala.Double = js.native
  /* CompleteClass */
  override var buttonMode: scala.Boolean = js.native
  var cacheAsBitmap: scala.Boolean = js.native
  /* CompleteClass */
  override var cursor: java.lang.String = js.native
  // Deprecated
  /* CompleteClass */
  override var defaultCursor: java.lang.String = js.native
  var filterArea: Rectangle | scala.Null = js.native
  var filters: js.Array[Filter[_]] | scala.Null = js.native
  /* CompleteClass */
  override var hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle | HitArea = js.native
  /* CompleteClass */
  override var interactive: scala.Boolean = js.native
  /* CompleteClass */
  override var interactiveChildren: scala.Boolean = js.native
  var localTransform: Matrix = js.native
  var mask: Graphics | Sprite | scala.Null = js.native
  // end extras.cacheAsBitmap
  // begin extras.getChildByName
  var name: java.lang.String | scala.Null = js.native
  var parent: Container = js.native
  var pivot: Point | ObservablePoint = js.native
  var position: Point | ObservablePoint = js.native
  var renderable: scala.Boolean = js.native
  var rotation: scala.Double = js.native
  var scale: Point | ObservablePoint = js.native
  var skew: ObservablePoint = js.native
  /* CompleteClass */
  override var tabIndex: scala.Double = js.native
  /* CompleteClass */
  override var trackedPointers: org.scalablytyped.runtime.NumberDictionary[pixiDotJsLib.PIXINs.interactionNs.InteractionTrackingData] = js.native
  // end interactive target
  var transform: TransformBase = js.native
  var visible: scala.Boolean = js.native
  var worldAlpha: scala.Double = js.native
  var worldTransform: Matrix = js.native
  var worldVisible: scala.Boolean = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /* protected */ def _cacheAsBitmapDestroy(options: js.Any): scala.Unit = js.native
  /* protected */ def _cacheAsBitmapDestroy(options: scala.Boolean): scala.Unit = js.native
  /* protected */ def _calculateCachedBounds(): Rectangle = js.native
  /* protected */ def _destroyCachedDisplayObject(): scala.Unit = js.native
  /* protected */ def _getCachedLocalBounds(): Rectangle = js.native
  /* protected */ def _initCachedDisplayObject(renderer: WebGLRenderer): scala.Unit = js.native
  /* protected */ def _initCachedDisplayObjectCanvas(renderer: CanvasRenderer): scala.Unit = js.native
  /* protected */ def _recursivePostUpdateTransform(): scala.Unit = js.native
  /* protected */ def _renderCachedCanvas(renderer: CanvasRenderer): scala.Unit = js.native
  /* protected */ def _renderCachedWebGL(renderer: WebGLRenderer): scala.Unit = js.native
  def addListener(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  def addListener(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def destroy(): scala.Unit = js.native
  /* protected */ def displayObjectUpdateTransform(): scala.Unit = js.native
  def getBounds(): Rectangle = js.native
  def getBounds(skipUpdate: scala.Boolean): Rectangle = js.native
  def getBounds(skipUpdate: scala.Boolean, rect: Rectangle): Rectangle = js.native
  // end extras.getChildByName
  // begin extras.getGlobalPosition
  def getGlobalPosition(): Point = js.native
  def getGlobalPosition(point: Point): Point = js.native
  def getGlobalPosition(point: Point, skipUpdate: scala.Boolean): Point = js.native
  def getLocalBounds(): Rectangle = js.native
  def getLocalBounds(rect: Rectangle): Rectangle = js.native
  def off(event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes): this.type = js.native
  def off(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  def off(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def on(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  def on(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def once(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  def once(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def removeAllListeners(event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes): this.type = js.native
  def removeListener(event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes): this.type = js.native
  def removeListener(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  def removeListener(
    event: pixiDotJsLib.PIXINs.interactionNs.InteractionEventTypes,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def renderCanvas(renderer: CanvasRenderer): scala.Unit = js.native
  def renderWebGL(renderer: WebGLRenderer): scala.Unit = js.native
  def setParent(container: Container): Container = js.native
  def setTransform(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    scaleX: js.UndefOr[scala.Double],
    scaleY: js.UndefOr[scala.Double],
    rotation: js.UndefOr[scala.Double],
    skewX: js.UndefOr[scala.Double],
    skewY: js.UndefOr[scala.Double],
    pivotX: js.UndefOr[scala.Double],
    pivotY: js.UndefOr[scala.Double]
  ): DisplayObject = js.native
  //creates and returns a new point
  def toGlobal(position: PointLike): Point = js.native
  def toGlobal[T /* <: PointLike */](position: PointLike, point: T): T = js.native
  def toGlobal[T /* <: PointLike */](position: PointLike, point: T, skipUpdate: scala.Boolean): T = js.native
  //modifies the x and y of the passed point and returns it
  @JSName("toGlobal")
  def toGlobal_TPointLikeT[T /* <: PointLike */](position: PointLike): T = js.native
  //creates and returns a new point
  def toLocal(position: PointLike): Point = js.native
  def toLocal(position: PointLike, from: DisplayObject): Point = js.native
  def toLocal[T /* <: PointLike */](position: PointLike, from: DisplayObject, point: T): T = js.native
  def toLocal[T /* <: PointLike */](position: PointLike, from: DisplayObject, point: T, skipUpdate: scala.Boolean): T = js.native
  //modifies the x and y of the passed point and returns it
  @JSName("toLocal")
  def toLocal_TPointLikeT[T /* <: PointLike */](position: PointLike): T = js.native
  @JSName("toLocal")
  def toLocal_TPointLikeT[T /* <: PointLike */](position: PointLike, from: DisplayObject): T = js.native
  def updateTransform(): scala.Unit = js.native
}

