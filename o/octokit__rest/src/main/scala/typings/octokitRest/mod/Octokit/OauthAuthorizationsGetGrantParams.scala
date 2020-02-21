package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetGrantParams extends js.Object {
  var grant_id: Double
}

object OauthAuthorizationsGetGrantParams {
  @scala.inline
  def apply(grant_id: Double): OauthAuthorizationsGetGrantParams = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OauthAuthorizationsGetGrantParams]
  }
}

