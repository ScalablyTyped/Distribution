package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Container")
@js.native
class Container () extends DisplayObject {
  // end extras.getChildByName
  var children: js.Array[DisplayObject] = js.native
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  /* protected */ def _calculateBounds(): scala.Unit = js.native
  /* protected */ def _renderCanvas(renderer: CanvasRenderer): scala.Unit = js.native
  /* protected */ def _renderWebGL(renderer: WebGLRenderer): scala.Unit = js.native
  def addChild[T /* <: DisplayObject */](children: T*): T = js.native
  def addChildAt[T /* <: DisplayObject */](child: T, index: scala.Double): T = js.native
  def calculateBounds(): scala.Unit = js.native
  /* protected */ def containerUpdateTransform(): scala.Unit = js.native
  def destroy(options: DestroyOptions): scala.Unit = js.native
  def destroy(options: scala.Boolean): scala.Unit = js.native
  def getChildAt[T /* <: DisplayObject */](index: scala.Double): T = js.native
  // begin extras.getChildByName
  def getChildByName[T /* <: DisplayObject */](name: java.lang.String): T = js.native
  def getChildIndex(child: DisplayObject): scala.Double = js.native
  @JSName("off")
  def off_added(event: pixiDotJsLib.pixiDotJsLibStrings.added): this.type = js.native
  @JSName("off")
  def off_added(event: pixiDotJsLib.pixiDotJsLibStrings.added, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_added(
    event: pixiDotJsLib.pixiDotJsLibStrings.added,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  @JSName("off")
  def off_removed(event: pixiDotJsLib.pixiDotJsLibStrings.removed): this.type = js.native
  @JSName("off")
  def off_removed(event: pixiDotJsLib.pixiDotJsLibStrings.removed, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_removed(
    event: pixiDotJsLib.pixiDotJsLibStrings.removed,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): this.type = js.native
  /* protected */ def onChildrenChange(args: js.Any*): scala.Unit = js.native
  @JSName("on")
  def on_added(
    event: pixiDotJsLib.pixiDotJsLibStrings.added,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_added(
    event: pixiDotJsLib.pixiDotJsLibStrings.added,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("on")
  def on_removed(
    event: pixiDotJsLib.pixiDotJsLibStrings.removed,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_removed(
    event: pixiDotJsLib.pixiDotJsLibStrings.removed,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_added(
    event: pixiDotJsLib.pixiDotJsLibStrings.added,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_added(
    event: pixiDotJsLib.pixiDotJsLibStrings.added,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  @JSName("once")
  def once_removed(
    event: pixiDotJsLib.pixiDotJsLibStrings.removed,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_removed(
    event: pixiDotJsLib.pixiDotJsLibStrings.removed,
    fn: js.Function1[/* event */ pixiDotJsLib.PIXINs.interactionNs.InteractionEvent, scala.Unit],
    context: js.Any
  ): this.type = js.native
  def removeChild[T /* <: DisplayObject */](child: DisplayObject): T = js.native
  def removeChildAt[T /* <: DisplayObject */](index: scala.Double): T = js.native
  def removeChildren[T /* <: DisplayObject */](): js.Array[T] = js.native
  def removeChildren[T /* <: DisplayObject */](beginIndex: scala.Double): js.Array[T] = js.native
  def removeChildren[T /* <: DisplayObject */](beginIndex: scala.Double, endIndex: scala.Double): js.Array[T] = js.native
  def renderAdvancedWebGL(renderer: WebGLRenderer): scala.Unit = js.native
  def setChildIndex(child: DisplayObject, index: scala.Double): scala.Unit = js.native
  def swapChildren(child: DisplayObject, child2: DisplayObject): scala.Unit = js.native
}

