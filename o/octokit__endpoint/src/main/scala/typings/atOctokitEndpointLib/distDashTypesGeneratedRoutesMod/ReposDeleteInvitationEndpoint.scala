package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteInvitationEndpoint extends js.Object {
  var invitation_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposDeleteInvitationEndpoint {
  @scala.inline
  def apply(invitation_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteInvitationEndpoint]
  }
}

