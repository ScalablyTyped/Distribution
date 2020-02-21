package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAffiliation extends js.Object {
  var affiliation: AnonEnum
  var page: AnonType
  var per_page: AnonType
  var project_id: AnonRequired
}

object AnonAffiliation {
  @scala.inline
  def apply(affiliation: AnonEnum, page: AnonType, per_page: AnonType, project_id: AnonRequired): AnonAffiliation = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAffiliation]
  }
}

