package typings.mendixmodelsdk.iworkingcopyeventMod

import typings.mendixmodelsdk.AnonEventId
import typings.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuildResultEvent extends IWorkingCopyEvent {
  var data: AnonEventId
  var `type`: buildResult
}

object IBuildResultEvent {
  @scala.inline
  def apply(data: AnonEventId, `type`: buildResult): IBuildResultEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuildResultEvent]
  }
}

