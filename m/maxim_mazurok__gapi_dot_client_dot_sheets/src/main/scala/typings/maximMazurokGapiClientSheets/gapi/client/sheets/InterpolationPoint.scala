package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolationPoint extends js.Object {
  
  /** The color this interpolation point should use. */
  var color: js.UndefOr[Color] = js.native
  
  /** The color this interpolation point should use. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** How the value should be interpreted. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The value this interpolation point uses. May be a formula. Unused if type is MIN or MAX. */
  var value: js.UndefOr[String] = js.native
}
object InterpolationPoint {
  
  @scala.inline
  def apply(): InterpolationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationPoint]
  }
  
  @scala.inline
  implicit class InterpolationPointOps[Self <: InterpolationPoint] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorStyle(value: ColorStyle): Self = this.set("colorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorStyle: Self = this.set("colorStyle", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
