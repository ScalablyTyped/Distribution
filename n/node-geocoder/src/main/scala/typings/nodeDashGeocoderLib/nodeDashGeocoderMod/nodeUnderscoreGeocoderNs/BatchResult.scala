package typings
package nodeDashGeocoderLib.nodeDashGeocoderMod.nodeUnderscoreGeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResult extends js.Object {
  var error: js.Any
  var value: js.Array[Entry]
}

object BatchResult {
  @scala.inline
  def apply(error: js.Any, value: js.Array[Entry]): BatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BatchResult]
  }
}

