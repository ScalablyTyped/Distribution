package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PSKCallbackNegotation extends StObject {
  
  var identity: String
  
  var psk: js.typedarray.DataView | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.TypedArray */ Any)
}
object PSKCallbackNegotation {
  
  inline def apply(
    identity: String,
    psk: js.typedarray.DataView | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.TypedArray */ Any)
  ): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
  
  extension [Self <: PSKCallbackNegotation](x: Self) {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setPsk(
      value: js.typedarray.DataView | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.TypedArray */ Any)
    ): Self = StObject.set(x, "psk", value.asInstanceOf[js.Any])
  }
}
