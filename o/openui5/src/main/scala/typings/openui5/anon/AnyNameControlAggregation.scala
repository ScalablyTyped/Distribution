package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyNameControlAggregation extends StObject {
  
  /**
    * a new target, the key severs as a name. An example:
    * ```javascript
    *
    *
    * {
    *     targets: {
    *         welcome: {
    *             type: "View",
    *             name: "Welcome",
    *             viewType: "XML",
    *             ....
    *             // Other target parameters
    *         },
    *         goodbye: {
    *             type: "Component",
    *             usage: "myreuse",
    *             containerSettings: {
    *                 // settings for the component container
    *             }
    *             ....
    *             // Other target parameters
    *         }
    *     }
    * }
    *
    * ```
    *
    *
    * This will create two targets named 'welcome' and 'goodbye' you can display both of them or one of them
    * using the {@link #display} function.
    *
    * The 'welcome' target creates a View instance when it's displayed. The 'goodbye' target creates a Component
    * instance.
    *
    *
    * The settings for the Component are defined in the manifest of the owner component of the router under
    * path '/sap.ui5/componentUsages' and it can be used in the target by setting the 'usage' option with the
    * name in the 'componentUsages'.
    *  See the following manifest.json example of the owner component. There's a component settings object
    * defined with name "myreuse" which can be used to set the "usage" option in a target's configuration.
    *
    * ```javascript
    *
    *
    * {
    *     "sap.ui5": {
    *         "componentUsages": {
    *             "myreuse": {
    *                 "name": "reuse.component",
    *                 "settings": {},
    *                 "componentData": {},
    *                 "lazy": false,
    *             }
    *         }
    *     }
    * }
    *
    * ```
    */
  var anyName: ControlAggregation
}
object AnyNameControlAggregation {
  
  inline def apply(anyName: ControlAggregation): AnyNameControlAggregation = {
    val __obj = js.Dynamic.literal(anyName = anyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNameControlAggregation]
  }
  
  extension [Self <: AnyNameControlAggregation](x: Self) {
    
    inline def setAnyName(value: ControlAggregation): Self = StObject.set(x, "anyName", value.asInstanceOf[js.Any])
  }
}
