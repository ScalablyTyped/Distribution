package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  /**
    * @since 1.34 Whether the views which are created through this Targets are loaded asyncly. This option
    * can be set only when the Targets is used standalone without the involvement of a Router. Otherwise the
    * async option is inherited from the Router.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The id of the rootView - This should be the id of the view that contains the control with the controlId
    * since the control will be retrieved by calling the {@link sap.ui.core.mvc.View#byId} function of the
    * rootView. If you are using a component and add the routing.targets **do not set this parameter**, since
    * the component will set the rootView to the view created by the {@link sap.ui.core.UIComponent#createContent}
    * function. If you specify the "parent" property of a target, the control will not be searched in the root
    * view but in the view Created by the parent (see parent documentation).
    */
  var rootView: js.UndefOr[String] = js.undefined
}
object Async {
  
  inline def apply(): Async = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setRootView(value: String): Self = StObject.set(x, "rootView", value.asInstanceOf[js.Any])
    
    inline def setRootViewUndefined: Self = StObject.set(x, "rootView", js.undefined)
  }
}
