package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommsNotification extends StObject {
  
  // Possible values are: created, updated, deleted.
  var changeType: js.UndefOr[ChangeType] = js.undefined
  
  // URI of the resource that was changed.
  var resourceUrl: js.UndefOr[String] = js.undefined
}
object CommsNotification {
  
  inline def apply(): CommsNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommsNotification] (val x: Self) extends AnyVal {
    
    inline def setChangeType(value: ChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
