package typings
package atNivoCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animate extends js.Object {
  var animate: scala.Boolean
  var motionDamping: scala.Double
  var motionStiffness: scala.Double
}

object Anon_Animate {
  @scala.inline
  def apply(animate: scala.Boolean, motionDamping: scala.Double, motionStiffness: scala.Double): Anon_Animate = {
    val __obj = js.Dynamic.literal(animate = animate, motionDamping = motionDamping, motionStiffness = motionStiffness)
  
    __obj.asInstanceOf[Anon_Animate]
  }
}

