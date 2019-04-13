package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteInvitationParams extends js.Object {
  var invitation_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposDeleteInvitationParams {
  @scala.inline
  def apply(invitation_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposDeleteInvitationParams = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteInvitationParams]
  }
}

