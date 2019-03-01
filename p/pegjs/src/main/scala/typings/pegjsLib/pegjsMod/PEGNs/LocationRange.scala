package typings
package pegjsLib.pegjsMod.PEGNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[LocationRange]
  }
}

