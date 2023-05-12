package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyStatus
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** @enum {unknown} */
  var status: completed
}
object DictkeyStatus {
  
  inline def apply(): DictkeyStatus = {
    val __obj = js.Dynamic.literal(status = "completed")
    __obj.asInstanceOf[DictkeyStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkeyStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
