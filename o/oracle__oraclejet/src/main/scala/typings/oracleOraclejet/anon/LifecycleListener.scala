package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleListener extends StObject {
  
  var lifecycleListener: `17` = js.native
  
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any = js.native
  
  var params: OjRouterParentRouter = js.native
}
object LifecycleListener {
  
  @scala.inline
  def apply(
    lifecycleListener: `17`,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any,
    params: OjRouterParentRouter
  ): LifecycleListener = {
    val __obj = js.Dynamic.literal(lifecycleListener = lifecycleListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleListener]
  }
  
  @scala.inline
  implicit class LifecycleListenerMutableBuilder[Self <: LifecycleListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecycleListener(value: `17`): Self = StObject.set(x, "lifecycleListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: OjRouterParentRouter): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
