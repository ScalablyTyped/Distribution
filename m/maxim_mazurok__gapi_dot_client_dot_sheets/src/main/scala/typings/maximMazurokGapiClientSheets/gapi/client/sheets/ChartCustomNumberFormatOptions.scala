package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartCustomNumberFormatOptions extends StObject {
  
  /** Custom prefix to be prepended to the chart attribute. This field is optional. */
  var prefix: js.UndefOr[String] = js.undefined
  
  /** Custom suffix to be appended to the chart attribute. This field is optional. */
  var suffix: js.UndefOr[String] = js.undefined
}
object ChartCustomNumberFormatOptions {
  
  inline def apply(): ChartCustomNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCustomNumberFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartCustomNumberFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
