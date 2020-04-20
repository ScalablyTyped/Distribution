package typings.muiDatatables

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLookup extends js.Object {
  var data: js.Array[AnonIndex]
  var lookup: NumberDictionary[Boolean]
}

object AnonLookup {
  @scala.inline
  def apply(data: js.Array[AnonIndex], lookup: NumberDictionary[Boolean]): AnonLookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLookup]
  }
}

