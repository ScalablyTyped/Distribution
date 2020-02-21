package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookResponseConfig extends js.Object {
  var content_type: String
  var insecure_ssl: String
  var url: String
}

object ReposUpdateHookResponseConfig {
  @scala.inline
  def apply(content_type: String, insecure_ssl: String, url: String): ReposUpdateHookResponseConfig = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], insecure_ssl = insecure_ssl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateHookResponseConfig]
  }
}

