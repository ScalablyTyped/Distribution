package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchProvider extends StObject {
  
  def evalFilter(): Unit = js.native
  
  var extFilter: Boolean = js.native
  
  var fieldMap: js.Any = js.native
}
object ISearchProvider {
  
  @scala.inline
  def apply(evalFilter: () => Unit, extFilter: Boolean, fieldMap: js.Any): ISearchProvider = {
    val __obj = js.Dynamic.literal(evalFilter = js.Any.fromFunction0(evalFilter), extFilter = extFilter.asInstanceOf[js.Any], fieldMap = fieldMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchProvider]
  }
  
  @scala.inline
  implicit class ISearchProviderMutableBuilder[Self <: ISearchProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvalFilter(value: () => Unit): Self = StObject.set(x, "evalFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtFilter(value: Boolean): Self = StObject.set(x, "extFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMap(value: js.Any): Self = StObject.set(x, "fieldMap", value.asInstanceOf[js.Any])
  }
}
