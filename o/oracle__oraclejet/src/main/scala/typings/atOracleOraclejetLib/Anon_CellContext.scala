package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellContext[K, D]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cellContext: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CellContext[K, D]
}

object Anon_CellContext {
  @scala.inline
  def apply[K, D](
    cellContext: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CellContext[K, D],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CellContext[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellContext")(cellContext)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CellContext[K, D]]
  }
}

