package typings.muiDashDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename extends js.Object {
  var filename: String
  var filterOptions: js.UndefOr[Anon_UseDisplayedColumnsOnly] = js.undefined
  var separator: String
}

object Anon_Filename {
  @scala.inline
  def apply(filename: String, separator: String, filterOptions: Anon_UseDisplayedColumnsOnly = null): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filename]
  }
}

