package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputType extends js.Object {
  var inputType: AnonRemote
  var status: AnonComplete
}

object AnonInputType {
  @scala.inline
  def apply(inputType: AnonRemote, status: AnonComplete): AnonInputType = {
    val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInputType]
  }
}

