package typings.atOracleOraclejet.ojdatagridMod.ojDataGrid

import typings.atOracleOraclejet.Anon_ColumnRow
import typings.atOracleOraclejet.Anon_ColumnRowK
import typings.atOracleOraclejet.atOracleOraclejetStrings.cell
import typings.atOracleOraclejet.atOracleOraclejetStrings.column
import typings.atOracleOraclejet.atOracleOraclejetStrings.columnEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.header
import typings.atOracleOraclejet.atOracleOraclejetStrings.label
import typings.atOracleOraclejet.atOracleOraclejetStrings.row
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CurrentCell[K] extends js.Object {
  var axis: js.UndefOr[column | columnEnd | row | rowEnd] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var indexes: js.UndefOr[Anon_ColumnRow] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var keys: js.UndefOr[Anon_ColumnRowK[K]] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var `type`: cell | header | label
}

object CurrentCell {
  @scala.inline
  def apply[K](
    `type`: cell | header | label,
    axis: column | columnEnd | row | rowEnd = null,
    index: Int | Double = null,
    indexes: Anon_ColumnRow = null,
    key: js.Any = null,
    keys: Anon_ColumnRowK[K] = null,
    level: Int | Double = null
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
}

