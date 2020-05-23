package typings.oracleOraclejet.anon

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleListener extends js.Object {
  var lifecycleListener: `15` = js.native
  @JSName("name")
  var name_Original: KnockoutObservable[String] = js.native
  var params: OjRouterParentRouter = js.native
  def name(): String = js.native
  def name(value: String): Unit = js.native
}

