package typings.ol.kineticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Kinetic", JSImport.Default)
@js.native
class default protected () extends Kinetic {
  def this(decay: Double, minVelocity: Double, delay: Double) = this()
  /* CompleteClass */
  override def begin(): Unit = js.native
  /* CompleteClass */
  override def end(): Boolean = js.native
  /* CompleteClass */
  override def getAngle(): Double = js.native
  /* CompleteClass */
  override def getDistance(): Double = js.native
  /* CompleteClass */
  override def update(x: Double, y: Double): Unit = js.native
}

