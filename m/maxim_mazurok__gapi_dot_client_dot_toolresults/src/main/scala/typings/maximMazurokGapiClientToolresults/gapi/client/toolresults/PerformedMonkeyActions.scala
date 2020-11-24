package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformedMonkeyActions extends js.Object {
  
  /** The total number of monkey actions performed during the crawl. */
  var totalActions: js.UndefOr[Double] = js.native
}
object PerformedMonkeyActions {
  
  @scala.inline
  def apply(): PerformedMonkeyActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformedMonkeyActions]
  }
  
  @scala.inline
  implicit class PerformedMonkeyActionsOps[Self <: PerformedMonkeyActions] (val x: Self) extends AnyVal {
    
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
    def setTotalActions(value: Double): Self = this.set("totalActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalActions: Self = this.set("totalActions", js.undefined)
  }
}
