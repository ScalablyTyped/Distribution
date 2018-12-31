package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentContainer extends js.Object {
  val Count: scala.Double
  def At(AccessControlListComponentKey: IAccessControlListComponentKey): IAccessControlListComponent
  def GetKeys(): IAccessControlListComponentKeys
  def HasKey(AccessControlListComponentKey: IAccessControlListComponentKey): scala.Boolean
}

