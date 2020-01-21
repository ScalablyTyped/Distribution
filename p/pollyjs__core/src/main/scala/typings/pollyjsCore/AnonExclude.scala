package typings.pollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclude extends js.Object {
  var exclude: js.Array[String]
}

object AnonExclude {
  @scala.inline
  def apply(exclude: js.Array[String]): AnonExclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExclude]
  }
}

