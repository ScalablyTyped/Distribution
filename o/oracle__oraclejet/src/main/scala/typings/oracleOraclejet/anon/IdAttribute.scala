package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojarraydataproviderMod.SortComparators
import typings.oracleOraclejet.ojdataproviderMod.SortCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdAttribute[D] extends js.Object {
  
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
  implicit class IdAttributeOps[Self <: IdAttribute[_], D] (val x: Self with IdAttribute[D]) extends AnyVal {
    
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
    def setIdAttributeVarargs(value: String*): Self = this.set("idAttribute", js.Array(value :_*))
    
    @scala.inline
    def setIdAttribute(value: String | js.Array[String]): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    
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
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeysFunction0(value: () => js.Array[_]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(value: js.Array[_] | js.Function0[js.Array[_]]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setSortComparators(value: SortComparators[D]): Self = this.set("sortComparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortComparators: Self = this.set("sortComparators", js.undefined)
  }
}
