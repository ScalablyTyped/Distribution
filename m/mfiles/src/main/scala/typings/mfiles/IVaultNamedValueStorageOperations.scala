package typings.mfiles

import typings.mfiles.MFiles.MFNamedValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultNamedValueStorageOperations extends StObject {
  
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues
  
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit
  
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit
}
object IVaultNamedValueStorageOperations {
  
  inline def apply(
    GetNamedValues: (MFNamedValueType, String) => INamedValues,
    RemoveNamedValues: (MFNamedValueType, String, IStrings) => Unit,
    SetNamedValues: (MFNamedValueType, String, INamedValues) => Unit
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal(GetNamedValues = js.Any.fromFunction2(GetNamedValues), RemoveNamedValues = js.Any.fromFunction3(RemoveNamedValues), SetNamedValues = js.Any.fromFunction3(SetNamedValues))
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
  
  extension [Self <: IVaultNamedValueStorageOperations](x: Self) {
    
    inline def setGetNamedValues(value: (MFNamedValueType, String) => INamedValues): Self = StObject.set(x, "GetNamedValues", js.Any.fromFunction2(value))
    
    inline def setRemoveNamedValues(value: (MFNamedValueType, String, IStrings) => Unit): Self = StObject.set(x, "RemoveNamedValues", js.Any.fromFunction3(value))
    
    inline def setSetNamedValues(value: (MFNamedValueType, String, INamedValues) => Unit): Self = StObject.set(x, "SetNamedValues", js.Any.fromFunction3(value))
  }
}
