package typings.node.dnsMod

import typings.node.nodeStrings.NS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyNsRecord extends AnyRecord {
  var `type`: NS
  var value: java.lang.String
}

object AnyNsRecord {
  @scala.inline
  def apply(`type`: NS, value: java.lang.String): AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyNsRecord]
  }
}

