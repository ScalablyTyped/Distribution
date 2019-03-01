package typings
package atOracleOraclejetLib.ojdatagridMod.ojDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CurrentCell[K] extends js.Object {
  var axis: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd
  ] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var indexes: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRow] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var keys: js.UndefOr[atOracleOraclejetLib.Anon_ColumnRowK[K]] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cell | atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.label
}

object CurrentCell {
  @scala.inline
  def apply[K](
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.cell | atOracleOraclejetLib.atOracleOraclejetLibStrings.header | atOracleOraclejetLib.atOracleOraclejetLibStrings.label,
    axis: atOracleOraclejetLib.atOracleOraclejetLibStrings.column | atOracleOraclejetLib.atOracleOraclejetLibStrings.columnEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.row | atOracleOraclejetLib.atOracleOraclejetLibStrings.rowEnd = null,
    index: scala.Int | scala.Double = null,
    indexes: atOracleOraclejetLib.Anon_ColumnRow = null,
    key: js.Any = null,
    keys: atOracleOraclejetLib.Anon_ColumnRowK[K] = null,
    level: scala.Int | scala.Double = null
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
}

