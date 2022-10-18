package typings.nodeNetstat

import typings.nodeNetstat.mod.Platforms
import typings.nodeNetstat.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeNetstatStrings {
  
  @js.native
  sealed trait CLOSED
    extends StObject
       with State
  inline def CLOSED: CLOSED = "CLOSED".asInstanceOf[CLOSED]
  
  @js.native
  sealed trait CLOSE_WAIT
    extends StObject
       with State
  inline def CLOSE_WAIT: CLOSE_WAIT = "CLOSE_WAIT".asInstanceOf[CLOSE_WAIT]
  
  @js.native
  sealed trait ESTABLISHED
    extends StObject
       with State
  inline def ESTABLISHED: ESTABLISHED = "ESTABLISHED".asInstanceOf[ESTABLISHED]
  
  @js.native
  sealed trait FIN_WAIT_1
    extends StObject
       with State
  inline def FIN_WAIT_1: FIN_WAIT_1 = "FIN_WAIT_1".asInstanceOf[FIN_WAIT_1]
  
  @js.native
  sealed trait FIN_WAIT_2
    extends StObject
       with State
  inline def FIN_WAIT_2: FIN_WAIT_2 = "FIN_WAIT_2".asInstanceOf[FIN_WAIT_2]
  
  @js.native
  sealed trait LAST_ACK
    extends StObject
       with State
  inline def LAST_ACK: LAST_ACK = "LAST_ACK".asInstanceOf[LAST_ACK]
  
  @js.native
  sealed trait LISTEN
    extends StObject
       with State
  inline def LISTEN: LISTEN = "LISTEN".asInstanceOf[LISTEN]
  
  @js.native
  sealed trait SYN_RECEIVED
    extends StObject
       with State
  inline def SYN_RECEIVED: SYN_RECEIVED = "SYN_RECEIVED".asInstanceOf[SYN_RECEIVED]
  
  @js.native
  sealed trait SYN_SEND
    extends StObject
       with State
  inline def SYN_SEND: SYN_SEND = "SYN_SEND".asInstanceOf[SYN_SEND]
  
  @js.native
  sealed trait TIMED_WAIT
    extends StObject
       with State
  inline def TIMED_WAIT: TIMED_WAIT = "TIMED_WAIT".asInstanceOf[TIMED_WAIT]
  
  @js.native
  sealed trait darwin
    extends StObject
       with Platforms
  inline def darwin: darwin = "darwin".asInstanceOf[darwin]
  
  @js.native
  sealed trait linux
    extends StObject
       with Platforms
  inline def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait win32
    extends StObject
       with Platforms
  inline def win32: win32 = "win32".asInstanceOf[win32]
}
