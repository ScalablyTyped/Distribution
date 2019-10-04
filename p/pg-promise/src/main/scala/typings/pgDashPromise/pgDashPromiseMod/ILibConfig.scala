package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.XPromise
import typings.pgDashPromise.typescriptPgDashSubsetMod.IConnectionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/pg-promise/Database.html#$config
@js.native
trait ILibConfig[Ext] extends js.Object {
  @JSName("$npm")
  var $npm: js.Any = js.native
  var options: IInitOptions[Ext] = js.native
  @JSName("pgp")
  var pgp_Original: IMain[Ext] = js.native
  var promiseLib: js.Any = js.native
  @JSName("promise")
  var promise_Original: IGenericPromise = js.native
  var version: String = js.native
  def pgp[T](cn: String): IDatabase[T] with T = js.native
  def pgp[T](cn: String, dc: js.Any): IDatabase[T] with T = js.native
  def pgp[T](cn: IConnectionParameters): IDatabase[T] with T = js.native
  def pgp[T](cn: IConnectionParameters, dc: js.Any): IDatabase[T] with T = js.native
  def promise(
    cb: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): XPromise[_] = js.native
}

