package typings
package olLib.kineticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Kinetic", JSImport.Default)
@js.native
class default protected () extends Kinetic {
  def this(decay: scala.Double, minVelocity: scala.Double, delay: scala.Double) = this()
  /* CompleteClass */
  override def begin(): scala.Unit = js.native
  /* CompleteClass */
  override def end(): scala.Boolean = js.native
  /* CompleteClass */
  override def getAngle(): scala.Double = js.native
  /* CompleteClass */
  override def getDistance(): scala.Double = js.native
  /* CompleteClass */
  override def update(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

