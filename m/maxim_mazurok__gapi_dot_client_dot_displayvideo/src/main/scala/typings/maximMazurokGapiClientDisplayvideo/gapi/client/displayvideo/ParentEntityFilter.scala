package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentEntityFilter extends js.Object {
  
  /** Required. File types that will be returned. */
  var fileType: js.UndefOr[js.Array[String]] = js.native
  
  /** The IDs of the specified filter type. This is used to filter entities to fetch. If filter type is not `FILTER_TYPE_NONE`, at least one ID must be specified. */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Filter type used to filter fetched entities. */
  var filterType: js.UndefOr[String] = js.native
}
object ParentEntityFilter {
  
  @scala.inline
  def apply(): ParentEntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentEntityFilter]
  }
  
  @scala.inline
  implicit class ParentEntityFilterOps[Self <: ParentEntityFilter] (val x: Self) extends AnyVal {
    
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
    def setFileTypeVarargs(value: String*): Self = this.set("fileType", js.Array(value :_*))
    
    @scala.inline
    def setFileType(value: js.Array[String]): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setFilterIdsVarargs(value: String*): Self = this.set("filterIds", js.Array(value :_*))
    
    @scala.inline
    def setFilterIds(value: js.Array[String]): Self = this.set("filterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterIds: Self = this.set("filterIds", js.undefined)
    
    @scala.inline
    def setFilterType(value: String): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
  }
}
