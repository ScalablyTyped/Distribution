package typings.muiDatatables

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataKey extends js.Object {
  var data: js.Array[AnonDataIndexIndex]
  var lookup: NumberDictionary[Boolean]
}

object AnonDataKey {
  @scala.inline
  def apply(data: js.Array[AnonDataIndexIndex], lookup: NumberDictionary[Boolean]): AnonDataKey = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataKey]
  }
}

