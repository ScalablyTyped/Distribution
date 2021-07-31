package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabaseDdlResponse extends StObject {
  
  /** A list of formatted DDL statements defining the schema of the database specified in the request. */
  var statements: js.UndefOr[js.Array[String]] = js.undefined
}
object GetDatabaseDdlResponse {
  
  @scala.inline
  def apply(): GetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabaseDdlResponse]
  }
  
  @scala.inline
  implicit class GetDatabaseDdlResponseMutableBuilder[Self <: GetDatabaseDdlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
