package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdAttribute[D] extends StObject {
  
  var idAttribute: js.UndefOr[String | js.Array[String]] = js.native
  
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
  
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.native
  
  var keys: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
  
  var sortComparators: js.UndefOr[SortComparators[D]] = js.native
}
object IdAttribute {
  
  @scala.inline
  def apply[D](): IdAttribute[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdAttribute[D]]
  }
  
  @scala.inline
  implicit class IdAttributeMutableBuilder[Self <: IdAttribute[_], D] (val x: Self with IdAttribute[D]) extends AnyVal {
    
    @scala.inline
    def setIdAttribute(value: String | js.Array[String]): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
    
    @scala.inline
    def setIdAttributeVarargs(value: String*): Self = StObject.set(x, "idAttribute", js.Array(value :_*))
    
    @scala.inline
    def setImplicitSort(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "implicitSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitSortUndefined: Self = StObject.set(x, "implicitSort", js.undefined)
    
    @scala.inline
    def setImplicitSortVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "implicitSort", js.Array(value :_*))
    
    @scala.inline
    def setKeyAttributes(value: String | js.Array[String]): Self = StObject.set(x, "keyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAttributesUndefined: Self = StObject.set(x, "keyAttributes", js.undefined)
    
    @scala.inline
    def setKeyAttributesVarargs(value: String*): Self = StObject.set(x, "keyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[_] | js.Function0[js.Array[_]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysFunction0(value: () => js.Array[_]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setSortComparators(value: SortComparators[D]): Self = StObject.set(x, "sortComparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortComparatorsUndefined: Self = StObject.set(x, "sortComparators", js.undefined)
  }
}
