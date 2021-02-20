package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartCustomNumberFormatOptions extends StObject {
  
  /** Custom prefix to be prepended to the chart attribute. This field is optional. */
  var prefix: js.UndefOr[String] = js.native
  
  /** Custom suffix to be appended to the chart attribute. This field is optional. */
  var suffix: js.UndefOr[String] = js.native
}
object ChartCustomNumberFormatOptions {
  
  @scala.inline
  def apply(): ChartCustomNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCustomNumberFormatOptions]
  }
  
  @scala.inline
  implicit class ChartCustomNumberFormatOptionsMutableBuilder[Self <: ChartCustomNumberFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
