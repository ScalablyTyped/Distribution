package typings.mendixmodelsdk.iworkingcopyeventMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typings.mendixmodelsdk.transportInterfacesMod.IWorkingCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkingCopyDataEvent extends IWorkingCopyEvent {
  var data: IWorkingCopy
  var `type`: workingCopyData
}

object IWorkingCopyDataEvent {
  @scala.inline
  def apply(data: IWorkingCopy, `type`: workingCopyData): IWorkingCopyDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopyDataEvent]
  }
}

