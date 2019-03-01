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
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], scala.Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type SignalsListener = js.Function1[/* signal */ Signals, scala.Unit]
  type TypedArray = stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Float32Array | stdLib.Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ nodeLib.Error, scala.Unit]
  type UnhandledRejectionListener = js.Function2[/* reason */ js.Any, /* promise */ js.Promise[js.Any], scala.Unit]
  type WarningListener = js.Function1[/* warning */ nodeLib.Error, scala.Unit]
}
