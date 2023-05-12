package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Admin extends StObject {
  
  // A container for Microsoft Edge resources. Read-only.
  var edge: js.UndefOr[NullableOption[Edge]] = js.undefined
  
  // A container for service communications resources. Read-only.
  var serviceAnnouncement: js.UndefOr[NullableOption[ServiceAnnouncement]] = js.undefined
  
  var sharepoint: js.UndefOr[NullableOption[Sharepoint]] = js.undefined
}
object Admin {
  
  inline def apply(): Admin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Admin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Admin] (val x: Self) extends AnyVal {
    
    inline def setEdge(value: NullableOption[Edge]): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeNull: Self = StObject.set(x, "edge", null)
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setServiceAnnouncement(value: NullableOption[ServiceAnnouncement]): Self = StObject.set(x, "serviceAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setServiceAnnouncementNull: Self = StObject.set(x, "serviceAnnouncement", null)
    
    inline def setServiceAnnouncementUndefined: Self = StObject.set(x, "serviceAnnouncement", js.undefined)
    
    inline def setSharepoint(value: NullableOption[Sharepoint]): Self = StObject.set(x, "sharepoint", value.asInstanceOf[js.Any])
    
    inline def setSharepointNull: Self = StObject.set(x, "sharepoint", null)
    
    inline def setSharepointUndefined: Self = StObject.set(x, "sharepoint", js.undefined)
  }
}
