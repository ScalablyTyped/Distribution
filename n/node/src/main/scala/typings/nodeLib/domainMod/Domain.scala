package typings
package nodeLib.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domain", "Domain")
@js.native
class Domain ()
  extends nodeLib.eventsMod.EventEmitter
     with nodeLib.NodeJSNs.Domain {
  var members: js.Array[_] = js.native
  def add(emitter: nodeLib.eventsMod.EventEmitter): scala.Unit = js.native
  def enter(): scala.Unit = js.native
  def exit(): scala.Unit = js.native
  def remove(emitter: nodeLib.eventsMod.EventEmitter): scala.Unit = js.native
}

