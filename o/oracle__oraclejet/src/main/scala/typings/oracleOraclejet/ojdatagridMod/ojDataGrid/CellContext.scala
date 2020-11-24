package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.anon.ColumnK
import typings.oracleOraclejet.anon.ColumnRow
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.edit
import typings.oracleOraclejet.oracleOraclejetStrings.navigation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait CellContext[K, D] extends js.Object {
  
  var cell: D = js.native
  
  var componentElement: Element = js.native
  
  var data: D = js.native
  
  var datasource: (DataProvider[K, D]) | Null = js.native
  
  var extents: ColumnRow = js.native
  
  var indexes: ColumnRow = js.native
  
  var keys: ColumnK[K] = js.native
  
  var mode: edit | navigation = js.native
  
  var parentElement: Element = js.native
}
object CellContext {
  
  @scala.inline
  def apply[K, D](
    cell: D,
    componentElement: Element,
    data: D,
    extents: ColumnRow,
    indexes: ColumnRow,
    keys: ColumnK[K],
    mode: edit | navigation,
    parentElement: Element
  ): CellContext[K, D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellContext[K, D]]
  }
  
  @scala.inline
  implicit class CellContextOps[Self <: CellContext[_, _], K, D] (val x: Self with (CellContext[K, D])) extends AnyVal {
    
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
    def setCell(value: D): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtents(value: ColumnRow): Self = this.set("extents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexes(value: ColumnRow): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: ColumnK[K]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: edit | navigation): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = this.set("datasource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasourceNull: Self = this.set("datasource", null)
  }
}
