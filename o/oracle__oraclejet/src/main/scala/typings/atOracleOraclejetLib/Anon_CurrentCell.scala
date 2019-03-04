package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentCell[K]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var currentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K]
  var previousCurrentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K]
}

object Anon_CurrentCell {
  @scala.inline
  def apply[K](
    currentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K],
    previousCurrentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CurrentCell[K] = {
    val __obj = js.Dynamic.literal(currentCell = currentCell, previousCurrentCell = previousCurrentCell)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CurrentCell[K]]
  }
}

