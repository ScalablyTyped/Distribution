package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in node.process.<global>.NodeJS.Signals ]: number} */
@js.native
trait SignalConstants extends js.Object {
  
  var SIGABRT: Double = js.native
  
  var SIGALRM: Double = js.native
  
  var SIGBREAK: Double = js.native
  
  var SIGBUS: Double = js.native
  
  var SIGCHLD: Double = js.native
  
  var SIGCONT: Double = js.native
  
  var SIGFPE: Double = js.native
  
  var SIGHUP: Double = js.native
  
  var SIGILL: Double = js.native
  
  var SIGINFO: Double = js.native
  
  var SIGINT: Double = js.native
  
  var SIGIO: Double = js.native
  
  var SIGIOT: Double = js.native
  
  var SIGKILL: Double = js.native
  
  var SIGLOST: Double = js.native
  
  var SIGPIPE: Double = js.native
  
  var SIGPOLL: Double = js.native
  
  var SIGPROF: Double = js.native
  
  var SIGPWR: Double = js.native
  
  var SIGQUIT: Double = js.native
  
  var SIGSEGV: Double = js.native
  
  var SIGSTKFLT: Double = js.native
  
  var SIGSTOP: Double = js.native
  
  var SIGSYS: Double = js.native
  
  var SIGTERM: Double = js.native
  
  var SIGTRAP: Double = js.native
  
  var SIGTSTP: Double = js.native
  
  var SIGTTIN: Double = js.native
  
  var SIGTTOU: Double = js.native
  
  var SIGUNUSED: Double = js.native
  
  var SIGURG: Double = js.native
  
  var SIGUSR1: Double = js.native
  
  var SIGUSR2: Double = js.native
  
  var SIGVTALRM: Double = js.native
  
  var SIGWINCH: Double = js.native
  
  var SIGXCPU: Double = js.native
  
  var SIGXFSZ: Double = js.native
}
object SignalConstants {
  
  @scala.inline
  def apply(
    SIGABRT: Double,
    SIGALRM: Double,
    SIGBREAK: Double,
    SIGBUS: Double,
    SIGCHLD: Double,
    SIGCONT: Double,
    SIGFPE: Double,
    SIGHUP: Double,
    SIGILL: Double,
    SIGINFO: Double,
    SIGINT: Double,
    SIGIO: Double,
    SIGIOT: Double,
    SIGKILL: Double,
    SIGLOST: Double,
    SIGPIPE: Double,
    SIGPOLL: Double,
    SIGPROF: Double,
    SIGPWR: Double,
    SIGQUIT: Double,
    SIGSEGV: Double,
    SIGSTKFLT: Double,
    SIGSTOP: Double,
    SIGSYS: Double,
    SIGTERM: Double,
    SIGTRAP: Double,
    SIGTSTP: Double,
    SIGTTIN: Double,
    SIGTTOU: Double,
    SIGUNUSED: Double,
    SIGURG: Double,
    SIGUSR1: Double,
    SIGUSR2: Double,
    SIGVTALRM: Double,
    SIGWINCH: Double,
    SIGXCPU: Double,
    SIGXFSZ: Double
  ): SignalConstants = {
    val __obj = js.Dynamic.literal(SIGABRT = SIGABRT.asInstanceOf[js.Any], SIGALRM = SIGALRM.asInstanceOf[js.Any], SIGBREAK = SIGBREAK.asInstanceOf[js.Any], SIGBUS = SIGBUS.asInstanceOf[js.Any], SIGCHLD = SIGCHLD.asInstanceOf[js.Any], SIGCONT = SIGCONT.asInstanceOf[js.Any], SIGFPE = SIGFPE.asInstanceOf[js.Any], SIGHUP = SIGHUP.asInstanceOf[js.Any], SIGILL = SIGILL.asInstanceOf[js.Any], SIGINFO = SIGINFO.asInstanceOf[js.Any], SIGINT = SIGINT.asInstanceOf[js.Any], SIGIO = SIGIO.asInstanceOf[js.Any], SIGIOT = SIGIOT.asInstanceOf[js.Any], SIGKILL = SIGKILL.asInstanceOf[js.Any], SIGLOST = SIGLOST.asInstanceOf[js.Any], SIGPIPE = SIGPIPE.asInstanceOf[js.Any], SIGPOLL = SIGPOLL.asInstanceOf[js.Any], SIGPROF = SIGPROF.asInstanceOf[js.Any], SIGPWR = SIGPWR.asInstanceOf[js.Any], SIGQUIT = SIGQUIT.asInstanceOf[js.Any], SIGSEGV = SIGSEGV.asInstanceOf[js.Any], SIGSTKFLT = SIGSTKFLT.asInstanceOf[js.Any], SIGSTOP = SIGSTOP.asInstanceOf[js.Any], SIGSYS = SIGSYS.asInstanceOf[js.Any], SIGTERM = SIGTERM.asInstanceOf[js.Any], SIGTRAP = SIGTRAP.asInstanceOf[js.Any], SIGTSTP = SIGTSTP.asInstanceOf[js.Any], SIGTTIN = SIGTTIN.asInstanceOf[js.Any], SIGTTOU = SIGTTOU.asInstanceOf[js.Any], SIGUNUSED = SIGUNUSED.asInstanceOf[js.Any], SIGURG = SIGURG.asInstanceOf[js.Any], SIGUSR1 = SIGUSR1.asInstanceOf[js.Any], SIGUSR2 = SIGUSR2.asInstanceOf[js.Any], SIGVTALRM = SIGVTALRM.asInstanceOf[js.Any], SIGWINCH = SIGWINCH.asInstanceOf[js.Any], SIGXCPU = SIGXCPU.asInstanceOf[js.Any], SIGXFSZ = SIGXFSZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalConstants]
  }
  
  @scala.inline
  implicit class SignalConstantsOps[Self <: SignalConstants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSIGABRT(value: Double): Self = this.set("SIGABRT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGALRM(value: Double): Self = this.set("SIGALRM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGBREAK(value: Double): Self = this.set("SIGBREAK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGBUS(value: Double): Self = this.set("SIGBUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGCHLD(value: Double): Self = this.set("SIGCHLD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGCONT(value: Double): Self = this.set("SIGCONT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGFPE(value: Double): Self = this.set("SIGFPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGHUP(value: Double): Self = this.set("SIGHUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGILL(value: Double): Self = this.set("SIGILL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGINFO(value: Double): Self = this.set("SIGINFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGINT(value: Double): Self = this.set("SIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGIO(value: Double): Self = this.set("SIGIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGIOT(value: Double): Self = this.set("SIGIOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGKILL(value: Double): Self = this.set("SIGKILL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGLOST(value: Double): Self = this.set("SIGLOST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGPIPE(value: Double): Self = this.set("SIGPIPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGPOLL(value: Double): Self = this.set("SIGPOLL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGPROF(value: Double): Self = this.set("SIGPROF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGPWR(value: Double): Self = this.set("SIGPWR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGQUIT(value: Double): Self = this.set("SIGQUIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGSEGV(value: Double): Self = this.set("SIGSEGV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGSTKFLT(value: Double): Self = this.set("SIGSTKFLT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGSTOP(value: Double): Self = this.set("SIGSTOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGSYS(value: Double): Self = this.set("SIGSYS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGTERM(value: Double): Self = this.set("SIGTERM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGTRAP(value: Double): Self = this.set("SIGTRAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGTSTP(value: Double): Self = this.set("SIGTSTP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGTTIN(value: Double): Self = this.set("SIGTTIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGTTOU(value: Double): Self = this.set("SIGTTOU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGUNUSED(value: Double): Self = this.set("SIGUNUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGURG(value: Double): Self = this.set("SIGURG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGUSR1(value: Double): Self = this.set("SIGUSR1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGUSR2(value: Double): Self = this.set("SIGUSR2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGVTALRM(value: Double): Self = this.set("SIGVTALRM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGWINCH(value: Double): Self = this.set("SIGWINCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGXCPU(value: Double): Self = this.set("SIGXCPU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIGXFSZ(value: Double): Self = this.set("SIGXFSZ", value.asInstanceOf[js.Any])
  }
}
