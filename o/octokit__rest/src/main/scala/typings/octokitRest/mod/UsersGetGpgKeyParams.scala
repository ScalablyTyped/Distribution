package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetGpgKeyParams extends js.Object {
  var gpg_key_id: Double
}

object UsersGetGpgKeyParams {
  @scala.inline
  def apply(gpg_key_id: Double): UsersGetGpgKeyParams = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersGetGpgKeyParams]
  }
}

