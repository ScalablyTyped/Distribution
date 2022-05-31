package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleListener extends StObject {
  
  var lifecycleListener: `17`
  
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
  
  var params: OjRouterParentRouter
}
object LifecycleListener {
  
  inline def apply(
    lifecycleListener: `17`,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any,
    params: OjRouterParentRouter
  ): LifecycleListener = {
    val __obj = js.Dynamic.literal(lifecycleListener = lifecycleListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleListener]
  }
  
  extension [Self <: LifecycleListener](x: Self) {
    
    inline def setLifecycleListener(value: `17`): Self = StObject.set(x, "lifecycleListener", value.asInstanceOf[js.Any])
    
    inline def setName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParams(value: OjRouterParentRouter): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
