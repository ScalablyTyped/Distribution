package typings.meteor.ddpMod.DDP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.meteor.meteorStrings.connected
  - typings.meteor.meteorStrings.connecting
  - typings.meteor.meteorStrings.failed
  - typings.meteor.meteorStrings.waiting
  - typings.meteor.meteorStrings.offline
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def connected: typings.meteor.meteorStrings.connected = "connected".asInstanceOf[typings.meteor.meteorStrings.connected]
  @scala.inline
  def connecting: typings.meteor.meteorStrings.connecting = "connecting".asInstanceOf[typings.meteor.meteorStrings.connecting]
  @scala.inline
  def failed: typings.meteor.meteorStrings.failed = "failed".asInstanceOf[typings.meteor.meteorStrings.failed]
  @scala.inline
  def offline: typings.meteor.meteorStrings.offline = "offline".asInstanceOf[typings.meteor.meteorStrings.offline]
  @scala.inline
  def waiting: typings.meteor.meteorStrings.waiting = "waiting".asInstanceOf[typings.meteor.meteorStrings.waiting]
}

