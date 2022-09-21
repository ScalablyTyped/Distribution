package typings.microsoftGraph.mod.CallRecords

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientUserAgent
  extends StObject
     with UserAgent {
  
  /**
    * Identifies the platform used by this endpoint. Possible values are: unknown, windows, macOS, iOS, android, web,
    * ipPhone, roomSystem, surfaceHub, holoLens, unknownFutureValue.
    */
  var platform: js.UndefOr[ClientPlatform] = js.undefined
  
  /**
    * Identifies the family of application software used by this endpoint. Possible values are: unknown, teams,
    * skypeForBusiness, lync, unknownFutureValue, azureCommunicationServices. Note that you must use the Prefer:
    * include-unknown-enum-members request header to get the following value(s) in this evolvable enum:
    * azureCommunicationServices.
    */
  var productFamily: js.UndefOr[ProductFamily] = js.undefined
}
object ClientUserAgent {
  
  inline def apply(): ClientUserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientUserAgent]
  }
  
  extension [Self <: ClientUserAgent](x: Self) {
    
    inline def setPlatform(value: ClientPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProductFamily(value: ProductFamily): Self = StObject.set(x, "productFamily", value.asInstanceOf[js.Any])
    
    inline def setProductFamilyUndefined: Self = StObject.set(x, "productFamily", js.undefined)
  }
}
