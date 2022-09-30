package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityUInfo extends StObject {
  
  var entityUInfo: js.UndefOr[String] = js.undefined
  
  var keyInfo: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var suppPubInfo: js.UndefOr[String] = js.undefined
}
object EntityUInfo {
  
  inline def apply(): EntityUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityUInfo]
  }
  
  extension [Self <: EntityUInfo](x: Self) {
    
    inline def setEntityUInfo(value: String): Self = StObject.set(x, "entityUInfo", value.asInstanceOf[js.Any])
    
    inline def setEntityUInfoUndefined: Self = StObject.set(x, "entityUInfo", js.undefined)
    
    inline def setKeyInfo(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
    
    inline def setKeyInfoUndefined: Self = StObject.set(x, "keyInfo", js.undefined)
    
    inline def setSuppPubInfo(value: String): Self = StObject.set(x, "suppPubInfo", value.asInstanceOf[js.Any])
    
    inline def setSuppPubInfoUndefined: Self = StObject.set(x, "suppPubInfo", js.undefined)
  }
}
