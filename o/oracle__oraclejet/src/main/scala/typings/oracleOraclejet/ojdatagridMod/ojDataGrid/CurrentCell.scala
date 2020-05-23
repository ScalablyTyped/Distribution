package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.anon.ColumnK
import typings.oracleOraclejet.anon.ColumnRow
import typings.oracleOraclejet.oracleOraclejetStrings.cell
import typings.oracleOraclejet.oracleOraclejetStrings.column
import typings.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typings.oracleOraclejet.oracleOraclejetStrings.header
import typings.oracleOraclejet.oracleOraclejetStrings.label
import typings.oracleOraclejet.oracleOraclejetStrings.row
import typings.oracleOraclejet.oracleOraclejetStrings.rowEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CurrentCell[K] extends js.Object {
  var axis: js.UndefOr[column | columnEnd | row | rowEnd] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var indexes: js.UndefOr[ColumnRow] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var keys: js.UndefOr[ColumnK[K]] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var `type`: cell | header | label
}

object CurrentCell {
  @scala.inline
  def apply[K](
    `type`: cell | header | label,
    axis: column | columnEnd | row | rowEnd = null,
    index: js.UndefOr[Double] = js.undefined,
    indexes: ColumnRow = null,
    key: js.Any = null,
    keys: ColumnK[K] = null,
    level: js.UndefOr[Double] = js.undefined
  ): CurrentCell[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
}

