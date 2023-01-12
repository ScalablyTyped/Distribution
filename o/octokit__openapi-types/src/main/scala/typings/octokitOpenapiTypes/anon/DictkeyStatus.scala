package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyStatus
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** @enum {undefined} */
  var status: js.UndefOr[queued_ | in_progress] = js.undefined
}
object DictkeyStatus {
  
  inline def apply(): DictkeyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkeyStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: queued_ | in_progress): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
