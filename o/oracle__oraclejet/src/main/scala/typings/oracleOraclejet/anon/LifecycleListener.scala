package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleListener extends js.Object {
  
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
  implicit class LifecycleListenerOps[Self <: LifecycleListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLifecycleListener(value: `17`): Self = this.set("lifecycleListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: OjRouterParentRouter): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
