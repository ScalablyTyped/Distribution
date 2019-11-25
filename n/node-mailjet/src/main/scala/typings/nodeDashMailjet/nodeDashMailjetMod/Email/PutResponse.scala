package typings.nodeDashMailjet.nodeDashMailjetMod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResponse extends js.Object {
  val body: PutResponseData
}

object PutResponse {
  @scala.inline
  def apply(body: PutResponseData): PutResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutResponse]
  }
}

