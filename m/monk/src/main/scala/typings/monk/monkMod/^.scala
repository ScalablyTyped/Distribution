package typings.monk.monkMod

import typings.monk.Anon_AcceptableLatencyMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cast(): js.Any = js.native
  def cast(obj: js.Any): js.Any = js.native
  def cast(obj: js.Array[_]): js.Any = js.native
  def cast(obj: js.Object): js.Any = js.native
  def default(database: String): js.Promise[IMonkManager] with IMonkManager = js.native
  def default(database: String, options: Anon_AcceptableLatencyMS): js.Promise[IMonkManager] with IMonkManager = js.native
  def default(database: js.Array[String]): js.Promise[IMonkManager] with IMonkManager = js.native
  def default(database: js.Array[String], options: Anon_AcceptableLatencyMS): js.Promise[IMonkManager] with IMonkManager = js.native
  def id(): IObjectID = js.native
  def id(hexstring: String): IObjectID = js.native
  def id(obj: IObjectID): IObjectID = js.native
}

