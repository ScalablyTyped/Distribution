package typings.oracleOraclejet.ojrouterMod

import typings.knockout.KnockoutObservable
import typings.oracleOraclejet.anon.Attached
import typings.oracleOraclejet.anon.OjRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ModuleConfigType extends js.Object {
  var lifecycleListener: Attached = js.native
  @JSName("name")
  var name_Original: KnockoutObservable[String] = js.native
  var params: OjRouter = js.native
  def name(): String = js.native
  def name(value: String): Unit = js.native
}

