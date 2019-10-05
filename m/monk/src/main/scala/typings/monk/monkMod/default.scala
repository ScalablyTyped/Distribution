package typings.monk.monkMod

import typings.monk.Anon_AcceptableLatencyMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(database: String): js.Promise[IMonkManager] with IMonkManager = js.native
  def apply(database: String, options: Anon_AcceptableLatencyMS): js.Promise[IMonkManager] with IMonkManager = js.native
  def apply(database: js.Array[String]): js.Promise[IMonkManager] with IMonkManager = js.native
  def apply(database: js.Array[String], options: Anon_AcceptableLatencyMS): js.Promise[IMonkManager] with IMonkManager = js.native
}

