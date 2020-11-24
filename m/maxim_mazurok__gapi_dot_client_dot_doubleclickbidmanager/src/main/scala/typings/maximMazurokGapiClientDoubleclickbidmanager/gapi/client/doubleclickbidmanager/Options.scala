package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Set to true and filter your report by `FILTER_INSERTION_ORDER` or `FILTER_LINE_ITEM` to include data for audience lists specifically targeted by those items. */
  var includeOnlyTargetedUserLists: js.UndefOr[Boolean] = js.native
  
  /** Options that contain Path Filters and Custom Channel Groupings. */
  var pathQueryOptions: js.UndefOr[PathQueryOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setIncludeOnlyTargetedUserLists(value: Boolean): Self = this.set("includeOnlyTargetedUserLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOnlyTargetedUserLists: Self = this.set("includeOnlyTargetedUserLists", js.undefined)
    
    @scala.inline
    def setPathQueryOptions(value: PathQueryOptions): Self = this.set("pathQueryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathQueryOptions: Self = this.set("pathQueryOptions", js.undefined)
  }
}
