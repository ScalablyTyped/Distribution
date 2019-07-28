package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(content_type = content_type, insecure_ssl = insecure_ssl, url = url)
  
    __obj.asInstanceOf[ReposUpdateHookResponseConfig]
  }
}

