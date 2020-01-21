package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeReference extends js.Object {
  var address: js.UndefOr[String] = js.undefined
}

object WorkbookRangeReference {
  @scala.inline
  def apply(address: String = null): WorkbookRangeReference = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookRangeReference]
  }
}

