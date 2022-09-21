package typings.netgear.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficStats extends StObject {
  
  var newMonthDownload: Double
  
  var newMonthUpload: Double
  
  var newTodayDownload: Double
  
  var newTodayUpload: Double
}
object TrafficStats {
  
  inline def apply(newMonthDownload: Double, newMonthUpload: Double, newTodayDownload: Double, newTodayUpload: Double): TrafficStats = {
    val __obj = js.Dynamic.literal(newMonthDownload = newMonthDownload.asInstanceOf[js.Any], newMonthUpload = newMonthUpload.asInstanceOf[js.Any], newTodayDownload = newTodayDownload.asInstanceOf[js.Any], newTodayUpload = newTodayUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficStats]
  }
  
  extension [Self <: TrafficStats](x: Self) {
    
    inline def setNewMonthDownload(value: Double): Self = StObject.set(x, "newMonthDownload", value.asInstanceOf[js.Any])
    
    inline def setNewMonthUpload(value: Double): Self = StObject.set(x, "newMonthUpload", value.asInstanceOf[js.Any])
    
    inline def setNewTodayDownload(value: Double): Self = StObject.set(x, "newTodayDownload", value.asInstanceOf[js.Any])
    
    inline def setNewTodayUpload(value: Double): Self = StObject.set(x, "newTodayUpload", value.asInstanceOf[js.Any])
  }
}
