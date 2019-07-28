package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexEntry extends js.Object {
  var key: String
  var value: String | RID
}

object IndexEntry {
  @scala.inline
  def apply(key: String, value: String | RID): IndexEntry = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexEntry]
  }
}

