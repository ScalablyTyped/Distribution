package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevocationDetails extends StObject {
  
  /** Indicates why a Certificate was revoked. */
  var revocationState: js.UndefOr[String] = js.undefined
  
  /** The time at which this Certificate was revoked. */
  var revocationTime: js.UndefOr[String] = js.undefined
}
object RevocationDetails {
  
  inline def apply(): RevocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevocationDetails]
  }
  
  extension [Self <: RevocationDetails](x: Self) {
    
    inline def setRevocationState(value: String): Self = StObject.set(x, "revocationState", value.asInstanceOf[js.Any])
    
    inline def setRevocationStateUndefined: Self = StObject.set(x, "revocationState", js.undefined)
    
    inline def setRevocationTime(value: String): Self = StObject.set(x, "revocationTime", value.asInstanceOf[js.Any])
    
    inline def setRevocationTimeUndefined: Self = StObject.set(x, "revocationTime", js.undefined)
  }
}
