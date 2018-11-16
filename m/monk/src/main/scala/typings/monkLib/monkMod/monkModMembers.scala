package typings
package monkLib.monkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", JSImport.Namespace)
@js.native
object monkModMembers extends js.Object {
  def cast(): js.Any = js.native
  def cast(obj: js.Any): js.Any = js.native
  def cast(obj: js.Array[_]): js.Any = js.native
  def cast(obj: js.Object): js.Any = js.native
  def default(database: java.lang.String): stdLib.Promise[IMonkManager] with IMonkManager = js.native
  def default(database: java.lang.String, options: monkLib.Anon_AcceptableLatencyMS): stdLib.Promise[IMonkManager] with IMonkManager = js.native
  def default(database: js.Array[java.lang.String]): stdLib.Promise[IMonkManager] with IMonkManager = js.native
  def default(database: js.Array[java.lang.String], options: monkLib.Anon_AcceptableLatencyMS): stdLib.Promise[IMonkManager] with IMonkManager = js.native
  def id(): IObjectID = js.native
  def id(hexstring: java.lang.String): IObjectID = js.native
  def id(obj: IObjectID): IObjectID = js.native
}

