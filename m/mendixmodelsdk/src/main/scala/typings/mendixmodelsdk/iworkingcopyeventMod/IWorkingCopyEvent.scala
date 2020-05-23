package typings.mendixmodelsdk.iworkingcopyeventMod

import typings.mendixmodelsdk.anon.EventId
import typings.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import typings.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typings.mendixmodelsdk.transportInterfacesMod.IWorkingCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.iworkingcopyeventMod.IWorkingCopyDataEvent
  - typings.mendixmodelsdk.iworkingcopyeventMod.IBuildResultEvent
*/
trait IWorkingCopyEvent extends js.Object

object IWorkingCopyEvent {
  @scala.inline
  def IWorkingCopyDataEvent(data: IWorkingCopy, `type`: workingCopyData): IWorkingCopyEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyEvent]
  }
  @scala.inline
  def IBuildResultEvent(data: EventId, `type`: buildResult): IWorkingCopyEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyEvent]
  }
}

