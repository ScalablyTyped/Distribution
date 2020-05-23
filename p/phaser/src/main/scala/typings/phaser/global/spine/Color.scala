package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Color")
@js.native
class Color ()
  extends typings.phaser.spine.Color {
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
  override def setFromColor(c: typings.phaser.spine.Color): this.type = js.native
  /* CompleteClass */
  override def setFromString(hex: String): this.type = js.native
}

/* static members */
@JSGlobal("spine.Color")
@js.native
object Color extends js.Object {
  var BLUE: typings.phaser.spine.Color = js.native
  var GREEN: typings.phaser.spine.Color = js.native
  var MAGENTA: typings.phaser.spine.Color = js.native
  var RED: typings.phaser.spine.Color = js.native
  var WHITE: typings.phaser.spine.Color = js.native
  def rgb888ToColor(color: typings.phaser.spine.Color, value: Double): Unit = js.native
  def rgba8888ToColor(color: typings.phaser.spine.Color, value: Double): Unit = js.native
}

