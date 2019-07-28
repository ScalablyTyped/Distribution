package typings.microeventDotTs.microeventLibEventInterfaceMod

import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterfaceNs.HandlerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventInterface[EventPayload] extends js.Object {
  def addHandler[T](handler: HandlerInterface[EventPayload, T]): EventInterface[EventPayload] = js.native
  def addHandler[T](handler: HandlerInterface[EventPayload, T], context: T): EventInterface[EventPayload] = js.native
  def removeHandler[T](handler: HandlerInterface[EventPayload, T]): EventInterface[EventPayload] = js.native
  def removeHandler[T](handler: HandlerInterface[EventPayload, T], context: T): EventInterface[EventPayload] = js.native
}

