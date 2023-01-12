package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomListTargetingSetting extends StObject {
  
  /** Required. Custom id of custom list targeting setting. This id is custom_list_id. */
  var customListId: js.UndefOr[String] = js.undefined
}
object CustomListTargetingSetting {
  
  inline def apply(): CustomListTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomListTargetingSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomListTargetingSetting] (val x: Self) extends AnyVal {
    
    inline def setCustomListId(value: String): Self = StObject.set(x, "customListId", value.asInstanceOf[js.Any])
    
    inline def setCustomListIdUndefined: Self = StObject.set(x, "customListId", js.undefined)
  }
}
