package typings.meteorTypings

import typings.meteorTypings.DDP.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorTypingsStrings {
  
  @js.native
  sealed trait connected
    extends StObject
       with Status
       with typings.meteorTypings.meteorDdpMod.DDP.Status
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with Status
       with typings.meteorTypings.meteorDdpMod.DDP.Status
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait failed
    extends StObject
       with Status
       with typings.meteorTypings.meteorDdpMod.DDP.Status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait offline
    extends StObject
       with Status
       with typings.meteorTypings.meteorDdpMod.DDP.Status
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait waiting
    extends StObject
       with Status
       with typings.meteorTypings.meteorDdpMod.DDP.Status
  inline def waiting: waiting = "waiting".asInstanceOf[waiting]
}
