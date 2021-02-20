package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import typings.oracleOraclejet.oracleOraclejetStrings.global
import typings.oracleOraclejet.oracleOraclejetStrings.siblings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenAttribute[D] extends StObject {
  
  var childrenAttribute: js.UndefOr[String] = js.native
  
  var implicitSort: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
  
  var keyAttributes: js.UndefOr[String | js.Array[String]] = js.native
  
  var keyAttributesScope: js.UndefOr[global | siblings] = js.native
  
  var sortComparators: js.UndefOr[SortComparators[D]] = js.native
}
object ChildrenAttribute {
  
  @scala.inline
  def apply[D](): ChildrenAttribute[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenAttribute[D]]
  }
  
  @scala.inline
  implicit class ChildrenAttributeMutableBuilder[Self <: ChildrenAttribute[_], D] (val x: Self with ChildrenAttribute[D]) extends AnyVal {
    
    @scala.inline
    def setChildrenAttribute(value: String): Self = StObject.set(x, "childrenAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenAttributeUndefined: Self = StObject.set(x, "childrenAttribute", js.undefined)
    
    @scala.inline
    def setImplicitSort(value: js.Array[SortCriterion[D]]): Self = StObject.set(x, "implicitSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitSortUndefined: Self = StObject.set(x, "implicitSort", js.undefined)
    
    @scala.inline
    def setImplicitSortVarargs(value: SortCriterion[D]*): Self = StObject.set(x, "implicitSort", js.Array(value :_*))
    
    @scala.inline
    def setKeyAttributes(value: String | js.Array[String]): Self = StObject.set(x, "keyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAttributesScope(value: global | siblings): Self = StObject.set(x, "keyAttributesScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAttributesScopeUndefined: Self = StObject.set(x, "keyAttributesScope", js.undefined)
    
    @scala.inline
    def setKeyAttributesUndefined: Self = StObject.set(x, "keyAttributes", js.undefined)
    
    @scala.inline
    def setKeyAttributesVarargs(value: String*): Self = StObject.set(x, "keyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSortComparators(value: SortComparators[D]): Self = StObject.set(x, "sortComparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortComparatorsUndefined: Self = StObject.set(x, "sortComparators", js.undefined)
  }
}
