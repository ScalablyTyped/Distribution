package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiTransactionMod {
  
  @JSImport("mobx/dist/api/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transaction[T](action: js.Function0[T], thisArg: Unit): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
}
