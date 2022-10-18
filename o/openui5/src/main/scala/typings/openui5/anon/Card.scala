package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  /**
    * The card the changes are fired from.
    */
  var card: js.UndefOr[default] = js.undefined
  
  /**
    * Changed configuration settings.
    *
    * Example:
    * ```javascript
    *
    *  {
    *  	"/sap.card/configuration/filters/shipper/value": "key3",
    *  	"/sap.card/configuration/filters/item/value": "key2"
    *  }
    * ```
    */
  var changes: js.UndefOr[js.Object] = js.undefined
}
object Card {
  
  inline def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: default): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setChanges(value: js.Object): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
  }
}
