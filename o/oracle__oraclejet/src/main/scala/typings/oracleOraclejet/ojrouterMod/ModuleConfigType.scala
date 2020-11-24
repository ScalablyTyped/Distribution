package typings.oracleOraclejet.ojrouterMod

import typings.oracleOraclejet.anon.Attached
import typings.oracleOraclejet.anon.OjRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ModuleConfigType extends js.Object {
  
  var lifecycleListener: Attached = js.native
  
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any = js.native
  
  var params: OjRouter = js.native
}
object ModuleConfigType {
  
  @scala.inline
  def apply(
    lifecycleListener: Attached,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any,
    params: OjRouter
  ): ModuleConfigType = {
    val __obj = js.Dynamic.literal(lifecycleListener = lifecycleListener.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleConfigType]
  }
  
  @scala.inline
  implicit class ModuleConfigTypeOps[Self <: ModuleConfigType] (val x: Self) extends AnyVal {
    
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
    def setLifecycleListener(value: Attached): Self = this.set("lifecycleListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: OjRouter): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
