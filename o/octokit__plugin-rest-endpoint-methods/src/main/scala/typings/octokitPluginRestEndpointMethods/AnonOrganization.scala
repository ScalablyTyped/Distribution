package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrganization extends js.Object {
  var organization: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonOrganization {
  @scala.inline
  def apply(organization: AnonType, owner: AnonRequired, repo: AnonRequired): AnonOrganization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrganization]
  }
}

