package typings.microsoftDashGraph.microsoftDashGraphMod

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
    if (address != null) __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[WorkbookRangeReference]
  }
}

