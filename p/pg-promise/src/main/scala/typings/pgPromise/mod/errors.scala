package typings.pgPromise.mod

import typings.pgMinify.mod.SQLParsingError
import typings.pgPromise.pgSubsetMod.IResult
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Errors namespace
// API: http://vitaly-t.github.io/pg-promise/errors.html
object errors {
  
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  @JSImport("pg-promise", "errors.ParameterizedQueryError")
  @js.native
  class ParameterizedQueryError () extends Error {
    
    // extended properties:
    var error: QueryFileError = js.native
    
    @JSName("stack")
    var stack_ParameterizedQueryError: String = js.native
    
    def toString(level: Double): String = js.native
  }
  
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  @JSImport("pg-promise", "errors.PreparedStatementError")
  @js.native
  class PreparedStatementError () extends Error {
    
    // extended properties:
    var error: QueryFileError = js.native
    
    @JSName("stack")
    var stack_PreparedStatementError: String = js.native
    
    def toString(level: Double): String = js.native
  }
  
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  @JSImport("pg-promise", "errors.QueryFileError")
  @js.native
  class QueryFileError () extends Error {
    
    var error: SQLParsingError = js.native
    
    // extended properties:
    var file: String = js.native
    
    var options: IQueryFileOptions = js.native
    
    @JSName("stack")
    var stack_QueryFileError: String = js.native
    
    def toString(level: Double): String = js.native
  }
  
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  @JSImport("pg-promise", "errors.QueryResultError")
  @js.native
  class QueryResultError () extends Error {
    
    var code: queryResultErrorCode = js.native
    
    var query: String = js.native
    
    var received: Double = js.native
    
    // extended properties:
    var result: IResult = js.native
    
    @JSName("stack")
    var stack_QueryResultError: String = js.native
    
    var values: js.Any = js.native
  }
  
  @js.native
  sealed trait queryResultErrorCode extends StObject
  // Query Result Error Code;
  // API: http://vitaly-t.github.io/pg-promise/errors.html#.queryResultErrorCode
  @JSImport("pg-promise", "errors.queryResultErrorCode")
  @js.native
  object queryResultErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[queryResultErrorCode with Double] = js.native
    
    @js.native
    sealed trait multiple extends queryResultErrorCode
    /* 2 */ val multiple: typings.pgPromise.mod.errors.queryResultErrorCode.multiple with Double = js.native
    
    @js.native
    sealed trait noData extends queryResultErrorCode
    /* 0 */ val noData: typings.pgPromise.mod.errors.queryResultErrorCode.noData with Double = js.native
    
    @js.native
    sealed trait notEmpty extends queryResultErrorCode
    /* 1 */ val notEmpty: typings.pgPromise.mod.errors.queryResultErrorCode.notEmpty with Double = js.native
  }
}
