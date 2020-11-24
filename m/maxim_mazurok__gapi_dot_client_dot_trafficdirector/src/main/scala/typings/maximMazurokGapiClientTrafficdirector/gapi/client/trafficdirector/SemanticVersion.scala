package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticVersion extends js.Object {
  
  var majorNumber: js.UndefOr[Double] = js.native
  
  var minorNumber: js.UndefOr[Double] = js.native
  
  var patch: js.UndefOr[Double] = js.native
}
object SemanticVersion {
  
  @scala.inline
  def apply(): SemanticVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticVersion]
  }
  
  @scala.inline
  implicit class SemanticVersionOps[Self <: SemanticVersion] (val x: Self) extends AnyVal {
    
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
    def setMajorNumber(value: Double): Self = this.set("majorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorNumber: Self = this.set("majorNumber", js.undefined)
    
    @scala.inline
    def setMinorNumber(value: Double): Self = this.set("minorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorNumber: Self = this.set("minorNumber", js.undefined)
    
    @scala.inline
    def setPatch(value: Double): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
  }
}
