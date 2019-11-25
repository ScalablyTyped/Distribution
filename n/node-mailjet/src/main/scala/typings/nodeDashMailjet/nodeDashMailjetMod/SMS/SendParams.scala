package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendParams extends js.Object {
  var From: String
  var Text: String
  var To: String
}

object SendParams {
  @scala.inline
  def apply(From: String, Text: String, To: String): SendParams = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendParams]
  }
}

