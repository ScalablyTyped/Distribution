package typings.pgPromise.mod

import org.scalablytyped.runtime.TopLevel
import typings.pgMinify.mod.SQLParsingError
import typings.pgPromise.pgSubsetMod.IResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Errors namespace
// API: http://vitaly-t.github.io/pg-promise/errors.html
@JSImport("pg-promise", "errors")
@js.native
object errors extends js.Object {
  
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
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
  sealed trait queryResultErrorCode extends js.Object
  // Query Result Error Code;
  // API: http://vitaly-t.github.io/pg-promise/errors.html#.queryResultErrorCode
  @js.native
  object queryResultErrorCode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[queryResultErrorCode with Double] = js.native
    
    @js.native
    sealed trait multiple extends queryResultErrorCode
    /* 2 */ @js.native
    object multiple extends TopLevel[multiple with Double]
    
    @js.native
    sealed trait noData extends queryResultErrorCode
    /* 0 */ @js.native
    object noData extends TopLevel[noData with Double]
    
    @js.native
    sealed trait notEmpty extends queryResultErrorCode
    /* 1 */ @js.native
    object notEmpty extends TopLevel[notEmpty with Double]
  }
}
