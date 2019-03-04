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
    val __obj = js.Dynamic.literal(Add = Add, At = At, Clear = Clear, Clone = Clone, GetKeys = GetKeys, GetKeysWithPseudoUserDefinitions = GetKeysWithPseudoUserDefinitions, HasKey = HasKey, IsEmpty = IsEmpty, Remove = Remove)
  
    __obj.asInstanceOf[IAccessControlEntryContainer]
  }
}

