package typings.oidcProvider.anon

import typings.oidcProvider.mod.CanBePromise
import typings.oidcProvider.mod.KoaContextWithOIDC
import typings.oidcProvider.mod.interactionPolicy.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var policy: js.UndefOr[js.Array[Prompt]] = js.undefined
  
  var url: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* interaction */ typings.oidcProvider.mod.Interaction, 
      CanBePromise[String]
    ]
  ] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: js.Array[Prompt]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: Prompt*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setUrl(
      value: (/* ctx */ KoaContextWithOIDC, /* interaction */ typings.oidcProvider.mod.Interaction) => CanBePromise[String]
    ): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
