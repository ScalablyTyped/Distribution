package typings.nobleSecp256k1

import typings.nobleSecp256k1.mod.Hex
import typings.nobleSecp256k1.mod.SchnorrSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofSchnorrSignature extends StObject {
    
    /* static member */
    def fromHex(hex: Hex): SchnorrSignature
  }
  object TypeofSchnorrSignature {
    
    inline def apply(fromHex: Hex => SchnorrSignature): TypeofSchnorrSignature = {
      val __obj = js.Dynamic.literal(fromHex = js.Any.fromFunction1(fromHex))
      __obj.asInstanceOf[TypeofSchnorrSignature]
    }
    
    extension [Self <: TypeofSchnorrSignature](x: Self) {
      
      inline def setFromHex(value: Hex => SchnorrSignature): Self = StObject.set(x, "fromHex", js.Any.fromFunction1(value))
    }
  }
}
