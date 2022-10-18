package typings.microeventTs

import typings.microeventTs.microeventLibEventInterfaceMod.EventInterface.HandlerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object microeventLibEventInterfaceMod {
  
  @js.native
  trait EventInterface[EventPayload] extends StObject {
    
    def addHandler[T](handler: HandlerInterface[EventPayload, T]): EventInterface[EventPayload] = js.native
    def addHandler[T](handler: HandlerInterface[EventPayload, T], context: T): EventInterface[EventPayload] = js.native
    
    def removeHandler[T](handler: HandlerInterface[EventPayload, T]): EventInterface[EventPayload] = js.native
    def removeHandler[T](handler: HandlerInterface[EventPayload, T], context: T): EventInterface[EventPayload] = js.native
  }
  object EventInterface {
    
    type HandlerInterface[EventPayload, T] = js.Function2[/* payload */ EventPayload, /* context */ T, Unit]
  }
}
