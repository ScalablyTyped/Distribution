package typings.nssm.nssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nssm.nssmStrings.install
  - typings.nssm.nssmStrings.remove
  - typings.nssm.nssmStrings.start
  - typings.nssm.nssmStrings.stop
  - typings.nssm.nssmStrings.restart
  - typings.nssm.nssmStrings.status
  - typings.nssm.nssmStrings.pause
  - typings.nssm.nssmStrings.continue
  - typings.nssm.nssmStrings.rotate
  - typings.nssm.nssmStrings.get
  - typings.nssm.nssmStrings.set
  - typings.nssm.nssmStrings.reset
*/
trait Command extends js.Object

object Command {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def continue: typings.nssm.nssmStrings.continue = this.cast("continue")
  @scala.inline
  def get: typings.nssm.nssmStrings.get = this.cast("get")
  @scala.inline
  def install: typings.nssm.nssmStrings.install = this.cast("install")
  @scala.inline
  def pause: typings.nssm.nssmStrings.pause = this.cast("pause")
  @scala.inline
  def remove: typings.nssm.nssmStrings.remove = this.cast("remove")
  @scala.inline
  def reset: typings.nssm.nssmStrings.reset = this.cast("reset")
  @scala.inline
  def restart: typings.nssm.nssmStrings.restart = this.cast("restart")
  @scala.inline
  def rotate: typings.nssm.nssmStrings.rotate = this.cast("rotate")
  @scala.inline
  def set: typings.nssm.nssmStrings.set = this.cast("set")
  @scala.inline
  def start: typings.nssm.nssmStrings.start = this.cast("start")
  @scala.inline
  def status: typings.nssm.nssmStrings.status = this.cast("status")
  @scala.inline
  def stop: typings.nssm.nssmStrings.stop = this.cast("stop")
}

