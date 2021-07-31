package typings.mfiles.global.MFiles

import typings.mfiles.IVaultExtensionMethodOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultExtensionMethodOperations")
@js.native
class VaultExtensionMethodOperations ()
  extends StObject
     with IVaultExtensionMethodOperations {
  
  /* CompleteClass */
  override def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String): Boolean = js.native
  
  /* CompleteClass */
  override def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String): String = js.native
}
