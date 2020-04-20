package typings.ol.lrucacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var key_ : String
  var newer: js.Any
  var older: js.Any
  var value_ : js.Any
}

object Entry {
  @scala.inline
  def apply(key_ : String, newer: js.Any, older: js.Any, value_ : js.Any): Entry = {
    val __obj = js.Dynamic.literal(key_ = key_.asInstanceOf[js.Any], newer = newer.asInstanceOf[js.Any], older = older.asInstanceOf[js.Any], value_ = value_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

