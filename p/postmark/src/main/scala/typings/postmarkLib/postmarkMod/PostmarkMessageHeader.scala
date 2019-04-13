package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkMessageHeader extends js.Object {
  var Name: java.lang.String
  var Value: java.lang.String
}

object PostmarkMessageHeader {
  @scala.inline
  def apply(Name: java.lang.String, Value: java.lang.String): PostmarkMessageHeader = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[PostmarkMessageHeader]
  }
}

