package typings.pgPromise.anon

import org.scalablytyped.runtime.Instantiable0
import typings.pgPromise.mod.errors.ParameterizedQueryError
import typings.pgPromise.mod.errors.PreparedStatementError
import typings.pgPromise.mod.errors.QueryFileError
import typings.pgPromise.mod.errors.QueryResultError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoferrors extends StObject {
  
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  var ParameterizedQueryError: Instantiable0[typings.pgPromise.mod.errors.ParameterizedQueryError] = js.native
  
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  var PreparedStatementError: Instantiable0[typings.pgPromise.mod.errors.PreparedStatementError] = js.native
  
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  var QueryFileError: Instantiable0[typings.pgPromise.mod.errors.QueryFileError] = js.native
  
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  var QueryResultError: Instantiable0[typings.pgPromise.mod.errors.QueryResultError] = js.native
}
object Typeoferrors {
  
  @scala.inline
  def apply(
    ParameterizedQueryError: Instantiable0[ParameterizedQueryError],
    PreparedStatementError: Instantiable0[PreparedStatementError],
    QueryFileError: Instantiable0[QueryFileError],
    QueryResultError: Instantiable0[QueryResultError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(ParameterizedQueryError = ParameterizedQueryError.asInstanceOf[js.Any], PreparedStatementError = PreparedStatementError.asInstanceOf[js.Any], QueryFileError = QueryFileError.asInstanceOf[js.Any], QueryResultError = QueryResultError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoferrors]
  }
  
  @scala.inline
  implicit class TypeoferrorsMutableBuilder[Self <: Typeoferrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterizedQueryError(value: Instantiable0[ParameterizedQueryError]): Self = StObject.set(x, "ParameterizedQueryError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreparedStatementError(value: Instantiable0[PreparedStatementError]): Self = StObject.set(x, "PreparedStatementError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFileError(value: Instantiable0[QueryFileError]): Self = StObject.set(x, "QueryFileError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultError(value: Instantiable0[QueryResultError]): Self = StObject.set(x, "QueryResultError", value.asInstanceOf[js.Any])
  }
}
