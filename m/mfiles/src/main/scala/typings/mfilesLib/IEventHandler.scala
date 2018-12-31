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

