package typings.pgPromise.anon

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.mod._txMode.TransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTxMode extends StObject {
  
  // TransactionMode class;
  // API: http://vitaly-t.github.io/pg-promise/txMode.TransactionMode.html
  var TransactionMode: Instantiable1[
    /* options */ js.UndefOr[Deferrable], 
    typings.pgPromise.mod._txMode.TransactionMode
  ]
}
object TypeofTxMode {
  
  inline def apply(TransactionMode: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode]): TypeofTxMode = {
    val __obj = js.Dynamic.literal(TransactionMode = TransactionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTxMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTxMode] (val x: Self) extends AnyVal {
    
    inline def setTransactionMode(value: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode]): Self = StObject.set(x, "TransactionMode", value.asInstanceOf[js.Any])
  }
}
