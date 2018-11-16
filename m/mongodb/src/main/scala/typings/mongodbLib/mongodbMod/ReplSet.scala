package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ReplSet")
@js.native
class ReplSet protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: ReplSetOptions) = this()
  def connections(): js.Array[_] = js.native
}

