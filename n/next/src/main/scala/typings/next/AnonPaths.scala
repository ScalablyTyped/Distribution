package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaths extends js.Object {
  var paths: js.Array[String | AnonParams]
}

object AnonPaths {
  @scala.inline
  def apply(paths: js.Array[String | AnonParams]): AnonPaths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPaths]
  }
}

