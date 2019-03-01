package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryContainer extends js.Object {
  val IsEmpty: scala.Boolean
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): scala.Unit
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData
  def Clear(): scala.Unit
  def Clone(): IAccessControlEntryContainer
  def GetKeys(): IAccessControlEntryKeys
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): scala.Boolean
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): scala.Unit
}

object IAccessControlEntryContainer {
  @scala.inline
  def apply(
    Add: js.Function2[IAccessControlEntryKey, IAccessControlEntryData, scala.Unit],
    At: js.Function1[IAccessControlEntryKey, IAccessControlEntryData],
    Clear: js.Function0[scala.Unit],
    Clone: js.Function0[IAccessControlEntryContainer],
    GetKeys: js.Function0[IAccessControlEntryKeys],
    GetKeysWithPseudoUserDefinitions: js.Function0[IAccessControlEntryKeys],
    HasKey: js.Function1[IAccessControlEntryKey, scala.Boolean],
    IsEmpty: scala.Boolean,
    Remove: js.Function1[IAccessControlEntryKey, scala.Unit]
  ): IAccessControlEntryContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("At")(At)
    __obj.updateDynamic("Clear")(Clear)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("GetKeys")(GetKeys)
    __obj.updateDynamic("GetKeysWithPseudoUserDefinitions")(GetKeysWithPseudoUserDefinitions)
    __obj.updateDynamic("HasKey")(HasKey)
    __obj.updateDynamic("IsEmpty")(IsEmpty)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IAccessControlEntryContainer]
  }
}

