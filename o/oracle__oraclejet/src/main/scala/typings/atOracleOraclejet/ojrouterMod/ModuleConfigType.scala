package typings.atOracleOraclejet.ojrouterMod

import typings.atOracleOraclejet.Anon_Attached
import typings.atOracleOraclejet.Anon_OjRouter
import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ModuleConfigType extends js.Object {
  var lifecycleListener: Anon_Attached = js.native
  @JSName("name")
  var name_Original: KnockoutObservable[String] = js.native
  var params: Anon_OjRouter = js.native
  def name(): String = js.native
  def name(value: String): Unit = js.native
}

