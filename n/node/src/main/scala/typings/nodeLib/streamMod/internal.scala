package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait internal
  extends nodeLib.eventsMod.EventEmitter {
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
}

