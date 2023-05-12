package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WalletButtonAction extends StObject
@JSGlobal("bricks.WalletButtonAction")
@js.native
object WalletButtonAction extends StObject {
  
  @js.native
  sealed trait BUY
    extends StObject
       with WalletButtonAction
  
  @js.native
  sealed trait PAY
    extends StObject
       with WalletButtonAction
}
