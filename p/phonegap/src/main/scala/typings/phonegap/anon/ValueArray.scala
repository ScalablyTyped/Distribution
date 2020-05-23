package typings.phonegap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueArray extends js.Object {
  var value: js.Array[String]
}

object ValueArray {
  @scala.inline
  def apply(value: js.Array[String]): ValueArray = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueArray]
  }
}

