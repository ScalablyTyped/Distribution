package typings.mongodb.mongodbMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Mongos")
@js.native
class Mongos protected () extends EventEmitter {
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: MongosOptions) = this()
  def connections(): js.Array[_] = js.native
}

