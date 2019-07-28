package typings.pegjs.pegjsMod.PEGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRange extends js.Object {
  var end: typings.pegjs.pegjsMod.PEGNs.Location
  var start: typings.pegjs.pegjsMod.PEGNs.Location
}

object LocationRange {
  @scala.inline
  def apply(end: typings.pegjs.pegjsMod.PEGNs.Location, start: typings.pegjs.pegjsMod.PEGNs.Location): LocationRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[LocationRange]
  }
}

