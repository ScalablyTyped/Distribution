package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyEvent extends js.Object {
  var feature: Feature
  var name: java.lang.String
  var newValue: js.Any
  var oldValue: js.Any
}

object PropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: java.lang.String, newValue: js.Any, oldValue: js.Any): PropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature, name = name, newValue = newValue, oldValue = oldValue)
  
    __obj.asInstanceOf[PropertyEvent]
  }
}

