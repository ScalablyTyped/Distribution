package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changes extends StObject {
  
  /**
    * Changed configuration settings.
    *
    * Example:
    * ```javascript
    *
    *  {
    *  	"/sap.card/configuration/filters/shipper/value": "key3",
    *  	"/sap.card/configuration/filters/item/value": "key2",
    *  }
    * ```
    */
  var changes: js.UndefOr[js.Object] = js.undefined
}
object Changes {
  
  inline def apply(): Changes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Changes] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: js.Object): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
  }
}
