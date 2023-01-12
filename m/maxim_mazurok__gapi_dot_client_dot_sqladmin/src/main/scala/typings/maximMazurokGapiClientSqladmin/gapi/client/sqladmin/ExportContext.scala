package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.maximMazurokGapiClientSqladmin.anon.EscapeCharacter
import typings.maximMazurokGapiClientSqladmin.anon.MysqlExportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportContext extends StObject {
  
  /** Options for exporting data as CSV. `MySQL` and `PostgreSQL` instances only. */
  var csvExportOptions: js.UndefOr[EscapeCharacter] = js.undefined
  
  /**
    * Databases to be exported. `MySQL instances:` If `fileType` is `SQL` and no database is specified, all databases are exported, except for the `mysql` system database. If `fileType`
    * is `CSV`, you can specify one database, either by using this property or by using the `csvExportOptions.selectQuery` property, which takes precedence over this property. `PostgreSQL
    * instances:` You must specify one database to be exported. If `fileType` is `CSV`, this database must match the one specified in the `csvExportOptions.selectQuery` property. `SQL
    * Server instances:` You must specify one database to be exported, and the `fileType` must be `BAK`.
    */
  var databases: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The file type for the specified uri. */
  var fileType: js.UndefOr[String] = js.undefined
  
  /** This is always `sql#exportContext`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Option for export offload. */
  var offload: js.UndefOr[Boolean] = js.undefined
  
  /** Options for exporting data as SQL statements. */
  var sqlExportOptions: js.UndefOr[MysqlExportOptions] = js.undefined
  
  /**
    * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the form `gs://bucketName/fileName`. If the file already exists, the request succeeds,
    * but the operation fails. If `fileType` is `SQL` and the filename ends with .gz, the contents are compressed.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object ExportContext {
  
  inline def apply(): ExportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportContext] (val x: Self) extends AnyVal {
    
    inline def setCsvExportOptions(value: EscapeCharacter): Self = StObject.set(x, "csvExportOptions", value.asInstanceOf[js.Any])
    
    inline def setCsvExportOptionsUndefined: Self = StObject.set(x, "csvExportOptions", js.undefined)
    
    inline def setDatabases(value: js.Array[String]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: String*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOffload(value: Boolean): Self = StObject.set(x, "offload", value.asInstanceOf[js.Any])
    
    inline def setOffloadUndefined: Self = StObject.set(x, "offload", js.undefined)
    
    inline def setSqlExportOptions(value: MysqlExportOptions): Self = StObject.set(x, "sqlExportOptions", value.asInstanceOf[js.Any])
    
    inline def setSqlExportOptionsUndefined: Self = StObject.set(x, "sqlExportOptions", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
