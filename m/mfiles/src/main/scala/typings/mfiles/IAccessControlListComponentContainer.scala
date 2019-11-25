package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentContainer extends js.Object {
  val Count: Double
  def At(AccessControlListComponentKey: IAccessControlListComponentKey): IAccessControlListComponent
  def GetKeys(): IAccessControlListComponentKeys
  def HasKey(AccessControlListComponentKey: IAccessControlListComponentKey): Boolean
}

object IAccessControlListComponentContainer {
  @scala.inline
  def apply(
    At: IAccessControlListComponentKey => IAccessControlListComponent,
    Count: Double,
    GetKeys: () => IAccessControlListComponentKeys,
    HasKey: IAccessControlListComponentKey => Boolean
  ): IAccessControlListComponentContainer = {
    val __obj = js.Dynamic.literal(At = js.Any.fromFunction1(At), Count = Count.asInstanceOf[js.Any], GetKeys = js.Any.fromFunction0(GetKeys), HasKey = js.Any.fromFunction1(HasKey))
  
    __obj.asInstanceOf[IAccessControlListComponentContainer]
  }
}

