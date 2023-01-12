package typings.pkcs11js.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure that provides the parameters for the {@link CKM_ECDH1_DERIVE} and {@link CKM_ECDH1_COFACTOR_DERIVE} 
  * key derivation mechanisms, where each party contributes one key pair
  */
trait ECDH1
  extends StObject
     with IParams {
  
  /**
    * Key derivation function used on the shared secret value
    */
  var kdf: Double
  
  /**
    * The other party's EC public key
    */
  var publicData: Buffer
  
  /**
    * Some data shared between the two parties
    */
  var sharedData: js.UndefOr[Buffer] = js.undefined
}
object ECDH1 {
  
  inline def apply(kdf: Double, publicData: Buffer, `type`: Double): ECDH1 = {
    val __obj = js.Dynamic.literal(kdf = kdf.asInstanceOf[js.Any], publicData = publicData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDH1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECDH1] (val x: Self) extends AnyVal {
    
    inline def setKdf(value: Double): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
    
    inline def setPublicData(value: Buffer): Self = StObject.set(x, "publicData", value.asInstanceOf[js.Any])
    
    inline def setSharedData(value: Buffer): Self = StObject.set(x, "sharedData", value.asInstanceOf[js.Any])
    
    inline def setSharedDataUndefined: Self = StObject.set(x, "sharedData", js.undefined)
  }
}
