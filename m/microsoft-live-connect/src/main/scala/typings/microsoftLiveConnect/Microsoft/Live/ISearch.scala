package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Search object contains info about the objects found in a user's
  * SkyDrive that match the search query. See Search query parameters for
  * info about formatting a search query request.
  */
@js.native
trait ISearch extends js.Object {
  /**
    * An array of file and folder objects found in a user's SkyDrive that
    * match the search query.
    */
  var data: js.Array[IObject] = js.native
  /**
    * The path strings that reference the next and previous sets in a
    * paginated response.
    */
  var paging: js.UndefOr[Next] = js.native
}

object ISearch {
  @scala.inline
  def apply(data: js.Array[IObject]): ISearch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearch]
  }
  @scala.inline
  implicit class ISearchOps[Self <: ISearch] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: IObject*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[IObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaging(value: Next): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
  }
  
}

