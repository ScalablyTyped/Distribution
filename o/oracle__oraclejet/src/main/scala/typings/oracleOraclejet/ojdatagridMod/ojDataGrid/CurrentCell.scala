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
@js.native
trait CurrentCell[K] extends js.Object {
  var axis: js.UndefOr[column | columnEnd | row | rowEnd] = js.native
  var index: js.UndefOr[Double] = js.native
  var indexes: js.UndefOr[ColumnRow] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var keys: js.UndefOr[ColumnK[K]] = js.native
  var level: js.UndefOr[Double] = js.native
  var `type`: cell | header | label = js.native
}

object CurrentCell {
  @scala.inline
  def apply[K](`type`: cell | header | label): CurrentCell[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentCell[K]]
  }
  @scala.inline
  implicit class CurrentCellOps[Self <: CurrentCell[_], K] (val x: Self with CurrentCell[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: cell | header | label): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxis(value: column | columnEnd | row | rowEnd): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setIndexes(value: ColumnRow): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeys(value: ColumnK[K]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

