package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetPublicKeyParams extends js.Object {
  var key_id: Double
}

object UsersGetPublicKeyParams {
  @scala.inline
  def apply(key_id: Double): UsersGetPublicKeyParams = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersGetPublicKeyParams]
  }
}

