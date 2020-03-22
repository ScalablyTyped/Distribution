package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitignoreGetTemplateResponse extends js.Object {
  var name: String
  var source: String
}

object GitignoreGetTemplateResponse {
  @scala.inline
  def apply(name: String, source: String): GitignoreGetTemplateResponse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitignoreGetTemplateResponse]
  }
}

