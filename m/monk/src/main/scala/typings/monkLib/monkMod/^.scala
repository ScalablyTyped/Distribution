package typings
package monkLib.monkMod

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
  def default(database: java.lang.String): js.Promise[monkLib.monkMod.IMonkManager] with monkLib.monkMod.IMonkManager = js.native
  def default(database: java.lang.String, options: monkLib.Anon_AcceptableLatencyMS): js.Promise[monkLib.monkMod.IMonkManager] with monkLib.monkMod.IMonkManager = js.native
  def default(database: js.Array[java.lang.String]): js.Promise[monkLib.monkMod.IMonkManager] with monkLib.monkMod.IMonkManager = js.native
  def default(database: js.Array[java.lang.String], options: monkLib.Anon_AcceptableLatencyMS): js.Promise[monkLib.monkMod.IMonkManager] with monkLib.monkMod.IMonkManager = js.native
  def id(): monkLib.monkMod.IObjectID = js.native
  def id(hexstring: java.lang.String): monkLib.monkMod.IObjectID = js.native
  def id(obj: monkLib.monkMod.IObjectID): monkLib.monkMod.IObjectID = js.native
}

