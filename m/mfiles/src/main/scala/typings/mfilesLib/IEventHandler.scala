package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventHandler extends js.Object {
  var Active: scala.Boolean
  var Description: java.lang.String
  var EventType: mfilesLib.MFilesNs.MFEventHandlerType
  val GUID: java.lang.String
  var VBScript: java.lang.String
  def Clone(): IEventHandler
  def GetID(): scala.Double
}

object IEventHandler {
  @scala.inline
  def apply(
    Active: scala.Boolean,
    Clone: js.Function0[IEventHandler],
    Description: java.lang.String,
    EventType: mfilesLib.MFilesNs.MFEventHandlerType,
    GUID: java.lang.String,
    GetID: js.Function0[scala.Double],
    VBScript: java.lang.String
  ): IEventHandler = {
    val __obj = js.Dynamic.literal(Active = Active, Clone = Clone, Description = Description, EventType = EventType, GUID = GUID, GetID = GetID, VBScript = VBScript)
  
    __obj.asInstanceOf[IEventHandler]
  }
}

