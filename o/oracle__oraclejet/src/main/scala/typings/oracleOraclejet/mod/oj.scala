package typings.oracleOraclejet.mod

import typings.oracleOraclejet.ojmodelMod.Collection
import typings.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet", "oj")
@js.native
object oj extends js.Object {
  
  def ajax(): js.Object = js.native
  def ajax(settings: js.Object): js.Object = js.native
  
  var revision: String = js.native
  
  def sync(method: String, model: Collection): js.Object = js.native
  def sync(method: String, model: Collection, options: js.Object): js.Object = js.native
  def sync(method: String, model: Model): js.Object = js.native
  def sync(method: String, model: Model, options: js.Object): js.Object = js.native
  
  var version: String = js.native
}
