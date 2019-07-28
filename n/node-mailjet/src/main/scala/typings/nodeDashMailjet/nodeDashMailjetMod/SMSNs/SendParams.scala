package typings.nodeDashMailjet.nodeDashMailjetMod.SMSNs

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
    val __obj = js.Dynamic.literal(From = From, Text = Text, To = To)
  
    __obj.asInstanceOf[SendParams]
  }
}

