package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponseCode extends js.Object {
  var httpResponseCode: Double
}

object HttpResponseCode {
  @scala.inline
  def apply(httpResponseCode: Double): HttpResponseCode = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseCode]
  }
}

