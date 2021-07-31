package typings.mfiles.global.MFiles

import typings.mfiles.IAuthenticationResult
import typings.mfiles.IAuthenticationResultIntermediate
import typings.mfiles.IAuthenticationResultServerFinal
import typings.mfiles.IAuthenticationResultVaultFinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AuthenticationResult")
@js.native
class AuthenticationResult ()
  extends StObject
     with IAuthenticationResult {
  
  /* CompleteClass */
  override val Intermediate: IAuthenticationResultIntermediate = js.native
  
  /* CompleteClass */
  override val ServerFinal: IAuthenticationResultServerFinal = js.native
  
  /* CompleteClass */
  override val VaultFinal: IAuthenticationResultVaultFinal = js.native
}
