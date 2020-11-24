package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupObjectsRequest extends js.Object {
  
  /**
    * The object IDs of the objects to group. Only page elements can be grouped. There should be at least two page elements on the same page that are not already in another group. Some
    * page elements, such as videos, tables and placeholder shapes cannot be grouped.
    */
  var childrenObjectIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A user-supplied object ID for the group to be created. If you specify an ID, it must be unique among all pages and page elements in the presentation. The ID must start with an
    * alphanumeric character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The
    * length of the ID must not be less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
    */
  var groupObjectId: js.UndefOr[String] = js.native
}
object GroupObjectsRequest {
  
  @scala.inline
  def apply(): GroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupObjectsRequest]
  }
  
  @scala.inline
  implicit class GroupObjectsRequestOps[Self <: GroupObjectsRequest] (val x: Self) extends AnyVal {
    
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
    def setChildrenObjectIdsVarargs(value: String*): Self = this.set("childrenObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setChildrenObjectIds(value: js.Array[String]): Self = this.set("childrenObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenObjectIds: Self = this.set("childrenObjectIds", js.undefined)
    
    @scala.inline
    def setGroupObjectId(value: String): Self = this.set("groupObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupObjectId: Self = this.set("groupObjectId", js.undefined)
  }
}
