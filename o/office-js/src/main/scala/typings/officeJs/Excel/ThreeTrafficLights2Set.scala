package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeTrafficLights2Set extends /* index */ NumberDictionary[Icon] {
  var greenTrafficLight: Icon = js.native
  var redTrafficLight: Icon = js.native
  var yellowTrafficLight: Icon = js.native
}

object ThreeTrafficLights2Set {
  @scala.inline
  def apply(greenTrafficLight: Icon, redTrafficLight: Icon, yellowTrafficLight: Icon): ThreeTrafficLights2Set = {
    val __obj = js.Dynamic.literal(greenTrafficLight = greenTrafficLight.asInstanceOf[js.Any], redTrafficLight = redTrafficLight.asInstanceOf[js.Any], yellowTrafficLight = yellowTrafficLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrafficLights2Set]
  }
  @scala.inline
  implicit class ThreeTrafficLights2SetOps[Self <: ThreeTrafficLights2Set] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGreenTrafficLight(value: Icon): Self = this.set("greenTrafficLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedTrafficLight(value: Icon): Self = this.set("redTrafficLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowTrafficLight(value: Icon): Self = this.set("yellowTrafficLight", value.asInstanceOf[js.Any])
  }
  
}

