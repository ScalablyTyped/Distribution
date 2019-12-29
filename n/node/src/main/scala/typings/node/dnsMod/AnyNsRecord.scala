package typings.node.dnsMod

import typings.node.nodeStrings.NS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyNsRecord extends AnyRecord {
  var `type`: NS
  var value: String
}

object AnyNsRecord {
  @scala.inline
  def apply(`type`: NS, value: String): AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNsRecord]
  }
}

