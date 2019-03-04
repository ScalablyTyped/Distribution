package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeTrafficLights2Set
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeTrafficLights2Set = {
    val __obj = js.Dynamic.literal(greenTrafficLight = greenTrafficLight, redTrafficLight = redTrafficLight, yellowTrafficLight = yellowTrafficLight)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeTrafficLights2Set]
  }
}

