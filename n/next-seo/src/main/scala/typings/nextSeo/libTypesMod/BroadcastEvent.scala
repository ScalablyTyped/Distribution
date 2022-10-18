package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastEvent extends StObject {
  
  var endDate: String
  
  var isLiveBroadcast: Boolean
  
  var name: js.UndefOr[String] = js.undefined
  
  var startDate: String
}
object BroadcastEvent {
  
  inline def apply(endDate: String, isLiveBroadcast: Boolean, startDate: String): BroadcastEvent = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], isLiveBroadcast = isLiveBroadcast.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastEvent]
  }
  
  extension [Self <: BroadcastEvent](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setIsLiveBroadcast(value: Boolean): Self = StObject.set(x, "isLiveBroadcast", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
  }
}
