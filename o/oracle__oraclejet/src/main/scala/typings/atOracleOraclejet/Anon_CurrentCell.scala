package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.ojdatagridMod.ojDataGrid.CurrentCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentCell[K]
  extends /* propName */ StringDictionary[js.Any] {
  var currentCell: CurrentCell[K]
  var previousCurrentCell: CurrentCell[K]
}

object Anon_CurrentCell {
  @scala.inline
  def apply[K](
    currentCell: CurrentCell[K],
    previousCurrentCell: CurrentCell[K],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell, previousCurrentCell = previousCurrentCell)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CurrentCell[K]]
  }
}

