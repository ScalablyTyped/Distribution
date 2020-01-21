package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellContext[K, D]
  extends /* propName */ StringDictionary[js.Any] {
  var cellContext: CellContext[K, D]
}

object AnonCellContext {
  @scala.inline
  def apply[K, D](cellContext: CellContext[K, D], StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonCellContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCellContext[K, D]]
  }
}

