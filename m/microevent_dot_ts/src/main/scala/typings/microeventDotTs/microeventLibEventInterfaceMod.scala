package typings.microeventDotTs

import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterface
import typings.microeventDotTs.microeventLibEventInterfaceMod.EventInterface.HandlerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microevent/lib/EventInterface", JSImport.Namespace)
@js.native
object microeventLibEventInterfaceMod extends js.Object {
  @js.native
  trait EventInterface[EventPayload] extends js.Object {
    def addHandler[T](handler: HandlerInterface[EventPayload, T]): EventInterface[EventPayload] = js.native
    def addHandler[T](handler: HandlerInterface[EventPayload, T], context: T): EventInterface[EventPayload] = js.native
    def removeHandler[T](handler: HandlerInterface[EventPayload, T]): EventInterface[EventPayload] = js.native
    def removeHandler[T](handler: HandlerInterface[EventPayload, T], context: T): EventInterface[EventPayload] = js.native
  }
  
  @js.native
  object EventInterface extends js.Object {
    type HandlerInterface[EventPayload, T] = js.Function2[/* payload */ EventPayload, /* context */ T, Unit]
  }
  
}

