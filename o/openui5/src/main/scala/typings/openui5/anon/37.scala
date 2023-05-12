package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  /**
    * Since 1.28. One or multiple names of targets that will be displayed, if no route of the router is matched.
    *  A typical use case is a not found page.
    *  The current hash will be passed to the display event of the target.
    *  **Example:**
    * ```javascript
    *
    *     new Router(
    *     // Routes
    *     [
    *         // Any route here
    *     ],
    *     {
    *         bypassed: {
    *             // you will find this name in the target config
    *             target: "notFound"
    *         }
    *     },
    *     // You should only use this constructor when you are not using a router with a component. Please use the metadata of a component to define your routes and targets. The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
    *     null,
    *     // Target config
    *     {
    *          //same name as in the config.bypassed.target
    *          notFound: {
    *              type: "View"
    *              name: "notFound",
    *              ...
    *              // more properties to place the view in the correct container
    *          }
    *     });
    * ```
    */
  var target: js.UndefOr[String | js.Array[String]] = js.undefined
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `37`] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
  }
}
