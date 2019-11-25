package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OIndexEntry extends js.Object {
  var key: String
  var value: String | ORID
}

object OIndexEntry {
  @scala.inline
  def apply(key: String, value: String | ORID): OIndexEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OIndexEntry]
  }
}

