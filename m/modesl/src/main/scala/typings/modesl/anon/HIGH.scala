package typings.modesl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HIGH extends js.Object {
  var HIGH: String
  var LOW: String
  var NORMAL: String
}

object HIGH {
  @scala.inline
  def apply(HIGH: String, LOW: String, NORMAL: String): HIGH = {
    val __obj = js.Dynamic.literal(HIGH = HIGH.asInstanceOf[js.Any], LOW = LOW.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIGH]
  }
}

