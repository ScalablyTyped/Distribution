package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQLResultSetRowList extends StObject {
  
  def item(index: Double): Any
  
  var length: Double
}
object SQLResultSetRowList {
  
  inline def apply(item: Double => Any, length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSetRowList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SQLResultSetRowList] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Double => Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
