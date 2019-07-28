package typings.physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Friction extends js.Object {
  var friction: Double
  var id: Double
  var restriction: Double
}

object Anon_Friction {
  @scala.inline
  def apply(friction: Double, id: Double, restriction: Double): Anon_Friction = {
    val __obj = js.Dynamic.literal(friction = friction, id = id, restriction = restriction)
  
    __obj.asInstanceOf[Anon_Friction]
  }
}

