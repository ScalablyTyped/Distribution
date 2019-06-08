package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookResponseConfig extends js.Object {
  var content_type: java.lang.String
  var insecure_ssl: java.lang.String
  var url: java.lang.String
}

object ReposCreateHookResponseConfig {
  @scala.inline
  def apply(content_type: java.lang.String, insecure_ssl: java.lang.String, url: java.lang.String): ReposCreateHookResponseConfig = {
    val __obj = js.Dynamic.literal(content_type = content_type, insecure_ssl = insecure_ssl, url = url)
  
    __obj.asInstanceOf[ReposCreateHookResponseConfig]
  }
}

