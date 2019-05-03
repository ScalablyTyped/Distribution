package typings
package onDashFinishedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("on-finished", JSImport.Namespace)
@js.native
object onDashFinishedMod extends js.Object {
  def apply(
    msg: nodeLib.httpMod.IncomingMessage,
    listener: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* msg */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): nodeLib.httpMod.IncomingMessage = js.native
  def apply(
    msg: nodeLib.httpMod.OutgoingMessage,
    listener: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* msg */ nodeLib.httpMod.OutgoingMessage, 
      scala.Unit
    ]
  ): nodeLib.httpMod.OutgoingMessage = js.native
  def isFinished(msg: nodeLib.httpMod.IncomingMessage): scala.Boolean = js.native
  def isFinished(msg: nodeLib.httpMod.OutgoingMessage): scala.Boolean = js.native
}

