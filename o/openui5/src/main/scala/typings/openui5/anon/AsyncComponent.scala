package typings.openui5.anon

import typings.openui5.sapUiCoreUicomponentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncComponent extends StObject {
  
  /**
    * @since 1.34 Whether the views which are created through this Views are loaded asyncly. This option can
    * be set only when the Views is used standalone without the involvement of a Router. Otherwise the async
    * option is inherited from the Router.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the owner of all the views that will be created by this Instance.
    */
  var component: js.UndefOr[default] = js.undefined
}
object AsyncComponent {
  
  inline def apply(): AsyncComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncComponent]
  }
  
  extension [Self <: AsyncComponent](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setComponent(value: default): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
