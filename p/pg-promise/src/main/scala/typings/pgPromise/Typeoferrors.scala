package typings.pgPromise

import org.scalablytyped.runtime.Instantiable0
import typings.pgPromise.mod.errors.ParameterizedQueryError
import typings.pgPromise.mod.errors.PreparedStatementError
import typings.pgPromise.mod.errors.QueryFileError
import typings.pgPromise.mod.errors.QueryResultError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoferrors extends js.Object {
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  var ParameterizedQueryError: Instantiable0[typings.pgPromise.mod.errors.ParameterizedQueryError]
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  var PreparedStatementError: Instantiable0[typings.pgPromise.mod.errors.PreparedStatementError]
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  var QueryFileError: Instantiable0[typings.pgPromise.mod.errors.QueryFileError]
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  var QueryResultError: Instantiable0[typings.pgPromise.mod.errors.QueryResultError]
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
}

