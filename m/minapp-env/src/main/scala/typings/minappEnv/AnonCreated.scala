package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated extends js.Object {
  var created: Double
  var updated: Double
}

object AnonCreated {
  @scala.inline
  def apply(created: Double, updated: Double): AnonCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreated]
  }
}

