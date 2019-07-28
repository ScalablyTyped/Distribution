package typings.atOracleOraclejet.atOracleOraclejetMod

import typings.atOracleOraclejet.ojmodelMod.Collection
import typings.atOracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet", "oj")
@js.native
object ojNs extends js.Object {
  var revision: String = js.native
  var version: String = js.native
  def ajax(): js.Object = js.native
  def ajax(settings: js.Object): js.Object = js.native
  def sync(method: String, model: Collection): js.Object = js.native
  def sync(method: String, model: Collection, options: js.Object): js.Object = js.native
  def sync(method: String, model: Model): js.Object = js.native
  def sync(method: String, model: Model, options: js.Object): js.Object = js.native
}

