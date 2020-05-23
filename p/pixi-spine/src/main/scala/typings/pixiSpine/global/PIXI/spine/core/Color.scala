package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Color")
@js.native
class Color ()
  extends typings.pixiSpine.PIXI.spine.core.Color {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  /* CompleteClass */
  override var a: Double = js.native
  /* CompleteClass */
  override var b: Double = js.native
  /* CompleteClass */
  override var g: Double = js.native
  /* CompleteClass */
  override var r: Double = js.native
  /* CompleteClass */
  override def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  /* CompleteClass */
  override def clamp(): this.type = js.native
  /* CompleteClass */
  override def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  /* CompleteClass */
  override def setFromColor(c: typings.pixiSpine.PIXI.spine.core.Color): this.type = js.native
  /* CompleteClass */
  override def setFromString(hex: String): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Color")
@js.native
object Color extends js.Object {
  var BLUE: typings.pixiSpine.PIXI.spine.core.Color = js.native
  var GREEN: typings.pixiSpine.PIXI.spine.core.Color = js.native
  var MAGENTA: typings.pixiSpine.PIXI.spine.core.Color = js.native
  var RED: typings.pixiSpine.PIXI.spine.core.Color = js.native
  var WHITE: typings.pixiSpine.PIXI.spine.core.Color = js.native
  def rgb888ToColor(color: typings.pixiSpine.PIXI.spine.core.Color, value: Double): Unit = js.native
  def rgba8888ToColor(color: typings.pixiSpine.PIXI.spine.core.Color, value: Double): Unit = js.native
}

