package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabInformation extends js.Object {
  var teamTabs: js.Array[TabInstance]
}

object TabInformation {
  @scala.inline
  def apply(teamTabs: js.Array[TabInstance]): TabInformation = {
    val __obj = js.Dynamic.literal(teamTabs = teamTabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabInformation]
  }
}

