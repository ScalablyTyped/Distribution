package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellContext[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D]
}

object CellContext {
  @scala.inline
  def apply[K, D](
    cellContext: typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CellContext[K, D]]
  }
}

