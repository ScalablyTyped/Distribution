package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object meteorDashTypingsLibStrings {
  @js.native
  sealed trait connected extends js.Object
  
  @js.native
  sealed trait connecting extends js.Object
  
  @js.native
  sealed trait failed extends js.Object
  
  @js.native
  sealed trait offline extends js.Object
  
  @js.native
  sealed trait waiting extends js.Object
  
  def connected: connected = "connected".asInstanceOf[connected]
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  def failed: failed = "failed".asInstanceOf[failed]
  def offline: offline = "offline".asInstanceOf[offline]
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

