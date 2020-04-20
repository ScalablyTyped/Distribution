package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryContainer extends js.Object {
  val IsEmpty: Boolean
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData
  def Clear(): Unit
  def Clone(): IAccessControlEntryContainer
  def GetKeys(): IAccessControlEntryKeys
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit
}

object IAccessControlEntryContainer {
  @scala.inline
  def apply(
    Add: (IAccessControlEntryKey, IAccessControlEntryData) => Unit,
    At: IAccessControlEntryKey => IAccessControlEntryData,
    Clear: () => Unit,
    Clone: () => IAccessControlEntryContainer,
    GetKeys: () => IAccessControlEntryKeys,
    GetKeysWithPseudoUserDefinitions: () => IAccessControlEntryKeys,
    HasKey: IAccessControlEntryKey => Boolean,
    IsEmpty: Boolean,
    Remove: IAccessControlEntryKey => Unit
  ): IAccessControlEntryContainer = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), At = js.Any.fromFunction1(At), Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone), GetKeys = js.Any.fromFunction0(GetKeys), GetKeysWithPseudoUserDefinitions = js.Any.fromFunction0(GetKeysWithPseudoUserDefinitions), HasKey = js.Any.fromFunction1(HasKey), IsEmpty = IsEmpty.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IAccessControlEntryContainer]
  }
}

