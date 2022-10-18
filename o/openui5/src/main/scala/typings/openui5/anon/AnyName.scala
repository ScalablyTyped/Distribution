package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyName extends StObject {
  
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
    *             type: "View",
    *             name: "Bye",
    *             viewType: "JS",
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
    */
  var anyName: ClearControlAggregation
}
object AnyName {
  
  inline def apply(anyName: ClearControlAggregation): AnyName = {
    val __obj = js.Dynamic.literal(anyName = anyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyName]
  }
  
  extension [Self <: AnyName](x: Self) {
    
    inline def setAnyName(value: ClearControlAggregation): Self = StObject.set(x, "anyName", value.asInstanceOf[js.Any])
  }
}
