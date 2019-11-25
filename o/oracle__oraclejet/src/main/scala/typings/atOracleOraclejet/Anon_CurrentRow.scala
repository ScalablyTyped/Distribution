package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentRow[K]
  extends /* propName */ StringDictionary[js.Any] {
  var currentRow: CurrentRow[K]
  var previousCurrentRow: CurrentRow[K]
}

object Anon_CurrentRow {
  @scala.inline
  def apply[K](
    currentRow: CurrentRow[K],
    previousCurrentRow: CurrentRow[K],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CurrentRow[K]]
  }
}

