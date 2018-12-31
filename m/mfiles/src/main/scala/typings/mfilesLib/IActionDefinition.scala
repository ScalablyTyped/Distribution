package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionDefinition extends js.Object {
  var ActionCreateSeparateAssignment: IActionCreateAssignment
  val ActionType: mfilesLib.MFilesNs.MFActionType
  def Clear(): scala.Unit
  def Clone(): IActionDefinition
}

