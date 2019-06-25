package typings
package olLib.structsLRUCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var key_ : java.lang.String
  var newer: js.Any
  var older: js.Any
  var value_ : js.Any
}

object Entry {
  @scala.inline
  def apply(key_ : java.lang.String, newer: js.Any, older: js.Any, value_ : js.Any): Entry = {
    val __obj = js.Dynamic.literal(key_ = key_, newer = newer, older = older, value_ = value_)
  
    __obj.asInstanceOf[Entry]
  }
}

