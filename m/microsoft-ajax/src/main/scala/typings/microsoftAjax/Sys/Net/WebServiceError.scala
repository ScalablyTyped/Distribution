package typings.microsoftAjax.Sys.Net

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServiceError extends js.Object {
  def get_errorObject(): js.Any
  def get_exceptionType(): js.Any
  def get_message(): String
  def get_stackTrace(): String
  def get_statusCode(): Double
  def get_timedOut(): Boolean
}

object WebServiceError {
  @scala.inline
  def apply(
    get_errorObject: () => js.Any,
    get_exceptionType: () => js.Any,
    get_message: () => String,
    get_stackTrace: () => String,
    get_statusCode: () => Double,
    get_timedOut: () => Boolean
  ): WebServiceError = {
    val __obj = js.Dynamic.literal(get_errorObject = js.Any.fromFunction0(get_errorObject), get_exceptionType = js.Any.fromFunction0(get_exceptionType), get_message = js.Any.fromFunction0(get_message), get_stackTrace = js.Any.fromFunction0(get_stackTrace), get_statusCode = js.Any.fromFunction0(get_statusCode), get_timedOut = js.Any.fromFunction0(get_timedOut))
    __obj.asInstanceOf[WebServiceError]
  }
}

