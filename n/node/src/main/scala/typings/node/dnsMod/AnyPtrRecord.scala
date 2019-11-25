package typings.node.dnsMod

import typings.node.nodeStrings.PTR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyPtrRecord extends AnyRecord {
  var `type`: PTR
  var value: java.lang.String
}

object AnyPtrRecord {
  @scala.inline
  def apply(`type`: PTR, value: java.lang.String): AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyPtrRecord]
  }
}

