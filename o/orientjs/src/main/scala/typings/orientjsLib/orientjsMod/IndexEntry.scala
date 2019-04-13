package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexEntry extends js.Object {
  var key: java.lang.String
  var value: java.lang.String | RID
}

object IndexEntry {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String | RID): IndexEntry = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexEntry]
  }
}

