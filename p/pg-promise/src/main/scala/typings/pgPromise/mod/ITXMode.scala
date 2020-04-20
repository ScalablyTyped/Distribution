package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.AnonDeferrable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transaction Mode namespace;
// API: http://vitaly-t.github.io/pg-promise/txMode.html
trait ITXMode extends js.Object {
  var TransactionMode: Instantiable1[js.UndefOr[/* options */ AnonDeferrable], typings.pgPromise.mod.TransactionMode]
  var isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
}

object ITXMode {
  @scala.inline
  def apply(
    TransactionMode: Instantiable1[js.UndefOr[/* options */ AnonDeferrable], TransactionMode],
    isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
  ): ITXMode = {
    val __obj = js.Dynamic.literal(TransactionMode = TransactionMode.asInstanceOf[js.Any], isolationLevel = isolationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITXMode]
  }
}

