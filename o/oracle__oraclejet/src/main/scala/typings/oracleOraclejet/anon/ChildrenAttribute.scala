package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import typings.oracleOraclejet.oracleOraclejetStrings.global
import typings.oracleOraclejet.oracleOraclejetStrings.siblings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenAttribute[D] extends js.Object {
  
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
  implicit class ChildrenAttributeOps[Self <: ChildrenAttribute[_], D] (val x: Self with ChildrenAttribute[D]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenAttribute(value: String): Self = this.set("childrenAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenAttribute: Self = this.set("childrenAttribute", js.undefined)
    
    @scala.inline
    def setImplicitSortVarargs(value: SortCriterion[D]*): Self = this.set("implicitSort", js.Array(value :_*))
    
    @scala.inline
    def setImplicitSort(value: js.Array[SortCriterion[D]]): Self = this.set("implicitSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitSort: Self = this.set("implicitSort", js.undefined)
    
    @scala.inline
    def setKeyAttributesVarargs(value: String*): Self = this.set("keyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setKeyAttributes(value: String | js.Array[String]): Self = this.set("keyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAttributes: Self = this.set("keyAttributes", js.undefined)
    
    @scala.inline
    def setKeyAttributesScope(value: global | siblings): Self = this.set("keyAttributesScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAttributesScope: Self = this.set("keyAttributesScope", js.undefined)
    
    @scala.inline
    def setSortComparators(value: SortComparators[D]): Self = this.set("sortComparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortComparators: Self = this.set("sortComparators", js.undefined)
  }
}
