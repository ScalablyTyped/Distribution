package typings.pgDashPromise

import org.scalablytyped.runtime.Instantiable0
import typings.pgDashPromise.pgDashPromiseMod.errorsNs.ParameterizedQueryError
import typings.pgDashPromise.pgDashPromiseMod.errorsNs.PreparedStatementError
import typings.pgDashPromise.pgDashPromiseMod.errorsNs.QueryFileError
import typings.pgDashPromise.pgDashPromiseMod.errorsNs.QueryResultError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoferrors extends js.Object {
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  var ParameterizedQueryError: Instantiable0[typings.pgDashPromise.pgDashPromiseMod.errorsNs.ParameterizedQueryError]
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  var PreparedStatementError: Instantiable0[typings.pgDashPromise.pgDashPromiseMod.errorsNs.PreparedStatementError]
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  var QueryFileError: Instantiable0[typings.pgDashPromise.pgDashPromiseMod.errorsNs.QueryFileError]
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  var QueryResultError: Instantiable0[typings.pgDashPromise.pgDashPromiseMod.errorsNs.QueryResultError]
}

object Typeoferrors {
  @scala.inline
  def apply(
    ParameterizedQueryError: Instantiable0[ParameterizedQueryError],
    PreparedStatementError: Instantiable0[PreparedStatementError],
    QueryFileError: Instantiable0[QueryFileError],
    QueryResultError: Instantiable0[QueryResultError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(ParameterizedQueryError = ParameterizedQueryError, PreparedStatementError = PreparedStatementError, QueryFileError = QueryFileError, QueryResultError = QueryResultError)
  
    __obj.asInstanceOf[Typeoferrors]
  }
}

