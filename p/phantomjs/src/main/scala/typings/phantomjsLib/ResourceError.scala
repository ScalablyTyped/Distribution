package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceError extends js.Object {
  var errorCode: java.lang.String
  var errorString: java.lang.String
  var id: scala.Double
  var url: java.lang.String
}

object ResourceError {
  @scala.inline
  def apply(
    errorCode: java.lang.String,
    errorString: java.lang.String,
    id: scala.Double,
    url: java.lang.String
  ): ResourceError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorString")(errorString)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ResourceError]
  }
}

