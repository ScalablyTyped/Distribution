package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsFilter extends StObject {
  
  var all: String
  
  var reset: String
  
  var title: String
}
object MUIDataTableTextLabelsFilter {
  
  inline def apply(all: String, reset: String, title: String): MUIDataTableTextLabelsFilter = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTableTextLabelsFilter] (val x: Self) extends AnyVal {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
