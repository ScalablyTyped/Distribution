package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToSetOperators[Type] extends js.Object {
  @JSName("$each")
  var $each: Type
}

object AddToSetOperators {
  @scala.inline
  def apply[Type]($each: Type): AddToSetOperators[Type] = {
    val __obj = js.Dynamic.literal($each = $each.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddToSetOperators[Type]]
  }
}

