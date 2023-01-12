package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeItem
  extends StObject
     with Item {
  
  /**
    * Hour of the day from 0 to 23.
    */
  var hour: Double
  
  /**
    * The minutes of the hour from 0 to 59 (based on the interval).
    */
  var mins: Double
}
object TimeItem {
  
  inline def apply(hour: Double, mins: Double, pick: Double): TimeItem = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], mins = mins.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeItem] (val x: Self) extends AnyVal {
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMins(value: Double): Self = StObject.set(x, "mins", value.asInstanceOf[js.Any])
  }
}
