package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentRow[K]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var currentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K]
  var previousCurrentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K]
}

object Anon_CurrentRow {
  @scala.inline
  def apply[K](
    currentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K],
    previousCurrentRow: atOracleOraclejetLib.ojtableMod.ojTableNs.CurrentRow[K],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CurrentRow[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentRow")(currentRow)
    __obj.updateDynamic("previousCurrentRow")(previousCurrentRow)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CurrentRow[K]]
  }
}

