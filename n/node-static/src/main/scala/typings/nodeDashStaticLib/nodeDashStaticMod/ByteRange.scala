package typings
package nodeDashStaticLib.nodeDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteRange extends js.Object {
  var from: scala.Double
  var to: scala.Double
  var valid: scala.Boolean
}

object ByteRange {
  @scala.inline
  def apply(from: scala.Double, to: scala.Double, valid: scala.Boolean): ByteRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[ByteRange]
  }
}

