package typings.mfiles

import typings.mfiles.MFiles.MFEventHandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventHandler extends js.Object {
  var Active: Boolean
  var Description: String
  var EventType: MFEventHandlerType
  val GUID: String
  var VBScript: String
  def Clone(): IEventHandler
  def GetID(): Double
}

object IEventHandler {
  @scala.inline
  def apply(
    Active: Boolean,
    Clone: () => IEventHandler,
    Description: String,
    EventType: MFEventHandlerType,
    GUID: String,
    GetID: () => Double,
    VBScript: String
  ): IEventHandler = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], GetID = js.Any.fromFunction0(GetID), VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventHandler]
  }
}

