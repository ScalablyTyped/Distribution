package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.interactionNs.InteractionEvent
import typings.pixiDotJs.pixiDotJsStrings.added
import typings.pixiDotJs.pixiDotJsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Container")
@js.native
class Container () extends DisplayObject {
  // end extras.getChildByName
  var children: js.Array[DisplayObject] = js.native
  var height: Double = js.native
  var width: Double = js.native
  /* protected */ def _calculateBounds(): Unit = js.native
  /* protected */ def _renderCanvas(renderer: CanvasRenderer): Unit = js.native
  /* protected */ def _renderWebGL(renderer: WebGLRenderer): Unit = js.native
  def addChild[T /* <: DisplayObject */](children: T*): T = js.native
  def addChildAt[T /* <: DisplayObject */](child: T, index: Double): T = js.native
  def calculateBounds(): Unit = js.native
  /* protected */ def containerUpdateTransform(): Unit = js.native
  def destroy(options: Boolean): Unit = js.native
  def destroy(options: DestroyOptions): Unit = js.native
  def getChildAt[T /* <: DisplayObject */](index: Double): T = js.native
  // begin extras.getChildByName
  def getChildByName[T /* <: DisplayObject */](name: String): T = js.native
  def getChildIndex(child: DisplayObject): Double = js.native
  @JSName("off")
  def off_added(event: added): this.type = js.native
  @JSName("off")
  def off_added(event: added, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_added(event: added, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  @JSName("off")
  def off_removed(event: removed): this.type = js.native
  @JSName("off")
  def off_removed(event: removed, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_removed(event: removed, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  /* protected */ def onChildrenChange(args: js.Any*): Unit = js.native
  @JSName("on")
  def on_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  def removeChild[T /* <: DisplayObject */](child: DisplayObject): T = js.native
  def removeChildAt[T /* <: DisplayObject */](index: Double): T = js.native
  def removeChildren[T /* <: DisplayObject */](): js.Array[T] = js.native
  def removeChildren[T /* <: DisplayObject */](beginIndex: Double): js.Array[T] = js.native
  def removeChildren[T /* <: DisplayObject */](beginIndex: Double, endIndex: Double): js.Array[T] = js.native
  def renderAdvancedWebGL(renderer: WebGLRenderer): Unit = js.native
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}

