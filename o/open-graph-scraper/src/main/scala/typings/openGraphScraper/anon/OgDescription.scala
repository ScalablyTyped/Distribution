package typings.openGraphScraper.anon

import typings.openGraphScraper.openGraphScraperBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OgDescription extends js.Object {
  
  var ogDescription: js.UndefOr[String] = js.native
  
  var ogImage: js.UndefOr[Height] = js.native
  
  var ogTitle: js.UndefOr[String] = js.native
  
  var ogType: js.UndefOr[String] = js.native
  
  var ogUrl: js.UndefOr[String] = js.native
  
  var requestUrl: String = js.native
  
  var success: `true` = js.native
}
object OgDescription {
  
  @scala.inline
  def apply(requestUrl: String, success: `true`): OgDescription = {
    val __obj = js.Dynamic.literal(requestUrl = requestUrl.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[OgDescription]
  }
  
  @scala.inline
  implicit class OgDescriptionOps[Self <: OgDescription] (val x: Self) extends AnyVal {
    
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
    def setRequestUrl(value: String): Self = this.set("requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOgDescription(value: String): Self = this.set("ogDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgDescription: Self = this.set("ogDescription", js.undefined)
    
    @scala.inline
    def setOgImage(value: Height): Self = this.set("ogImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgImage: Self = this.set("ogImage", js.undefined)
    
    @scala.inline
    def setOgTitle(value: String): Self = this.set("ogTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgTitle: Self = this.set("ogTitle", js.undefined)
    
    @scala.inline
    def setOgType(value: String): Self = this.set("ogType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgType: Self = this.set("ogType", js.undefined)
    
    @scala.inline
    def setOgUrl(value: String): Self = this.set("ogUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOgUrl: Self = this.set("ogUrl", js.undefined)
  }
}
