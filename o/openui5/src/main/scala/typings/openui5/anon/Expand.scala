package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  /**
    * If the panel will expand, this is true. If the panel will collapse, this is false.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifies whether the event is triggered by an user interaction or by calling setExpanded.
    */
  var triggeredByInteraction: js.UndefOr[Boolean] = js.undefined
}
object Expand {
  
  inline def apply(): Expand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand]
  }
  
  extension [Self <: Expand](x: Self) {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setTriggeredByInteraction(value: Boolean): Self = StObject.set(x, "triggeredByInteraction", value.asInstanceOf[js.Any])
    
    inline def setTriggeredByInteractionUndefined: Self = StObject.set(x, "triggeredByInteraction", js.undefined)
  }
}
