package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticPermissions extends js.Object {
  var CanDeactivate: scala.Boolean
  val IsBasedOnObjectACL: scala.Boolean
  val IsDefault: scala.Boolean
  val NamedACL: INamedACL
  def Clone(): IAutomaticPermissions
  def SetBasedOnObjectACL(): scala.Unit
  def SetNamedACL(NamedACL: INamedACL): scala.Unit
}

