package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeErrorString extends js.Object {
  var errorCode: scala.Double
  var errorString: java.lang.String
}

object Anon_ErrorCodeErrorString {
  @scala.inline
  def apply(errorCode: scala.Double, errorString: java.lang.String): Anon_ErrorCodeErrorString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorString")(errorString)
    __obj.asInstanceOf[Anon_ErrorCodeErrorString]
  }
}

