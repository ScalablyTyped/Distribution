package typings
package microeventDotTsLib.microeventLibEventInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventInterface[EventPayload] extends js.Object {
  def addHandler[T](
    handler: microeventDotTsLib.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface[EventPayload, T]
  ): EventInterface[EventPayload] = js.native
  def addHandler[T](
    handler: microeventDotTsLib.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface[EventPayload, T],
    context: T
  ): EventInterface[EventPayload] = js.native
  def removeHandler[T](
    handler: microeventDotTsLib.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface[EventPayload, T]
  ): EventInterface[EventPayload] = js.native
  def removeHandler[T](
    handler: microeventDotTsLib.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface[EventPayload, T],
    context: T
  ): EventInterface[EventPayload] = js.native
}

