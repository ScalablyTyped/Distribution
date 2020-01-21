package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeTrafficLights2Set extends /* index */ NumberDictionary[Icon] {
  var greenTrafficLight: Icon
  var redTrafficLight: Icon
  var yellowTrafficLight: Icon
}

object ThreeTrafficLights2Set {
  @scala.inline
  def apply(
    greenTrafficLight: Icon,
    redTrafficLight: Icon,
    yellowTrafficLight: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeTrafficLights2Set = {
    val __obj = js.Dynamic.literal(greenTrafficLight = greenTrafficLight.asInstanceOf[js.Any], redTrafficLight = redTrafficLight.asInstanceOf[js.Any], yellowTrafficLight = yellowTrafficLight.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeTrafficLights2Set]
  }
}

