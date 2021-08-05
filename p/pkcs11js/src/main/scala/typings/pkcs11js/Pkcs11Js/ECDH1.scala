package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECDH1
  extends StObject
     with IParams {
  
  var kdf: Double
  
  var publicData: Buffer
  
  var sharedData: js.UndefOr[Buffer] = js.undefined
}
object ECDH1 {
  
  inline def apply(kdf: Double, publicData: Buffer, `type`: Double): ECDH1 = {
    val __obj = js.Dynamic.literal(kdf = kdf.asInstanceOf[js.Any], publicData = publicData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDH1]
  }
  
  extension [Self <: ECDH1](x: Self) {
    
    inline def setKdf(value: Double): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
    
    inline def setPublicData(value: Buffer): Self = StObject.set(x, "publicData", value.asInstanceOf[js.Any])
    
    inline def setSharedData(value: Buffer): Self = StObject.set(x, "sharedData", value.asInstanceOf[js.Any])
    
    inline def setSharedDataUndefined: Self = StObject.set(x, "sharedData", js.undefined)
  }
}
