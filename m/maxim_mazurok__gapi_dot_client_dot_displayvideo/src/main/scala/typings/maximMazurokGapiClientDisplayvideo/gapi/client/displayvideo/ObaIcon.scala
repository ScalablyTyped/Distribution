package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObaIcon extends js.Object {
  
  /** Required. The click tracking URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  
  /** The dimensions of the OBA icon. */
  var dimensions: js.UndefOr[Dimensions] = js.native
  
  /** Required. The landing page URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var landingPageUrl: js.UndefOr[String] = js.native
  
  /** The position of the OBA icon on the creative. */
  var position: js.UndefOr[String] = js.native
  
  /** The program of the OBA icon. For example: “AdChoices”. */
  var program: js.UndefOr[String] = js.native
  
  /** The MIME type of the OBA icon resource. */
  var resourceMimeType: js.UndefOr[String] = js.native
  
  /** The URL of the OBA icon resource. */
  var resourceUrl: js.UndefOr[String] = js.native
  
  /** Required. The view tracking URL of the OBA icon. Only URLs of the following domains are allowed: * https://info.evidon.com * https://l.betrad.com */
  var viewTrackingUrl: js.UndefOr[String] = js.native
}
object ObaIcon {
  
  @scala.inline
  def apply(): ObaIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObaIcon]
  }
  
  @scala.inline
  implicit class ObaIconOps[Self <: ObaIcon] (val x: Self) extends AnyVal {
    
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
    def setClickTrackingUrl(value: String): Self = this.set("clickTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTrackingUrl: Self = this.set("clickTrackingUrl", js.undefined)
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setLandingPageUrl(value: String): Self = this.set("landingPageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPageUrl: Self = this.set("landingPageUrl", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setProgram(value: String): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setResourceMimeType(value: String): Self = this.set("resourceMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceMimeType: Self = this.set("resourceMimeType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
    
    @scala.inline
    def setViewTrackingUrl(value: String): Self = this.set("viewTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewTrackingUrl: Self = this.set("viewTrackingUrl", js.undefined)
  }
}
