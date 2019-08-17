package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJSNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Error
  import typings.std.Float32Array
  import typings.std.Float64Array
  import typings.std.Int16Array
  import typings.std.Int32Array
  import typings.std.Int8Array
  import typings.std.Uint16Array
  import typings.std.Uint32Array
  import typings.std.Uint8Array
  import typings.std.Uint8ClampedArray

  type BeforeExitListener = js.Function1[/* code */ Double, Unit]
  type DisconnectListener = js.Function0[Unit]
  type Events = EventEmitter
  type ExitListener = js.Function1[/* code */ Double, Unit]
  type HRTime = js.Function1[/* time */ js.UndefOr[js.Tuple2[Double, Double]], js.Tuple2[Double, Double]]
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, Unit]
  type MultipleResolveListener = js.Function3[
    /* type */ MultipleResolveType, 
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    Unit
  ]
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
    Unit
  ]
  type ProcessEnv = StringDictionary[js.UndefOr[java.lang.String]]
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
    Unit
  ]
  type SignalsListener = js.Function1[/* signal */ Signals, Unit]
  type TypedArray = Uint8Array | Uint8ClampedArray | Uint16Array | Uint32Array | Int8Array | Int16Array | Int32Array | Float32Array | Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ Error, Unit]
  type UnhandledRejectionListener = js.Function2[/* reason */ js.UndefOr[js.Object | Null], /* promise */ js.Promise[js.Any], Unit]
  type WarningListener = js.Function1[/* warning */ Error, Unit]
}
