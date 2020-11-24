package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaLiveRegion extends js.Object {
  
  var ariaLiveRegion: js.UndefOr[NavigationFromKeyboard] = js.native
  
  var labelLandmark: js.UndefOr[String] = js.native
}
object AriaLiveRegion {
  
  @scala.inline
  def apply(): AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaLiveRegion]
  }
  
  @scala.inline
  implicit class AriaLiveRegionOps[Self <: AriaLiveRegion] (val x: Self) extends AnyVal {
    
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
    def setAriaLiveRegion(value: NavigationFromKeyboard): Self = this.set("ariaLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLiveRegion: Self = this.set("ariaLiveRegion", js.undefined)
    
    @scala.inline
    def setLabelLandmark(value: String): Self = this.set("labelLandmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLandmark: Self = this.set("labelLandmark", js.undefined)
  }
}
