package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Admin extends StObject {
  
  // A container for service communications resources. Read-only.
  var serviceAnnouncement: js.UndefOr[NullableOption[ServiceAnnouncement]] = js.undefined
}
object Admin {
  
  inline def apply(): Admin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Admin]
  }
  
  extension [Self <: Admin](x: Self) {
    
    inline def setServiceAnnouncement(value: NullableOption[ServiceAnnouncement]): Self = StObject.set(x, "serviceAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setServiceAnnouncementNull: Self = StObject.set(x, "serviceAnnouncement", null)
    
    inline def setServiceAnnouncementUndefined: Self = StObject.set(x, "serviceAnnouncement", js.undefined)
  }
}
