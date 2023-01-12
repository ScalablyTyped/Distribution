package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardView extends StObject {
  
  var DashboardID: String
  
  val Events: IEvents
  
  var Name: String
}
object IMetadataCardView {
  
  inline def apply(DashboardID: String, Events: IEvents, Name: String): IMetadataCardView = {
    val __obj = js.Dynamic.literal(DashboardID = DashboardID.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardView] (val x: Self) extends AnyVal {
    
    inline def setDashboardID(value: String): Self = StObject.set(x, "DashboardID", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
