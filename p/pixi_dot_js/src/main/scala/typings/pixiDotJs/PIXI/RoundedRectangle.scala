package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.RoundedRectangle")
@js.native
class RoundedRectangle () extends HitArea {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double, radius: Double) = this()
  var height: Double = js.native
  var radius: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
}

