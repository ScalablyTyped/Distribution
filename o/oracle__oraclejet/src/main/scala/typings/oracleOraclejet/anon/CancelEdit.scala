package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelEdit[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var cancelEdit: Boolean
  var cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
}

object CancelEdit {
  @scala.inline
  def apply[K, D](
    cancelEdit: Boolean,
    cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CancelEdit[K, D]]
  }
}

