package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.anon.Deferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Transaction Mode namespace;
// API: http://vitaly-t.github.io/pg-promise/txMode.html
@js.native
trait ITXMode extends StObject {
  
  var TransactionMode: Instantiable1[/* options */ js.UndefOr[Deferrable], typings.pgPromise.mod.TransactionMode] = js.native
  
  var isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any = js.native
}
object ITXMode {
  
  @scala.inline
  def apply(
    TransactionMode: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode],
    isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
  ): ITXMode = {
    val __obj = js.Dynamic.literal(TransactionMode = TransactionMode.asInstanceOf[js.Any], isolationLevel = isolationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITXMode]
  }
  
  @scala.inline
  implicit class ITXModeMutableBuilder[Self <: ITXMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsolationLevel(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
    ): Self = StObject.set(x, "isolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionMode(value: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode]): Self = StObject.set(x, "TransactionMode", value.asInstanceOf[js.Any])
  }
}
