package typings.pQueue

import typings.pQueue.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pQueueStrings {
  
  @js.native
  sealed trait active
    extends StObject
       with EventName
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait add
    extends StObject
       with EventName
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait completed
    extends StObject
       with EventName
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait empty
    extends StObject
       with EventName
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait error
    extends StObject
       with EventName
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait idle
    extends StObject
       with EventName
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait next
    extends StObject
       with EventName
  inline def next: next = "next".asInstanceOf[next]
}
