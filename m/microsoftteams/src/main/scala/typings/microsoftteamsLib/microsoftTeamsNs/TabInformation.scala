package typings
package microsoftteamsLib.microsoftTeamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabInformation extends js.Object {
  var teamTabs: js.Array[TabInstance]
}

object TabInformation {
  @scala.inline
  def apply(teamTabs: js.Array[TabInstance]): TabInformation = {
    val __obj = js.Dynamic.literal(teamTabs = teamTabs)
  
    __obj.asInstanceOf[TabInformation]
  }
}

