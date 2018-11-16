package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommands extends js.Object {
  val Events: ICommandsEvents = js.native
  def AddCustomCommandToMenu(
    customCommand: scala.Double,
    location: mfilesLib.MFilesNs.MenuLocation,
    orderPriority: scala.Double
  ): scala.Unit = js.native
  def CreateCustomCommand(commandName: java.lang.String): scala.Double = js.native
  def DeleteCustomCommand(customCommand: scala.Double): scala.Unit = js.native
  def ExecuteCommand(command: mfilesLib.MFilesNs.BuiltinCommand, arguments: js.Any): scala.Unit = js.native
  def ExecuteCommand(command: scala.Double, arguments: js.Any): scala.Unit = js.native
  def GetCommandName(command: mfilesLib.MFilesNs.BuiltinCommand): java.lang.String = js.native
  def GetCommandName(command: scala.Double): java.lang.String = js.native
  def GetCommandState(
    command: mfilesLib.MFilesNs.BuiltinCommand,
    location: mfilesLib.MFilesNs.CommandLocation,
    includeBuiltInState: scala.Boolean,
    includeScriptSpecifiedState: scala.Boolean
  ): mfilesLib.MFilesNs.CommandState = js.native
  def GetCommandState(
    command: scala.Double,
    location: mfilesLib.MFilesNs.CommandLocation,
    includeBuiltInState: scala.Boolean,
    includeScriptSpecifiedState: scala.Boolean
  ): mfilesLib.MFilesNs.CommandState = js.native
  def RemoveCustomCommandFromMenu(customCommand: scala.Double, location: mfilesLib.MFilesNs.MenuLocation): scala.Unit = js.native
  def SetCommandState(
    command: mfilesLib.MFilesNs.BuiltinCommand,
    location: mfilesLib.MFilesNs.CommandLocation,
    state: mfilesLib.MFilesNs.CommandState
  ): scala.Unit = js.native
  def SetCommandState(
    command: scala.Double,
    location: mfilesLib.MFilesNs.CommandLocation,
    state: mfilesLib.MFilesNs.CommandState
  ): scala.Unit = js.native
  def SetIcon(customCommand: scala.Double, icon: mfilesLib.MFilesNs.DefaultIcon): scala.Unit = js.native
  def SetIconFromPath(customCommand: scala.Double, iconPath: java.lang.String): scala.Unit = js.native
}

