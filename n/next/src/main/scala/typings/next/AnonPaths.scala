package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaths extends js.Object {
  var fallback: Boolean
  var paths: js.Array[String | AnonParamsParsedUrlQuery]
}

object AnonPaths {
  @scala.inline
  def apply(fallback: Boolean, paths: js.Array[String | AnonParamsParsedUrlQuery]): AnonPaths = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPaths]
  }
}

