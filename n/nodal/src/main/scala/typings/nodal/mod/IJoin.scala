package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJoin extends js.Object {
  
  var cachedModel: js.UndefOr[Model] = js.native
  
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  var columnsObject: js.UndefOr[js.Object] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var joinAlias: js.UndefOr[String] = js.native
  
  var joinColumn: js.UndefOr[String] = js.native
  
  var joinTable: String = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var multiFilter: js.UndefOr[js.Any] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var orderBy: js.UndefOr[js.Any] = js.native
  
  var prevAlias: js.UndefOr[String] = js.native
  
  var prevColumn: js.UndefOr[String] = js.native
  
  var prevTable: String = js.native
}
object IJoin {
  
  @scala.inline
  def apply(joinTable: String, prevTable: String): IJoin = {
    val __obj = js.Dynamic.literal(joinTable = joinTable.asInstanceOf[js.Any], prevTable = prevTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJoin]
  }
  
  @scala.inline
  implicit class IJoinOps[Self <: IJoin] (val x: Self) extends AnyVal {
    
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
    def setJoinTable(value: String): Self = this.set("joinTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevTable(value: String): Self = this.set("prevTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedModel(value: Model): Self = this.set("cachedModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedModel: Self = this.set("cachedModel", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setColumnsObject(value: js.Object): Self = this.set("columnsObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnsObject: Self = this.set("columnsObject", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setJoinAlias(value: String): Self = this.set("joinAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinAlias: Self = this.set("joinAlias", js.undefined)
    
    @scala.inline
    def setJoinColumn(value: String): Self = this.set("joinColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinColumn: Self = this.set("joinColumn", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMultiFilter(value: js.Any): Self = this.set("multiFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiFilter: Self = this.set("multiFilter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Any): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPrevAlias(value: String): Self = this.set("prevAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevAlias: Self = this.set("prevAlias", js.undefined)
    
    @scala.inline
    def setPrevColumn(value: String): Self = this.set("prevColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevColumn: Self = this.set("prevColumn", js.undefined)
  }
}
