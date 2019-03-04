package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyCnameRecord extends AnyRecord {
  var `type`: nodeLib.nodeLibStrings.CNAME
  var value: java.lang.String
}

object AnyCnameRecord {
  @scala.inline
  def apply(`type`: nodeLib.nodeLibStrings.CNAME, value: java.lang.String): AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyCnameRecord]
  }
}

