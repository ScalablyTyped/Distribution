package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelEdit[K, D]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cancelEdit: scala.Boolean
  var cellContext: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CellContext[K, D]
}

object Anon_CancelEdit {
  @scala.inline
  def apply[K, D](
    cancelEdit: scala.Boolean,
    cellContext: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CellContext[K, D],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CancelEdit[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelEdit")(cancelEdit)
    __obj.updateDynamic("cellContext")(cellContext)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CancelEdit[K, D]]
  }
}

