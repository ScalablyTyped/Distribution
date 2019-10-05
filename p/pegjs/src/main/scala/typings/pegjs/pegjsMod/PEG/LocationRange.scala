package typings.pegjs.pegjsMod.PEG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRange extends js.Object {
  var end: typings.pegjs.pegjsMod.PEG.Location
  var start: typings.pegjs.pegjsMod.PEG.Location
}

object LocationRange {
  @scala.inline
  def apply(end: typings.pegjs.pegjsMod.PEG.Location, start: typings.pegjs.pegjsMod.PEG.Location): LocationRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[LocationRange]
  }
}

