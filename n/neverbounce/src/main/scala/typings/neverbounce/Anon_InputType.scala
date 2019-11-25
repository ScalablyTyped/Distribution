package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputType extends js.Object {
  var inputType: Anon_Remote
  var status: Anon_Complete
}

object Anon_InputType {
  @scala.inline
  def apply(inputType: Anon_Remote, status: Anon_Complete): Anon_InputType = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InputType]
  }
}

