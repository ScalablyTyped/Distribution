package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends js.Object {
  var Authorization: String
  var `Content-Type`: String
  var `User-Agent`: String
}

object Authorization {
  @scala.inline
  def apply(Authorization: String, `Content-Type`: String, `User-Agent`: String): Authorization = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

