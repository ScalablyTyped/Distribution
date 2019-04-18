package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendParams extends js.Object {
  var From: java.lang.String
  var Text: java.lang.String
  var To: java.lang.String
}

object SendParams {
  @scala.inline
  def apply(From: java.lang.String, Text: java.lang.String, To: java.lang.String): SendParams = {
    val __obj = js.Dynamic.literal(From = From, Text = Text, To = To)
  
    __obj.asInstanceOf[SendParams]
  }
}

