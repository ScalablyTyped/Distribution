package typings
package mongodbDashUriLib.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parserOptions extends js.Object {
  var scheme: java.lang.String
}

object parserOptions {
  @scala.inline
  def apply(scheme: java.lang.String): parserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[parserOptions]
  }
}

