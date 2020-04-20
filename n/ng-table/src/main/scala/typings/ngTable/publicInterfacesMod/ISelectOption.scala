package typings.ngTable.publicInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOption extends js.Object {
  var id: String | Double
  var title: String
}

object ISelectOption {
  @scala.inline
  def apply(id: String | Double, title: String): ISelectOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectOption]
  }
}

