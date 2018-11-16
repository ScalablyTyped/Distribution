package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Circle")
@js.native
class Circle () extends HitArea {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, radius: scala.Double) = this()
  var radius: scala.Double = js.native
  var `type`: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  /* CompleteClass */
  override def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def getBounds(): Rectangle = js.native
}

