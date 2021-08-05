package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportProductSetsInputConfig extends StObject {
  
  /** The Google Cloud Storage location for a csv file which preserves a list of ImportProductSetRequests in each line. */
  var gcsSource: js.UndefOr[ImportProductSetsGcsSource] = js.undefined
}
object ImportProductSetsInputConfig {
  
  inline def apply(): ImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportProductSetsInputConfig]
  }
  
  extension [Self <: ImportProductSetsInputConfig](x: Self) {
    
    inline def setGcsSource(value: ImportProductSetsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
