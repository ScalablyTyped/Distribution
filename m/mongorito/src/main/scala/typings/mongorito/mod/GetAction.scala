package typings.mongorito.mod

import typings.mongorito.mod.ActionTypes.GET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAction
  extends StObject
     with Action {
  
  var key: js.UndefOr[String] = js.undefined
  
  var `type`: GET
}
object GetAction {
  
  inline def apply(`type`: GET): GetAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAction]
  }
  
  extension [Self <: GetAction](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: GET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
