package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchProvider extends StObject {
  
  def evalFilter(): Unit
  
  var extFilter: Boolean
  
  var fieldMap: Any
}
object ISearchProvider {
  
  inline def apply(evalFilter: () => Unit, extFilter: Boolean, fieldMap: Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = js.Any.fromFunction0(evalFilter), extFilter = extFilter.asInstanceOf[js.Any], fieldMap = fieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchProvider] (val x: Self) extends AnyVal {
    
    inline def setEvalFilter(value: () => Unit): Self = StObject.set(x, "evalFilter", js.Any.fromFunction0(value))
    
    inline def setExtFilter(value: Boolean): Self = StObject.set(x, "extFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldMap(value: Any): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
  }
}
