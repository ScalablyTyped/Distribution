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
    At: js.Function1[IAccessControlListComponentKey, IAccessControlListComponent],
    Count: scala.Double,
    GetKeys: js.Function0[IAccessControlListComponentKeys],
    HasKey: js.Function1[IAccessControlListComponentKey, scala.Boolean]
  ): IAccessControlListComponentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("At")(At)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetKeys")(GetKeys)
    __obj.updateDynamic("HasKey")(HasKey)
    __obj.asInstanceOf[IAccessControlListComponentContainer]
  }
}

