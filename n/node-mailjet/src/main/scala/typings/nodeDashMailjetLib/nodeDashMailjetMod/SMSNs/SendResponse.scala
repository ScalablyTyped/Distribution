package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendResponse extends js.Object {
  val body: PostResponseData
  val url: java.lang.String
}

object SendResponse {
  @scala.inline
  def apply(body: PostResponseData, url: java.lang.String): SendResponse = {
    val __obj = js.Dynamic.literal(body = body, url = url)
  
    __obj.asInstanceOf[SendResponse]
  }
}

