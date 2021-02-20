package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconModule extends StObject {
  
  var icon: String = js.native
  
  var module: String = js.native
  
  var req: js.UndefOr[js.Object] = js.native
}
object IconModule {
  
  @scala.inline
  def apply(icon: String, module: String): IconModule = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconModule]
  }
  
  @scala.inline
  implicit class IconModuleMutableBuilder[Self <: IconModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
