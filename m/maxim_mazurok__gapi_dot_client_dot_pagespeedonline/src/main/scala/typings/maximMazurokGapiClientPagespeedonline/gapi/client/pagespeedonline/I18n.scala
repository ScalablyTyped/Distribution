package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18n extends StObject {
  
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
  implicit class I18nMutableBuilder[Self <: I18n] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRendererFormattedStrings(value: RendererFormattedStrings): Self = StObject.set(x, "rendererFormattedStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererFormattedStringsUndefined: Self = StObject.set(x, "rendererFormattedStrings", js.undefined)
  }
}
