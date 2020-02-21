package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetTemplate extends js.Object {
  var getTemplate: AnonMethodParamsUrlAnonNameAnonRequired
  var listTemplates: AnonMethodParamsUrlString
}

object AnonGetTemplate {
  @scala.inline
  def apply(getTemplate: AnonMethodParamsUrlAnonNameAnonRequired, listTemplates: AnonMethodParamsUrlString): AnonGetTemplate = {
    val __obj = js.Dynamic.literal(getTemplate = getTemplate.asInstanceOf[js.Any], listTemplates = listTemplates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetTemplate]
  }
}

