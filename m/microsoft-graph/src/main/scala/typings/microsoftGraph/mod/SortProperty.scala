package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortProperty extends StObject {
  
  // True if the sort order is descending. Default is false, with the sort order as ascending. Optional.
  var isDescending: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The name of the property to sort on. Required.
  var name: js.UndefOr[String] = js.undefined
}
object SortProperty {
  
  inline def apply(): SortProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortProperty] (val x: Self) extends AnyVal {
    
    inline def setIsDescending(value: NullableOption[Boolean]): Self = StObject.set(x, "isDescending", value.asInstanceOf[js.Any])
    
    inline def setIsDescendingNull: Self = StObject.set(x, "isDescending", null)
    
    inline def setIsDescendingUndefined: Self = StObject.set(x, "isDescending", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
