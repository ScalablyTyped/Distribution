package typings.mfiles

import typings.mfiles.MFilesNs.MFNamedValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNamedValueStorageOperations extends js.Object {
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit
}

object IVaultNamedValueStorageOperations {
  @scala.inline
  def apply(
    GetNamedValues: (MFNamedValueType, String) => INamedValues,
    RemoveNamedValues: (MFNamedValueType, String, IStrings) => Unit,
    SetNamedValues: (MFNamedValueType, String, INamedValues) => Unit
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal(GetNamedValues = js.Any.fromFunction2(GetNamedValues), RemoveNamedValues = js.Any.fromFunction3(RemoveNamedValues), SetNamedValues = js.Any.fromFunction3(SetNamedValues))
  
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
}

