package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MysqlExportOptions extends StObject {
  
  /** Options for exporting from MySQL. */
  var mysqlExportOptions: js.UndefOr[MasterData] = js.native
  
  /** Export only schemas. */
  var schemaOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Tables to export, or that were exported, from the specified database. If you specify tables, specify one and only one database. For PostgreSQL instances, you can specify only
    * one table.
    */
  var tables: js.UndefOr[js.Array[String]] = js.native
}
object MysqlExportOptions {
  
  @scala.inline
  def apply(): MysqlExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MysqlExportOptions]
  }
  
  @scala.inline
  implicit class MysqlExportOptionsMutableBuilder[Self <: MysqlExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMysqlExportOptions(value: MasterData): Self = StObject.set(x, "mysqlExportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMysqlExportOptionsUndefined: Self = StObject.set(x, "mysqlExportOptions", js.undefined)
    
    @scala.inline
    def setSchemaOnly(value: Boolean): Self = StObject.set(x, "schemaOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaOnlyUndefined: Self = StObject.set(x, "schemaOnly", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[String]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: String*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
