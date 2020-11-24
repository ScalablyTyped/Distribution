package typings.microeventTs

import typings.microeventTs.eventInterfaceMod.EventInterface.HandlerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("microevent/lib/EventInterface", JSImport.Namespace)
@js.native
object eventInterfaceMod extends js.Object {
  
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
