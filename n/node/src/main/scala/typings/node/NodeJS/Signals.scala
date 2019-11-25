package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.SIGABRT
  - typings.node.nodeStrings.SIGALRM
  - typings.node.nodeStrings.SIGBUS
  - typings.node.nodeStrings.SIGCHLD
  - typings.node.nodeStrings.SIGCONT
  - typings.node.nodeStrings.SIGFPE
  - typings.node.nodeStrings.SIGHUP
  - typings.node.nodeStrings.SIGILL
  - typings.node.nodeStrings.SIGINT
  - typings.node.nodeStrings.SIGIO
  - typings.node.nodeStrings.SIGIOT
  - typings.node.nodeStrings.SIGKILL
  - typings.node.nodeStrings.SIGPIPE
  - typings.node.nodeStrings.SIGPOLL
  - typings.node.nodeStrings.SIGPROF
  - typings.node.nodeStrings.SIGPWR
  - typings.node.nodeStrings.SIGQUIT
  - typings.node.nodeStrings.SIGSEGV
  - typings.node.nodeStrings.SIGSTKFLT
  - typings.node.nodeStrings.SIGSTOP
  - typings.node.nodeStrings.SIGSYS
  - typings.node.nodeStrings.SIGTERM
  - typings.node.nodeStrings.SIGTRAP
  - typings.node.nodeStrings.SIGTSTP
  - typings.node.nodeStrings.SIGTTIN
  - typings.node.nodeStrings.SIGTTOU
  - typings.node.nodeStrings.SIGUNUSED
  - typings.node.nodeStrings.SIGURG
  - typings.node.nodeStrings.SIGUSR1
  - typings.node.nodeStrings.SIGUSR2
  - typings.node.nodeStrings.SIGVTALRM
  - typings.node.nodeStrings.SIGWINCH
  - typings.node.nodeStrings.SIGXCPU
  - typings.node.nodeStrings.SIGXFSZ
  - typings.node.nodeStrings.SIGBREAK
  - typings.node.nodeStrings.SIGLOST
  - typings.node.nodeStrings.SIGINFO
*/
trait Signals extends js.Object

object Signals {
  @scala.inline
  def SIGABRT: typings.node.nodeStrings.SIGABRT = this.cast("SIGABRT")
  @scala.inline
  def SIGALRM: typings.node.nodeStrings.SIGALRM = this.cast("SIGALRM")
  @scala.inline
  def SIGBREAK: typings.node.nodeStrings.SIGBREAK = this.cast("SIGBREAK")
  @scala.inline
  def SIGBUS: typings.node.nodeStrings.SIGBUS = this.cast("SIGBUS")
  @scala.inline
  def SIGCHLD: typings.node.nodeStrings.SIGCHLD = this.cast("SIGCHLD")
  @scala.inline
  def SIGCONT: typings.node.nodeStrings.SIGCONT = this.cast("SIGCONT")
  @scala.inline
  def SIGFPE: typings.node.nodeStrings.SIGFPE = this.cast("SIGFPE")
  @scala.inline
  def SIGHUP: typings.node.nodeStrings.SIGHUP = this.cast("SIGHUP")
  @scala.inline
  def SIGILL: typings.node.nodeStrings.SIGILL = this.cast("SIGILL")
  @scala.inline
  def SIGINFO: typings.node.nodeStrings.SIGINFO = this.cast("SIGINFO")
  @scala.inline
  def SIGINT: typings.node.nodeStrings.SIGINT = this.cast("SIGINT")
  @scala.inline
  def SIGIO: typings.node.nodeStrings.SIGIO = this.cast("SIGIO")
  @scala.inline
  def SIGIOT: typings.node.nodeStrings.SIGIOT = this.cast("SIGIOT")
  @scala.inline
  def SIGKILL: typings.node.nodeStrings.SIGKILL = this.cast("SIGKILL")
  @scala.inline
  def SIGLOST: typings.node.nodeStrings.SIGLOST = this.cast("SIGLOST")
  @scala.inline
  def SIGPIPE: typings.node.nodeStrings.SIGPIPE = this.cast("SIGPIPE")
  @scala.inline
  def SIGPOLL: typings.node.nodeStrings.SIGPOLL = this.cast("SIGPOLL")
  @scala.inline
  def SIGPROF: typings.node.nodeStrings.SIGPROF = this.cast("SIGPROF")
  @scala.inline
  def SIGPWR: typings.node.nodeStrings.SIGPWR = this.cast("SIGPWR")
  @scala.inline
  def SIGQUIT: typings.node.nodeStrings.SIGQUIT = this.cast("SIGQUIT")
  @scala.inline
  def SIGSEGV: typings.node.nodeStrings.SIGSEGV = this.cast("SIGSEGV")
  @scala.inline
  def SIGSTKFLT: typings.node.nodeStrings.SIGSTKFLT = this.cast("SIGSTKFLT")
  @scala.inline
  def SIGSTOP: typings.node.nodeStrings.SIGSTOP = this.cast("SIGSTOP")
  @scala.inline
  def SIGSYS: typings.node.nodeStrings.SIGSYS = this.cast("SIGSYS")
  @scala.inline
  def SIGTERM: typings.node.nodeStrings.SIGTERM = this.cast("SIGTERM")
  @scala.inline
  def SIGTRAP: typings.node.nodeStrings.SIGTRAP = this.cast("SIGTRAP")
  @scala.inline
  def SIGTSTP: typings.node.nodeStrings.SIGTSTP = this.cast("SIGTSTP")
  @scala.inline
  def SIGTTIN: typings.node.nodeStrings.SIGTTIN = this.cast("SIGTTIN")
  @scala.inline
  def SIGTTOU: typings.node.nodeStrings.SIGTTOU = this.cast("SIGTTOU")
  @scala.inline
  def SIGUNUSED: typings.node.nodeStrings.SIGUNUSED = this.cast("SIGUNUSED")
  @scala.inline
  def SIGURG: typings.node.nodeStrings.SIGURG = this.cast("SIGURG")
  @scala.inline
  def SIGUSR1: typings.node.nodeStrings.SIGUSR1 = this.cast("SIGUSR1")
  @scala.inline
  def SIGUSR2: typings.node.nodeStrings.SIGUSR2 = this.cast("SIGUSR2")
  @scala.inline
  def SIGVTALRM: typings.node.nodeStrings.SIGVTALRM = this.cast("SIGVTALRM")
  @scala.inline
  def SIGWINCH: typings.node.nodeStrings.SIGWINCH = this.cast("SIGWINCH")
  @scala.inline
  def SIGXCPU: typings.node.nodeStrings.SIGXCPU = this.cast("SIGXCPU")
  @scala.inline
  def SIGXFSZ: typings.node.nodeStrings.SIGXFSZ = this.cast("SIGXFSZ")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

