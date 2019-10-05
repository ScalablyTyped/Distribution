package typings.meteorDashTypings

import typings.meteorDashTypings.meteorDdpMod.DDP.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object meteorDashTypingsStrings {
  @js.native
  sealed trait connected
    extends Status
       with typings.meteorDashTypings.DDP.Status
  
  @js.native
  sealed trait connecting
    extends Status
       with typings.meteorDashTypings.DDP.Status
  
  @js.native
  sealed trait failed
    extends Status
       with typings.meteorDashTypings.DDP.Status
  
  @js.native
  sealed trait offline
    extends Status
       with typings.meteorDashTypings.DDP.Status
  
  @js.native
  sealed trait waiting
    extends Status
       with typings.meteorDashTypings.DDP.Status
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

