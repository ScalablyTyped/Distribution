package typings
package orientjsLib.orientjsMod.orientjsNs.MigrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migration extends js.Object {
  var db: orientjsLib.orientjsMod.orientjsNs.Db = js.native
  var name: java.lang.String = js.native
  var server: orientjsLib.orientjsMod.orientjsNs.Server = js.native
  def configure(): scala.Unit = js.native
  def configure(config: js.Any): scala.Unit = js.native
  def down(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def up(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

