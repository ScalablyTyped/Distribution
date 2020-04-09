package typings.notyf.notyfOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfPosition extends js.Object {
  var x: NotyfHorizontalPosition
  var y: NotyfVerticalPosition
}

object INotyfPosition {
  @scala.inline
  def apply(x: NotyfHorizontalPosition, y: NotyfVerticalPosition): INotyfPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotyfPosition]
  }
}

