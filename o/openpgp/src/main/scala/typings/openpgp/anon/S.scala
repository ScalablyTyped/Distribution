package typings.openpgp.anon

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S extends StObject {
  
  var S: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  var V: Uint8Array = js.native
}
object S {
  
  @scala.inline
  def apply(
    S: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    V: Uint8Array
  ): S = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  
  @scala.inline
  implicit class SMutableBuilder[Self <: S] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Uint8Array): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
  }
}
