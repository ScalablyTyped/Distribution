package typings.nodeDashStatic.nodeDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteRange extends js.Object {
  var from: Double
  var to: Double
  var valid: Boolean
}

object ByteRange {
  @scala.inline
  def apply(from: Double, to: Double, valid: Boolean): ByteRange = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ByteRange]
  }
}

