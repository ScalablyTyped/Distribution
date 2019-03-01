package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCode extends js.Object {
  var errorCode: scala.Double
  var errorString: java.lang.String
  var id: java.lang.String
  var url: java.lang.String
}

object Anon_ErrorCode {
  @scala.inline
  def apply(
    errorCode: scala.Double,
    errorString: java.lang.String,
    id: java.lang.String,
    url: java.lang.String
  ): Anon_ErrorCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorString")(errorString)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_ErrorCode]
  }
}

