package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  var provider: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
  ] = js.undefined
  
  var providers: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
  ]
}
object Provider {
  
  inline def apply(
    providers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
    ]
  ): Provider = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setProvider(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
    ): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setProviders(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any)*
    ): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
