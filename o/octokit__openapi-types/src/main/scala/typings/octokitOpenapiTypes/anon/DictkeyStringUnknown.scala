package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyStringUnknown
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /** @enum {unknown} */
  var status: js.UndefOr[queued_ | in_progress] = js.undefined
}
object DictkeyStringUnknown {
  
  inline def apply(): DictkeyStringUnknown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyStringUnknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkeyStringUnknown] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: queued_ | in_progress): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
