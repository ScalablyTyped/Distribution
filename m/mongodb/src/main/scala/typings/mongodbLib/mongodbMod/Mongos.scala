package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Mongos")
@js.native
class Mongos protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: MongosOptions) = this()
  def connections(): js.Array[_] = js.native
}

