package typings.mongodb.mongodbMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "ReplSet")
@js.native
class ReplSet protected () extends EventEmitter {
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: ReplSetOptions) = this()
  def connections(): js.Array[_] = js.native
}

