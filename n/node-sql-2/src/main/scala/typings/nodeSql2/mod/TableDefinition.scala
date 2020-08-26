package typings.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDefinition[Name /* <: String */, Row] extends js.Object {
  var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row] = js.native
  var dialect: js.UndefOr[SQLDialects] = js.native
  var foreignKeys: js.UndefOr[typings.nodeSql2.anon.Columns[Row]] = js.native
  var isTemporary: js.UndefOr[Boolean] = js.native
  var name: Name = js.native
  var schema: String = js.native
}

object TableDefinition {
  @scala.inline
  def apply[/* <: java.lang.String */ Name, Row](
    columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row],
    name: Name,
    schema: String
  ): TableDefinition[Name, Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition[Name, Row]]
  }
  @scala.inline
  implicit class TableDefinitionOps[Self <: TableDefinition[_, _], /* <: java.lang.String */ Name, Row] (val x: Self with (TableDefinition[Name, Row])) extends AnyVal {
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
    def setColumns(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ CName in keyof Row ]: node-sql-2.sql.ColumnDefinition<CName, Row[CName]>}
      */ typings.nodeSql2.nodeSql2Strings.TableDefinition with TopLevel[Row]
    ): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialect(value: SQLDialects): Self = this.set("dialect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialect: Self = this.set("dialect", js.undefined)
    @scala.inline
    def setForeignKeys(value: typings.nodeSql2.anon.Columns[Row]): Self = this.set("foreignKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeys: Self = this.set("foreignKeys", js.undefined)
    @scala.inline
    def setIsTemporary(value: Boolean): Self = this.set("isTemporary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTemporary: Self = this.set("isTemporary", js.undefined)
  }
  
}

