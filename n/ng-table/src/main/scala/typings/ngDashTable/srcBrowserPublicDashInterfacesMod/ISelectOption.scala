package typings.ngDashTable.srcBrowserPublicDashInterfacesMod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[ISelectOption]
  }
}

