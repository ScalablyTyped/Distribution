package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.REFRESH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshAction
  extends StObject
     with Action {
  
  var `type`: REFRESH
}
object RefreshAction {
  
  inline def apply(`type`: REFRESH): RefreshAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAction]
  }
  
  extension [Self <: RefreshAction](x: Self) {
    
    inline def setType(value: REFRESH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
