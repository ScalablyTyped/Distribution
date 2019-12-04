package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelEdit[K, D]
  extends /* propName */ StringDictionary[js.Any] {
  var cancelEdit: Boolean
  var cellContext: CellContext[K, D]
}

object Anon_CancelEdit {
  @scala.inline
  def apply[K, D](
    cancelEdit: Boolean,
    cellContext: CellContext[K, D],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], cellContext = cellContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CancelEdit[K, D]]
  }
}

