package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJSNs {
  type BeforeExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type DisconnectListener = js.Function0[scala.Unit]
  type Events = EventEmitter
  type ExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, scala.Unit]
  type MultipleResolveListener = js.Function3[
    /* type */ MultipleResolveType, 
    /* promise */ stdLib.Promise[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
  type MultipleResolveType = nodeLib.nodeLibStrings.resolve | nodeLib.nodeLibStrings.reject
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */js.Any, scala.Unit], 
    scala.Unit
  ]
  type Platform = nodeLib.nodeLibStrings.aix | nodeLib.nodeLibStrings.android | nodeLib.nodeLibStrings.darwin | nodeLib.nodeLibStrings.freebsd | nodeLib.nodeLibStrings.linux | nodeLib.nodeLibStrings.openbsd | nodeLib.nodeLibStrings.sunos | nodeLib.nodeLibStrings.win32 | nodeLib.nodeLibStrings.cygwin
  type RejectionHandledListener = js.Function1[/* promise */ stdLib.Promise[js.Any], scala.Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */js.Any, scala.Unit], 
    scala.Unit
  ]
  type Signals = nodeLib.nodeLibStrings.SIGABRT | nodeLib.nodeLibStrings.SIGALRM | nodeLib.nodeLibStrings.SIGBUS | nodeLib.nodeLibStrings.SIGCHLD | nodeLib.nodeLibStrings.SIGCONT | nodeLib.nodeLibStrings.SIGFPE | nodeLib.nodeLibStrings.SIGHUP | nodeLib.nodeLibStrings.SIGILL | nodeLib.nodeLibStrings.SIGINT | nodeLib.nodeLibStrings.SIGIO | nodeLib.nodeLibStrings.SIGIOT | nodeLib.nodeLibStrings.SIGKILL | nodeLib.nodeLibStrings.SIGPIPE | nodeLib.nodeLibStrings.SIGPOLL | nodeLib.nodeLibStrings.SIGPROF | nodeLib.nodeLibStrings.SIGPWR | nodeLib.nodeLibStrings.SIGQUIT | nodeLib.nodeLibStrings.SIGSEGV | nodeLib.nodeLibStrings.SIGSTKFLT | nodeLib.nodeLibStrings.SIGSTOP | nodeLib.nodeLibStrings.SIGSYS | nodeLib.nodeLibStrings.SIGTERM | nodeLib.nodeLibStrings.SIGTRAP | nodeLib.nodeLibStrings.SIGTSTP | nodeLib.nodeLibStrings.SIGTTIN | nodeLib.nodeLibStrings.SIGTTOU | nodeLib.nodeLibStrings.SIGUNUSED | nodeLib.nodeLibStrings.SIGURG | nodeLib.nodeLibStrings.SIGUSR1 | nodeLib.nodeLibStrings.SIGUSR2 | nodeLib.nodeLibStrings.SIGVTALRM | nodeLib.nodeLibStrings.SIGWINCH | nodeLib.nodeLibStrings.SIGXCPU | nodeLib.nodeLibStrings.SIGXFSZ | nodeLib.nodeLibStrings.SIGBREAK | nodeLib.nodeLibStrings.SIGLOST | nodeLib.nodeLibStrings.SIGINFO
  type SignalsListener = js.Function1[/* signal */ Signals, scala.Unit]
  type TypedArray = stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Float32Array | stdLib.Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ nodeLib.Error, scala.Unit]
  type UnhandledRejectionListener = js.Function2[/* reason */ js.Any, /* promise */ stdLib.Promise[js.Any], scala.Unit]
  type WarningListener = js.Function1[/* warning */ nodeLib.Error, scala.Unit]
}
