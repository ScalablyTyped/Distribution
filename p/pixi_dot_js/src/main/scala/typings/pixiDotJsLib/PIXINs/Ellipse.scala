package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Ellipse")
@js.native
class Ellipse () extends HitArea {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  var height: scala.Double = js.native
  var `type`: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /* CompleteClass */
  override def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def getBounds(): Rectangle = js.native
}

