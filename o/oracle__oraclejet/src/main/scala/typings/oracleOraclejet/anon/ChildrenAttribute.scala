package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import typings.oracleOraclejet.oracleOraclejetStrings.global
import typings.oracleOraclejet.oracleOraclejetStrings.siblings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenAttribute[D] extends StObject {
  
  var childrenAttribute: js.UndefOr[String] = js.undefined
  
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.undefined
  
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var keyAttributesScope: js.UndefOr[global | siblings] = js.undefined
  
  var sortComparators: js.UndefOr[SortComparators[D]] = js.undefined
}
object ChildrenAttribute {
  
  inline def apply[D](): ChildrenAttribute[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenAttribute[D]]
  }
  
  extension [Self <: ChildrenAttribute[?], D](x: Self & ChildrenAttribute[D]) {
    
    inline def setChildrenAttribute(value: String): Self = StObject.set(x, "childrenAttribute", value.asInstanceOf[js.Any])
    
    inline def setChildrenAttributeUndefined: Self = StObject.set(x, "childrenAttribute", js.undefined)
    
    inline def setImplicitSort(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "implicitSort", value.asInstanceOf[js.Any])
    
    inline def setImplicitSortUndefined: Self = StObject.set(x, "implicitSort", js.undefined)
    
    inline def setImplicitSortVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "implicitSort", js.Array(value :_*))
    
    inline def setKeyAttributes(value: String | js.Array[String]): Self = StObject.set(x, "keyAttributes", value.asInstanceOf[js.Any])
    
    inline def setKeyAttributesScope(value: global | siblings): Self = StObject.set(x, "keyAttributesScope", value.asInstanceOf[js.Any])
    
    inline def setKeyAttributesScopeUndefined: Self = StObject.set(x, "keyAttributesScope", js.undefined)
    
    inline def setKeyAttributesUndefined: Self = StObject.set(x, "keyAttributes", js.undefined)
    
    inline def setKeyAttributesVarargs(value: String*): Self = StObject.set(x, "keyAttributes", js.Array(value :_*))
    
    inline def setSortComparators(value: SortComparators[D]): Self = StObject.set(x, "sortComparators", value.asInstanceOf[js.Any])
    
    inline def setSortComparatorsUndefined: Self = StObject.set(x, "sortComparators", js.undefined)
  }
}
