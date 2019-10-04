package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.Anon_Deferrable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TransactionMode class;
// API: http://vitaly-t.github.io/pg-promise/txMode.TransactionMode.html
@JSImport("pg-promise", "TransactionMode")
@js.native
class TransactionMode () extends js.Object {
  def this(options: Anon_Deferrable) = this()
  def begin(): String = js.native
  def begin(cap: Boolean): String = js.native
}

