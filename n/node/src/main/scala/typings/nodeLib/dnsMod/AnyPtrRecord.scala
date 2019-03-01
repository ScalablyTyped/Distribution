package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyPtrRecord extends AnyRecord {
  var `type`: nodeLib.nodeLibStrings.PTR
  var value: java.lang.String
}

object AnyPtrRecord {
  @scala.inline
  def apply(`type`: nodeLib.nodeLibStrings.PTR, value: java.lang.String): AnyPtrRecord = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AnyPtrRecord]
  }
}

