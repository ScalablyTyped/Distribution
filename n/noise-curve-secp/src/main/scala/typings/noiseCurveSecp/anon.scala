package typings.noiseCurveSecp

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<noise-curve-secp.noise-curve-secp.KeyPair, 'secretKey'> */
  trait PickKeyPairsecretKey extends StObject {
    
    var secretKey: Buffer | js.typedarray.Uint8Array
  }
  object PickKeyPairsecretKey {
    
    inline def apply(secretKey: Buffer | js.typedarray.Uint8Array): PickKeyPairsecretKey = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickKeyPairsecretKey]
    }
    
    extension [Self <: PickKeyPairsecretKey](x: Self) {
      
      inline def setSecretKey(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
