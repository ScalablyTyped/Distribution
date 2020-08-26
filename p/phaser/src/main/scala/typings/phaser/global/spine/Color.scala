package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Color")
@js.native
class Color ()
  extends typings.phaser.spine.Color {
  def this(r: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(
    r: js.UndefOr[scala.Nothing],
    g: js.UndefOr[scala.Nothing],
    b: js.UndefOr[scala.Nothing],
    a: Double
  ) = this()
  def this(r: js.UndefOr[scala.Nothing], g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: js.UndefOr[scala.Nothing], g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: Double, g: js.UndefOr[scala.Nothing], b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: js.UndefOr[scala.Nothing], a: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
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

