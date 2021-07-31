package typings.moment.momentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekSpec extends StObject {
  
  var dow: Double
  
  var doy: js.UndefOr[Double] = js.undefined
}
object WeekSpec {
  
  @scala.inline
  def apply(dow: Double): WeekSpec = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekSpec]
  }
  
  @scala.inline
  implicit class WeekSpecMutableBuilder[Self <: WeekSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDow(value: Double): Self = StObject.set(x, "dow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoy(value: Double): Self = StObject.set(x, "doy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoyUndefined: Self = StObject.set(x, "doy", js.undefined)
  }
}
