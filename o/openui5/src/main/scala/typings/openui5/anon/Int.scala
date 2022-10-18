package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int extends StObject {
  
  /**
    * Display format options for the values that contain dates. For a list of all available options, see {@link
    * sap.ui.core.format.DateFormat.getDateInstance DateFormat}.
    */
  var date: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Display format options for the values that contain numbers. For a list of all available options, see
    * {@link sap.ui.core.format.NumberFormat.getInstance NumberFormat}.
    */
  var int: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Display format options for the values that contain month names. The only supported option is the `pattern`
    * using the respective symbols for displaying months "MM", "MMM" or "MMMM".
    */
  var month: js.UndefOr[js.Object] = js.undefined
}
object Int {
  
  inline def apply(): Int = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Int]
  }
  
  extension [Self <: Int](x: Self) {
    
    inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setInt(value: js.Object): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setIntUndefined: Self = StObject.set(x, "int", js.undefined)
    
    inline def setMonth(value: js.Object): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
  }
}
