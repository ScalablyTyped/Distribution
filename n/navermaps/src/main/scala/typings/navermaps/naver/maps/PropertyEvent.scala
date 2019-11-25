package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyEvent extends js.Object {
  var feature: Feature
  var name: String
  var newValue: js.Any
  var oldValue: js.Any
}

object PropertyEvent {
  @scala.inline
  def apply(feature: Feature, name: String, newValue: js.Any, oldValue: js.Any): PropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyEvent]
  }
}

