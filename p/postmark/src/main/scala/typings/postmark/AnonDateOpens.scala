package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateOpens extends js.Object {
  var Date: String
  var Opens: Double
  var Unique: Double
}

object AnonDateOpens {
  @scala.inline
  def apply(Date: String, Opens: Double, Unique: Double): AnonDateOpens = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateOpens]
  }
}

