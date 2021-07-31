package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatabaseDdlRequest extends StObject {
  
  /**
    * If empty, the new update request is assigned an automatically-generated operation ID. Otherwise, `operation_id` is used to construct the name of the resulting Operation. Specifying
    * an explicit operation ID simplifies determining whether the statements were executed in the event that the UpdateDatabaseDdl call is replayed, or the return value is otherwise lost:
    * the database and `operation_id` fields can be combined to form the name of the resulting longrunning.Operation: `/operations/`. `operation_id` should be unique within the database,
    * and must be a valid identifier: `a-z*`. Note that automatically-generated operation IDs always begin with an underscore. If the named operation already exists, UpdateDatabaseDdl
    * returns `ALREADY_EXISTS`.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** Required. DDL statements to be applied to the database. */
  var statements: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateDatabaseDdlRequest {
  
  @scala.inline
  def apply(): UpdateDatabaseDdlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatabaseDdlRequest]
  }
  
  @scala.inline
  implicit class UpdateDatabaseDdlRequestMutableBuilder[Self <: UpdateDatabaseDdlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
