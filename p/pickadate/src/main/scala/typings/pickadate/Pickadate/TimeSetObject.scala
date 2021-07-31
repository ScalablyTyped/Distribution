package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSetObject
  extends StObject
     with SetObject {
  
  /**
    * Choose the minutes interval between each time in the list.
    * Defaults to 30.
    */
  var interval: js.UndefOr[Double] = js.undefined
}
object TimeSetObject {
  
  @scala.inline
  def apply(): TimeSetObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSetObject]
  }
  
  @scala.inline
  implicit class TimeSetObjectMutableBuilder[Self <: TimeSetObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
