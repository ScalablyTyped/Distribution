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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyPtrRecord]
  }
}

