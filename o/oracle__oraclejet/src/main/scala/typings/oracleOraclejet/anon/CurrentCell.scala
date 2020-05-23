package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentCell[K]
  extends /* key */ StringDictionary[js.Any] {
  var currentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
  var previousCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K]
}

object CurrentCell {
  @scala.inline
  def apply[K](
    currentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K],
    previousCurrentCell: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell[K],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CurrentCell[K]]
  }
}

