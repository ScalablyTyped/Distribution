package typings.oidcProvider.anon

import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  var client: js.UndefOr[typings.oidcProvider.mod.Client] = js.undefined
  
  var ctx: js.UndefOr[KoaContextWithOIDC] = js.undefined
}
object Ctx {
  
  inline def apply(): Ctx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ctx]
  }
  
  extension [Self <: Ctx](x: Self) {
    
    inline def setClient(value: typings.oidcProvider.mod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setCtx(value: KoaContextWithOIDC): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
  }
}
