package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdAttribute[D] extends StObject {
  
  var idAttribute: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
  
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var keys: js.UndefOr[js.Array[Any] | js.Function0[js.Array[Any]]] = js.undefined
  
  var sortComparators: js.UndefOr[SortComparators[D]] = js.undefined
}
object IdAttribute {
  
  inline def apply[D](): IdAttribute[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdAttribute[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdAttribute[?], D] (val x: Self & IdAttribute[D]) extends AnyVal {
    
    inline def setIdAttribute(value: String | js.Array[String]): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
    
    inline def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
    
    inline def setIdAttributeVarargs(value: String*): Self = StObject.set(x, "idAttribute", js.Array(value*))
    
    inline def setImplicitSort(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "implicitSort", value.asInstanceOf[js.Any])
    
    inline def setImplicitSortUndefined: Self = StObject.set(x, "implicitSort", js.undefined)
    
    inline def setImplicitSortVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "implicitSort", js.Array(value*))
    
    inline def setKeyAttributes(value: String | js.Array[String]): Self = StObject.set(x, "keyAttributes", value.asInstanceOf[js.Any])
    
    inline def setKeyAttributesUndefined: Self = StObject.set(x, "keyAttributes", js.undefined)
    
    inline def setKeyAttributesVarargs(value: String*): Self = StObject.set(x, "keyAttributes", js.Array(value*))
    
    inline def setKeys(value: js.Array[Any] | js.Function0[js.Array[Any]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysFunction0(value: () => js.Array[Any]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setSortComparators(value: SortComparators[D]): Self = StObject.set(x, "sortComparators", value.asInstanceOf[js.Any])
    
    inline def setSortComparatorsUndefined: Self = StObject.set(x, "sortComparators", js.undefined)
  }
}
