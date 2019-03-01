package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyTxtRecord extends AnyRecord {
  var entries: js.Array[java.lang.String]
  var `type`: nodeLib.nodeLibStrings.TXT
}

object AnyTxtRecord {
  @scala.inline
  def apply(entries: js.Array[java.lang.String], `type`: nodeLib.nodeLibStrings.TXT): AnyTxtRecord = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[AnyTxtRecord]
  }
}

