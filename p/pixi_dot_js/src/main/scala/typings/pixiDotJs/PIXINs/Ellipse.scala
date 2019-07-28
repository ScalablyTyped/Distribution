package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Ellipse")
@js.native
class Ellipse () extends HitArea {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, halfWidth: Double) = this()
  def this(x: Double, y: Double, halfWidth: Double, halfHeight: Double) = this()
  var height: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}

