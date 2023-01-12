package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayData extends StObject {
  
  var displayData: typings.muiDatatables.mod.DisplayData
}
object DisplayData {
  
  inline def apply(displayData: typings.muiDatatables.mod.DisplayData): DisplayData = {
    val __obj = js.Dynamic.literal(displayData = displayData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayData] (val x: Self) extends AnyVal {
    
    inline def setDisplayData(value: typings.muiDatatables.mod.DisplayData): Self = StObject.set(x, "displayData", value.asInstanceOf[js.Any])
    
    inline def setDisplayDataVarargs(value: Data*): Self = StObject.set(x, "displayData", js.Array(value*))
  }
}
