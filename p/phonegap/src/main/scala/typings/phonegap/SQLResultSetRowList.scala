package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQLResultSetRowList extends StObject {
  
  def item(index: Double): js.Any
  
  var length: Double
}
object SQLResultSetRowList {
  
  inline def apply(item: Double => js.Any, length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSetRowList]
  }
  
  extension [Self <: SQLResultSetRowList](x: Self) {
    
    inline def setItem(value: Double => js.Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
