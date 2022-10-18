package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeMetrics extends StObject {
  
  /** Output only. The system metrics. */
  var systemMetrics: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object RuntimeMetrics {
  
  inline def apply(): RuntimeMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeMetrics]
  }
  
  extension [Self <: RuntimeMetrics](x: Self) {
    
    inline def setSystemMetrics(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "systemMetrics", value.asInstanceOf[js.Any])
    
    inline def setSystemMetricsUndefined: Self = StObject.set(x, "systemMetrics", js.undefined)
  }
}
