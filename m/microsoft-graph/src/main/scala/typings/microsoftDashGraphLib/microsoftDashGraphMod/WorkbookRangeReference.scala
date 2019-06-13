package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeReference extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookRangeReference {
  @scala.inline
  def apply(address: java.lang.String = null): WorkbookRangeReference = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[WorkbookRangeReference]
  }
}

