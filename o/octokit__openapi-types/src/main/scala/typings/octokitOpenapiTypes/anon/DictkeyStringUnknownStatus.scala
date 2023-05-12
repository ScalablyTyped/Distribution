package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyStringUnknownStatus
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** @enum {unknown} */
  var status: js.UndefOr[completed] = js.undefined
}
object DictkeyStringUnknownStatus {
  
  inline def apply(): DictkeyStringUnknownStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyStringUnknownStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkeyStringUnknownStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
