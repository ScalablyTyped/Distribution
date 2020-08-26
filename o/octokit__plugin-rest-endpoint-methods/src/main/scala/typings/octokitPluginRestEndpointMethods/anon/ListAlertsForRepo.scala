package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAlertsForRepo extends js.Object {
  var getAlert: `665` = js.native
  var listAlertsForRepo: `666` = js.native
}

object ListAlertsForRepo {
  @scala.inline
  def apply(getAlert: `665`, listAlertsForRepo: `666`): ListAlertsForRepo = {
    val __obj = js.Dynamic.literal(getAlert = getAlert.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsForRepo]
  }
  @scala.inline
  implicit class ListAlertsForRepoOps[Self <: ListAlertsForRepo] (val x: Self) extends AnyVal {
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
    def setGetAlert(value: `665`): Self = this.set("getAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setListAlertsForRepo(value: `666`): Self = this.set("listAlertsForRepo", value.asInstanceOf[js.Any])
  }
  
}

