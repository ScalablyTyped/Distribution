package typings.atNivoCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animate extends js.Object {
  var animate: Boolean
  var motionDamping: Double
  var motionStiffness: Double
}

object Anon_Animate {
  @scala.inline
  def apply(animate: Boolean, motionDamping: Double, motionStiffness: Double): Anon_Animate = {
    val __obj = js.Dynamic.literal(animate = animate, motionDamping = motionDamping, motionStiffness = motionStiffness)
  
    __obj.asInstanceOf[Anon_Animate]
  }
}

