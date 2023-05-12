package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletButtonRedirectMode extends StObject
@JSGlobal("bricks.WalletButtonRedirectMode")
@js.native
object WalletButtonRedirectMode extends StObject {
  
  @js.native
  sealed trait BLANK
    extends StObject
       with WalletButtonRedirectMode
  
  @js.native
  sealed trait MODAL
    extends StObject
       with WalletButtonRedirectMode
  
  @js.native
  sealed trait SELF
    extends StObject
       with WalletButtonRedirectMode
}
