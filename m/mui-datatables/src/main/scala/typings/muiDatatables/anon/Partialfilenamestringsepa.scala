package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  filename  :string,   separator  :string,   filterOptions  :std.Partial<{  useDisplayedColumnsOnly  :boolean,   useDisplayedRowsOnly  :boolean}>}> */
trait Partialfilenamestringsepa extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var filterOptions: js.UndefOr[PartialuseDisplayedColumn] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object Partialfilenamestringsepa {
  @scala.inline
  def apply(filename: String = null, filterOptions: PartialuseDisplayedColumn = null, separator: String = null): Partialfilenamestringsepa = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialfilenamestringsepa]
  }
}

