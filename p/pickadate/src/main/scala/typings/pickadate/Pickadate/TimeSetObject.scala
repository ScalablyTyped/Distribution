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
  
  inline def apply(): TimeSetObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSetObject]
  }
  
  extension [Self <: TimeSetObject](x: Self) {
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
