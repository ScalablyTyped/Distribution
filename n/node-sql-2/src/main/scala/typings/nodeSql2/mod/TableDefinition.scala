package typings.nodeSql2.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableDefinition[Name /* <: String */, Row] extends StObject {
  
  var columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.node-sql-2.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeSql2.nodeSql2Strings.TableDefinition & TopLevel[Row]
  
  var dialect: js.UndefOr[SQLDialects] = js.undefined
  
  var foreignKeys: js.UndefOr[typings.nodeSql2.anon.Columns[Row]] = js.undefined
  
  var isTemporary: js.UndefOr[Boolean] = js.undefined
  
  var name: Name
  
  var schema: String
}
object TableDefinition {
  
  inline def apply[Name /* <: String */, Row](
    columns: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ CName in keyof Row ]: node-sql-2.node-sql-2.ColumnDefinition<CName, Row[CName]>}
    */ typings.nodeSql2.nodeSql2Strings.TableDefinition & TopLevel[Row],
    name: Name,
    schema: String
  ): TableDefinition[Name, Row] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDefinition[Name, Row]]
  }
  
  extension [Self <: TableDefinition[?, ?], Name /* <: String */, Row](x: Self & (TableDefinition[Name, Row])) {
    
    inline def setColumns(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ CName in keyof Row ]: node-sql-2.node-sql-2.ColumnDefinition<CName, Row[CName]>}
      */ typings.nodeSql2.nodeSql2Strings.TableDefinition & TopLevel[Row]
    ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setDialect(value: SQLDialects): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
    
    inline def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
    
    inline def setForeignKeys(value: typings.nodeSql2.anon.Columns[Row]): Self = StObject.set(x, "foreignKeys", value.asInstanceOf[js.Any])
    
    inline def setForeignKeysUndefined: Self = StObject.set(x, "foreignKeys", js.undefined)
    
    inline def setIsTemporary(value: Boolean): Self = StObject.set(x, "isTemporary", value.asInstanceOf[js.Any])
    
    inline def setIsTemporaryUndefined: Self = StObject.set(x, "isTemporary", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
