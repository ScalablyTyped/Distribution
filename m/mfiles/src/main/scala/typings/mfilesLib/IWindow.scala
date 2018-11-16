package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IWindow extends js.Object {
  val Events: IWindowEvents
  val Handle: scala.Double
  var Height: scala.Double
  val IsFocused: scala.Boolean
  var Maximizable: scala.Boolean
  var Minimizable: scala.Boolean
  var Resizable: scala.Boolean
  var Title: java.lang.String
  var Width: scala.Double
  def Close(): scala.Unit
  def Focus(): scala.Unit
  def Maximize(): scala.Unit
  def Minimize(): scala.Unit
  def Restore(): scala.Unit
  def SetDefaultSize(defaultWidth: scala.Double, defaultHeight: scala.Double, resizeToDefault: scala.Boolean): scala.Unit
}

