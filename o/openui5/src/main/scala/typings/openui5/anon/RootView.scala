package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootView extends StObject {
  
  /**
    * By default, the root view will be set to the ID of the view returned by the {@link sap.ui.core.UIComponent#getRootView}
    * function. You should not set this parameter if you create a view with the UIComponent.
    */
  var rootView: js.UndefOr[String] = js.undefined
  
  /**
    * Since 1.20. The qualified name (in dot notation) or the constructor of the router class that should be
    * used for the component's router. If you are using an own router extension, it has to be required before
    * the constructor of the component is invoked. If you use `sap.m.routing.Router`, the component will automatically
    * create an {@link sap.m.routing.Targets} instance. If you pass a function, it has to be the constructor
    * of a class that extends a router.
    */
  var routerClass: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Since 1.28.1. The qualified name (in dot notation) or the constructor of the `Targets` class that should
    * be used by the component's router. If you are using an own `Targets` extension, it has to be required
    * before the constructor of the component is invoked. If you define routes in your routing section, this
    * parameter will be ignored and the `Targets` instance of the router will be taken, see {@link sap.ui.core.routing.Router#getTargets}.
    */
  var targetsClass: js.UndefOr[String | js.Function] = js.undefined
}
object RootView {
  
  inline def apply(): RootView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootView] (val x: Self) extends AnyVal {
    
    inline def setRootView(value: String): Self = StObject.set(x, "rootView", value.asInstanceOf[js.Any])
    
    inline def setRootViewUndefined: Self = StObject.set(x, "rootView", js.undefined)
    
    inline def setRouterClass(value: String | js.Function): Self = StObject.set(x, "routerClass", value.asInstanceOf[js.Any])
    
    inline def setRouterClassUndefined: Self = StObject.set(x, "routerClass", js.undefined)
    
    inline def setTargetsClass(value: String | js.Function): Self = StObject.set(x, "targetsClass", value.asInstanceOf[js.Any])
    
    inline def setTargetsClassUndefined: Self = StObject.set(x, "targetsClass", js.undefined)
  }
}
