package typings.openui5.anon

import typings.openui5.sapUiUx3ThingActionMod.ThingAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionId extends StObject {
  
  /**
    * Selected Thing Action
    */
  var action: js.UndefOr[ThingAction] = js.undefined
  
  /**
    * Id of selected action
    */
  var id: js.UndefOr[String] = js.undefined
}
object ActionId {
  
  inline def apply(): ActionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionId] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ThingAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
