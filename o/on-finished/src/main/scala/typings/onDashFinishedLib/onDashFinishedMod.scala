package typings
package onDashFinishedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("on-finished", JSImport.Namespace)
@js.native
object onDashFinishedMod extends js.Object {
  def apply[T /* <: nodeLib.httpMod.IncomingMessage | nodeLib.httpMod.OutgoingMessage */](msg: T, listener: js.Function2[/* err */ stdLib.Error | scala.Null, /* msg */ T, scala.Unit]): T = js.native
  def isFinished(msg: nodeLib.httpMod.IncomingMessage): scala.Boolean = js.native
  def isFinished(msg: nodeLib.httpMod.OutgoingMessage): scala.Boolean = js.native
}

