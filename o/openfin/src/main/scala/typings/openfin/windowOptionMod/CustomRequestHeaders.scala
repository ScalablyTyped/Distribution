package typings.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRequestHeaders extends js.Object {
  var headers: js.Array[_]
  var urlPatterns: js.Array[String]
}

object CustomRequestHeaders {
  @scala.inline
  def apply(headers: js.Array[_], urlPatterns: js.Array[String]): CustomRequestHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRequestHeaders]
  }
}

