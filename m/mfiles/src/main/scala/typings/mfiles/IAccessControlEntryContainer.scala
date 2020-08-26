package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlEntryContainer extends js.Object {
  val IsEmpty: Boolean = js.native
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit = js.native
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData = js.native
  def Clear(): Unit = js.native
  def Clone(): IAccessControlEntryContainer = js.native
  def GetKeys(): IAccessControlEntryKeys = js.native
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys = js.native
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean = js.native
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit = js.native
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
  @scala.inline
  implicit class IAccessControlEntryContainerOps[Self <: IAccessControlEntryContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (IAccessControlEntryKey, IAccessControlEntryData) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setAt(value: IAccessControlEntryKey => IAccessControlEntryData): Self = this.set("At", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setClone(value: () => IAccessControlEntryContainer): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKeys(value: () => IAccessControlEntryKeys): Self = this.set("GetKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKeysWithPseudoUserDefinitions(value: () => IAccessControlEntryKeys): Self = this.set("GetKeysWithPseudoUserDefinitions", js.Any.fromFunction0(value))
    @scala.inline
    def setHasKey(value: IAccessControlEntryKey => Boolean): Self = this.set("HasKey", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("IsEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: IAccessControlEntryKey => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

