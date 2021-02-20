package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsNotification extends StObject {
  
  // Possible values are: created, updated, deleted.
  var changeType: js.UndefOr[ChangeType] = js.native
  
  // URI of the resource that was changed.
  var resourceUrl: js.UndefOr[String] = js.native
}
object CommsNotification {
  
  @scala.inline
  def apply(): CommsNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotification]
  }
  
  @scala.inline
  implicit class CommsNotificationMutableBuilder[Self <: CommsNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
