package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddMemberLegacyResponseErrorsItem extends js.Object {
  var code: String
  var field: String
  var resource: String
}

object TeamsAddMemberLegacyResponseErrorsItem {
  @scala.inline
  def apply(code: String, field: String, resource: String): TeamsAddMemberLegacyResponseErrorsItem = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddMemberLegacyResponseErrorsItem]
  }
}

