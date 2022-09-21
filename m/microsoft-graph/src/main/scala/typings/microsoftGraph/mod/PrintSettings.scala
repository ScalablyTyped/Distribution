package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintSettings extends StObject {
  
  /**
    * Specifies whether document conversion is enabled for the tenant. If document conversion is enabled, Universal Print
    * service will automatically convert documents into a format compatible with the printer (xps to pdf) when needed.
    */
  var documentConversionEnabled: js.UndefOr[Boolean] = js.undefined
}
object PrintSettings {
  
  inline def apply(): PrintSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintSettings]
  }
  
  extension [Self <: PrintSettings](x: Self) {
    
    inline def setDocumentConversionEnabled(value: Boolean): Self = StObject.set(x, "documentConversionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDocumentConversionEnabledUndefined: Self = StObject.set(x, "documentConversionEnabled", js.undefined)
  }
}
