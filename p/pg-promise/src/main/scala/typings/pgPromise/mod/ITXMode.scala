package typings.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.anon.Deferrable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transaction Mode namespace;
// API: http://vitaly-t.github.io/pg-promise/txMode.html
@js.native
trait ITXMode extends js.Object {
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
  implicit class ITXModeOps[Self <: ITXMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransactionMode(value: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode]): Self = this.set("TransactionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsolationLevel(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ js.Any
    ): Self = this.set("isolationLevel", value.asInstanceOf[js.Any])
  }
  
}

