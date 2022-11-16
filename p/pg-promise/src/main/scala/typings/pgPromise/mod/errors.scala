package typings.pgPromise.mod

import typings.pgMinify.mod.SQLParsingError
import typings.pgPromise.typescriptPgSubsetMod.IResult
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Errors namespace
// API: http://vitaly-t.github.io/pg-promise/errors.html
object errors {
  
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  @JSImport("pg-promise", "errors.ParameterizedQueryError")
  @js.native
  open class ParameterizedQueryError ()
    extends StObject
       with Error {
    
    // extended properties:
    var error: QueryFileError = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("stack")
    var stack_ParameterizedQueryError: String = js.native
    
    def toString(level: Double): String = js.native
  }
  
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  @JSImport("pg-promise", "errors.PreparedStatementError")
  @js.native
  open class PreparedStatementError ()
    extends StObject
       with Error {
    
    // extended properties:
    var error: QueryFileError = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName("stack")
    var stack_PreparedStatementError: String = js.native
    
    def toString(level: Double): String = js.native
  }
  
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  @JSImport("pg-promise", "errors.QueryFileError")
  @js.native
  open class QueryFileError ()
    extends StObject
       with Error {
    
    var error: SQLParsingError = js.native
    
    // extended properties:
    var file: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var options: IQueryFileOptions = js.native
    
    @JSName("stack")
    var stack_QueryFileError: String = js.native
    
    def toString(level: Double): String = js.native
  }
  
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  @JSImport("pg-promise", "errors.QueryResultError")
  @js.native
  open class QueryResultError ()
    extends StObject
       with Error {
    
    var code: queryResultErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var query: String = js.native
    
    var received: Double = js.native
    
    // extended properties:
    var result: IResult[Any] = js.native
    
    @JSName("stack")
    var stack_QueryResultError: String = js.native
    
    var values: Any = js.native
  }
  
  @js.native
  sealed trait queryResultErrorCode extends StObject
  // Query Result Error Code;
  // API: http://vitaly-t.github.io/pg-promise/errors.html#.queryResultErrorCode
  @JSImport("pg-promise", "errors.queryResultErrorCode")
  @js.native
  object queryResultErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[queryResultErrorCode & Double] = js.native
    
    @js.native
    sealed trait multiple
      extends StObject
         with queryResultErrorCode
    /* 2 */ val multiple: typings.pgPromise.mod.errors.queryResultErrorCode.multiple & Double = js.native
    
    @js.native
    sealed trait noData
      extends StObject
         with queryResultErrorCode
    /* 0 */ val noData: typings.pgPromise.mod.errors.queryResultErrorCode.noData & Double = js.native
    
    @js.native
    sealed trait notEmpty
      extends StObject
         with queryResultErrorCode
    /* 1 */ val notEmpty: typings.pgPromise.mod.errors.queryResultErrorCode.notEmpty & Double = js.native
  }
}
