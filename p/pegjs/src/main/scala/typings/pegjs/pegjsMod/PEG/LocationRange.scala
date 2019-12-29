package typings.pegjs.pegjsMod.PEG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRange extends js.Object {
  var end: Location
  var start: Location
}

object LocationRange {
  @scala.inline
  def apply(end: Location, start: Location): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRange]
  }
}

