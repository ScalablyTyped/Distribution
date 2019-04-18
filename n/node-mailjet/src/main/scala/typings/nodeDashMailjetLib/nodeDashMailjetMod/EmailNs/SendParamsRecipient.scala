package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// other types
trait SendParamsRecipient extends js.Object {
  var Email: java.lang.String
  var Name: java.lang.String
}

object SendParamsRecipient {
  @scala.inline
  def apply(Email: java.lang.String, Name: java.lang.String): SendParamsRecipient = {
    val __obj = js.Dynamic.literal(Email = Email, Name = Name)
  
    __obj.asInstanceOf[SendParamsRecipient]
  }
}

