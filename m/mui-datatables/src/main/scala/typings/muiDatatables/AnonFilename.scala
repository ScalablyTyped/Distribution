package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilename extends js.Object {
  var filename: String
  var filterOptions: js.UndefOr[AnonUseDisplayedColumnsOnly] = js.undefined
  var separator: String
}

object AnonFilename {
  @scala.inline
  def apply(filename: String, separator: String, filterOptions: AnonUseDisplayedColumnsOnly = null): AnonFilename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilename]
  }
}

