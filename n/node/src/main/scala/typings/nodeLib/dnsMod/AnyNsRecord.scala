package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyNsRecord extends AnyRecord {
  var `type`: nodeLib.nodeLibStrings.NS
  var value: java.lang.String
}

object AnyNsRecord {
  @scala.inline
  def apply(`type`: nodeLib.nodeLibStrings.NS, value: java.lang.String): AnyNsRecord = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AnyNsRecord]
  }
}

