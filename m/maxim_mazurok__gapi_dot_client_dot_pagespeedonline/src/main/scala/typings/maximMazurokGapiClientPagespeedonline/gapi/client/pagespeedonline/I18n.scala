package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18n extends js.Object {
  
  /** Internationalized strings that are formatted to the locale in configSettings. */
  var rendererFormattedStrings: js.UndefOr[RendererFormattedStrings] = js.native
}
object I18n {
  
  @scala.inline
  def apply(): I18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18n]
  }
  
  @scala.inline
  implicit class I18nOps[Self <: I18n] (val x: Self) extends AnyVal {
    
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
    def setRendererFormattedStrings(value: RendererFormattedStrings): Self = this.set("rendererFormattedStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendererFormattedStrings: Self = this.set("rendererFormattedStrings", js.undefined)
  }
}
