package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-apple-receipt-verify", "validate")
@js.native
object validate extends js.Object {
  
  def apply(options: ValidateOptions): js.Promise[js.Array[PurchasedProducts]] = js.native
  def apply(
    options: ValidateOptions,
    callback: js.Function2[
      /* error */ ValidationError, 
      /* purchasedProducts */ js.Array[PurchasedProducts], 
      Unit
    ]
  ): Unit = js.native
}
