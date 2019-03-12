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

object IAccessControlListComponentContainer {
  @scala.inline
  def apply(
    At: IAccessControlListComponentKey => IAccessControlListComponent,
    Count: scala.Double,
    GetKeys: () => IAccessControlListComponentKeys,
    HasKey: IAccessControlListComponentKey => scala.Boolean
  ): IAccessControlListComponentContainer = {
    val __obj = js.Dynamic.literal(At = js.Any.fromFunction1(At), Count = Count, GetKeys = js.Any.fromFunction0(GetKeys), HasKey = js.Any.fromFunction1(HasKey))
  
    __obj.asInstanceOf[IAccessControlListComponentContainer]
  }
}

