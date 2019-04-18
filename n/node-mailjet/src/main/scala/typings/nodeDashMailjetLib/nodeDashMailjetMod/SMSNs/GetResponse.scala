package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// responses
trait GetResponse extends js.Object {
  val body: GetResponseData
}

object GetResponse {
  @scala.inline
  def apply(body: GetResponseData): GetResponse = {
    val __obj = js.Dynamic.literal(body = body)
  
    __obj.asInstanceOf[GetResponse]
  }
}

