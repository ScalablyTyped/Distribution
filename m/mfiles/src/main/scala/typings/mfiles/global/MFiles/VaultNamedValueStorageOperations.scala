package typings.mfiles.global.MFiles

import typings.mfiles.INamedValues
import typings.mfiles.IStrings
import typings.mfiles.IVaultNamedValueStorageOperations
import typings.mfiles.MFiles.MFNamedValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultNamedValueStorageOperations")
@js.native
class VaultNamedValueStorageOperations ()
  extends StObject
     with IVaultNamedValueStorageOperations {
  
  /* CompleteClass */
  override def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues = js.native
  
  /* CompleteClass */
  override def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit = js.native
  
  /* CompleteClass */
  override def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit = js.native
}
