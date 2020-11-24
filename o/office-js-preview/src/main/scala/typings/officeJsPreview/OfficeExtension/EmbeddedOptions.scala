package typings.officeJsPreview.OfficeExtension

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedOptions extends js.Object {
  
  var container: js.UndefOr[HTMLElement] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var sessionKey: js.UndefOr[String] = js.native
  
  var timeoutInMilliseconds: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object EmbeddedOptions {
  
  @scala.inline
  def apply(): EmbeddedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedOptions]
  }
  
  @scala.inline
  implicit class EmbeddedOptionsOps[Self <: EmbeddedOptions] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setTimeoutInMilliseconds(value: Double): Self = this.set("timeoutInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInMilliseconds: Self = this.set("timeoutInMilliseconds", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
