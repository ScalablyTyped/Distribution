package typings.mongodbDashUri.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parserOptions extends js.Object {
  var scheme: String
}

object parserOptions {
  @scala.inline
  def apply(scheme: String): parserOptions = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[parserOptions]
  }
}

