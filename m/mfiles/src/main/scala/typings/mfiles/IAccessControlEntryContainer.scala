package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryContainer extends StObject {
  
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit
  
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData
  
  def Clear(): Unit
  
  def Clone(): IAccessControlEntryContainer
  
  def GetKeys(): IAccessControlEntryKeys
  
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys
  
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean
  
  val IsEmpty: Boolean
  
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit
}
object IAccessControlEntryContainer {
  
  inline def apply(
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
  
  extension [Self <: IAccessControlEntryContainer](x: Self) {
    
    inline def setAdd(value: (IAccessControlEntryKey, IAccessControlEntryData) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setAt(value: IAccessControlEntryKey => IAccessControlEntryData): Self = StObject.set(x, "At", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setClone(value: () => IAccessControlEntryContainer): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setGetKeys(value: () => IAccessControlEntryKeys): Self = StObject.set(x, "GetKeys", js.Any.fromFunction0(value))
    
    inline def setGetKeysWithPseudoUserDefinitions(value: () => IAccessControlEntryKeys): Self = StObject.set(x, "GetKeysWithPseudoUserDefinitions", js.Any.fromFunction0(value))
    
    inline def setHasKey(value: IAccessControlEntryKey => Boolean): Self = StObject.set(x, "HasKey", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "IsEmpty", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: IAccessControlEntryKey => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
