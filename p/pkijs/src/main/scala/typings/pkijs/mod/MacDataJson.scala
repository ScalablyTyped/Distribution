package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacDataJson extends StObject {
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var mac: DigestInfoJson
  
  var macSalt: OctetStringJson
}
object MacDataJson {
  
  inline def apply(mac: DigestInfoJson, macSalt: OctetStringJson): MacDataJson = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], macSalt = macSalt.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacDataJson]
  }
  
  extension [Self <: MacDataJson](x: Self) {
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setMac(value: DigestInfoJson): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacSalt(value: OctetStringJson): Self = StObject.set(x, "macSalt", value.asInstanceOf[js.Any])
  }
}
