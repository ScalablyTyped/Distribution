package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentRow[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  var previousCurrentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
}

object CurrentRow {
  @scala.inline
  def apply[K](
    currentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    previousCurrentRow: typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CurrentRow[K]]
  }
}

