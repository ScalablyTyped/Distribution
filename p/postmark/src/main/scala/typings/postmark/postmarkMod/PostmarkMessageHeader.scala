package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkMessageHeader extends js.Object {
  var Name: String
  var Value: String
}

object PostmarkMessageHeader {
  @scala.inline
  def apply(Name: String, Value: String): PostmarkMessageHeader = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[PostmarkMessageHeader]
  }
}

