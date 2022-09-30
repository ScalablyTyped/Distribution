package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMacData extends StObject {
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var mac: DigestInfo
  
  var macSalt: OctetString
}
object IMacData {
  
  inline def apply(mac: DigestInfo, macSalt: OctetString): IMacData = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], macSalt = macSalt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacData]
  }
  
  extension [Self <: IMacData](x: Self) {
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setMac(value: DigestInfo): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacSalt(value: OctetString): Self = StObject.set(x, "macSalt", value.asInstanceOf[js.Any])
  }
}
