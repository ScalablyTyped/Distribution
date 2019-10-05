package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashMinify.pgDashMinifyMod.SQLParsingError
import typings.pgDashPromise.pgDashPromiseMod.errors.QueryFileError
import typings.pgDashPromise.pgDashPromiseMod.errors.queryResultErrorCode
import typings.pgDashPromise.typescriptPgDashSubsetMod.IResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
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
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
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
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
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
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
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
    @js.native
    sealed trait multiple extends queryResultErrorCode
    
    @js.native
    sealed trait noData extends queryResultErrorCode
    
    @js.native
    sealed trait notEmpty extends queryResultErrorCode
    
    /* 2 */ val multiple: typings.pgDashPromise.pgDashPromiseMod.errors.queryResultErrorCode.multiple with Double = js.native
    /* 0 */ val noData: typings.pgDashPromise.pgDashPromiseMod.errors.queryResultErrorCode.noData with Double = js.native
    /* 1 */ val notEmpty: typings.pgDashPromise.pgDashPromiseMod.errors.queryResultErrorCode.notEmpty with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[queryResultErrorCode with Double] = js.native
  }
  
}

