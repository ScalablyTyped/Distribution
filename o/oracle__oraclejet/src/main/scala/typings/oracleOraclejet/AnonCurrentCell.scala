package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentCell[K]
  extends /* propName */ StringDictionary[js.Any] {
  var currentCell: CurrentCell[K]
  var previousCurrentCell: CurrentCell[K]
}

object AnonCurrentCell {
  @scala.inline
  def apply[K](
    currentCell: CurrentCell[K],
    previousCurrentCell: CurrentCell[K],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonCurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell.asInstanceOf[js.Any], previousCurrentCell = previousCurrentCell.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCurrentCell[K]]
  }
}

