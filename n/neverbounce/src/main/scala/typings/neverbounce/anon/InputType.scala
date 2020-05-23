package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputType extends js.Object {
  var inputType: Remote
  var status: Complete
}

object InputType {
  @scala.inline
  def apply(inputType: Remote, status: Complete): InputType = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputType]
  }
}

