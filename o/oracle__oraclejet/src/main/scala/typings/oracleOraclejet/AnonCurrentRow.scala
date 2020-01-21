package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentRow[K]
  extends /* propName */ StringDictionary[js.Any] {
  var currentRow: CurrentRow[K]
  var previousCurrentRow: CurrentRow[K]
}

object AnonCurrentRow {
  @scala.inline
  def apply[K](
    currentRow: CurrentRow[K],
    previousCurrentRow: CurrentRow[K],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonCurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCurrentRow[K]]
  }
}

