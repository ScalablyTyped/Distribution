package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientRule extends js.Object {
  
  /** The final interpolation point. */
  var maxpoint: js.UndefOr[InterpolationPoint] = js.native
  
  /** An optional midway interpolation point. */
  var midpoint: js.UndefOr[InterpolationPoint] = js.native
  
  /** The starting interpolation point. */
  var minpoint: js.UndefOr[InterpolationPoint] = js.native
}
object GradientRule {
  
  @scala.inline
  def apply(): GradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientRule]
  }
  
  @scala.inline
  implicit class GradientRuleOps[Self <: GradientRule] (val x: Self) extends AnyVal {
    
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
    def setMaxpoint(value: InterpolationPoint): Self = this.set("maxpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxpoint: Self = this.set("maxpoint", js.undefined)
    
    @scala.inline
    def setMidpoint(value: InterpolationPoint): Self = this.set("midpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidpoint: Self = this.set("midpoint", js.undefined)
    
    @scala.inline
    def setMinpoint(value: InterpolationPoint): Self = this.set("minpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinpoint: Self = this.set("minpoint", js.undefined)
  }
}
