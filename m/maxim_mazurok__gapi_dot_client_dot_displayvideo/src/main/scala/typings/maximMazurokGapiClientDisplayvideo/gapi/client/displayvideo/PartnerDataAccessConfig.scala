package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerDataAccessConfig extends StObject {
  
  /** Structured Data Files (SDF) settings for the partner. The SDF configuration for the partner. */
  var sdfConfig: js.UndefOr[SdfConfig] = js.undefined
}
object PartnerDataAccessConfig {
  
  inline def apply(): PartnerDataAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerDataAccessConfig]
  }
  
  extension [Self <: PartnerDataAccessConfig](x: Self) {
    
    inline def setSdfConfig(value: SdfConfig): Self = StObject.set(x, "sdfConfig", value.asInstanceOf[js.Any])
    
    inline def setSdfConfigUndefined: Self = StObject.set(x, "sdfConfig", js.undefined)
  }
}
