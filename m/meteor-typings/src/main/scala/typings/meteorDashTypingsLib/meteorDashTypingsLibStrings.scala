package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object meteorDashTypingsLibStrings {
  @js.native
  sealed trait connected
    extends meteorDashTypingsLib.DDPNs.Status
       with meteorDashTypingsLib.meteorDdpMod.DDPNs.Status
  
  @js.native
  sealed trait connecting
    extends meteorDashTypingsLib.DDPNs.Status
       with meteorDashTypingsLib.meteorDdpMod.DDPNs.Status
  
  @js.native
  sealed trait failed
    extends meteorDashTypingsLib.DDPNs.Status
       with meteorDashTypingsLib.meteorDdpMod.DDPNs.Status
  
  @js.native
  sealed trait offline
    extends meteorDashTypingsLib.DDPNs.Status
       with meteorDashTypingsLib.meteorDdpMod.DDPNs.Status
  
  @js.native
  sealed trait waiting
    extends meteorDashTypingsLib.DDPNs.Status
       with meteorDashTypingsLib.meteorDdpMod.DDPNs.Status
  
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

