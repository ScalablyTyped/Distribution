package typings.nodeDashGeocoder.nodeDashGeocoderMod

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
    val __obj = js.Dynamic.literal(error = error, value = value)
  
    __obj.asInstanceOf[BatchResult]
  }
}

