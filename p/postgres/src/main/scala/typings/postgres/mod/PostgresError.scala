package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped never | postgres.postgres.PostgresError | postgres.postgres.ConnectionError | postgres.postgres.NotSupportedError | postgres.postgres.GenericError | postgres.postgres.AuthNotImplementedError */ @JSImport("postgres", "PostgresError")
@js.native
open class PostgresError ()
  extends StObject
     with _Error {
  
  var code: String = js.native
  
  var column_name: js.UndefOr[String] = js.native
  
  var constraint_name: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var detail: js.UndefOr[String] = js.native
  
  var file: String = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var internal_position: js.UndefOr[String] = js.native
  
  var internal_query: js.UndefOr[String] = js.native
  
  var line: String = js.native
  
  var name: typings.postgres.postgresStrings.PostgresError = js.native
  
  /** Only set when debug is enabled */
  var parameters: js.Array[Any] = js.native
  
  var position: String = js.native
  
  /** Only set when debug is enabled */
  var query: String = js.native
  
  var routine: String = js.native
  
  var schema_name: js.UndefOr[String] = js.native
  
  var severity: String = js.native
  
  var severity_local: String = js.native
  
  var table_name: js.UndefOr[String] = js.native
  
  var type_name: js.UndefOr[String] = js.native
  
  var where: js.UndefOr[String] = js.native
}
