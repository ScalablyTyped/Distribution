package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S extends StObject {
  
  var S: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
  
  var V: js.typedarray.Uint8Array
}
object S {
  
  inline def apply(
    S: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
    V: js.typedarray.Uint8Array
  ): S = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S] (val x: Self) extends AnyVal {
    
    inline def setS(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    ): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    
    inline def setV(value: js.typedarray.Uint8Array): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
