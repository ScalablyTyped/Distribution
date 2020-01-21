package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  type ArrayBufferView = typings.node.NodeJS.TypedArray | typings.std.DataView
  type BeforeExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type DisconnectListener = js.Function0[scala.Unit]
  type ExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  type HRTime = js.Function1[
    /* time */ js.UndefOr[js.Tuple2[scala.Double, scala.Double]], 
    js.Tuple2[scala.Double, scala.Double]
  ]
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, scala.Unit]
  type MultipleResolveListener = js.Function3[
    /* type */ typings.node.NodeJS.MultipleResolveType, 
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type NodeRequireCache = org.scalablytyped.runtime.StringDictionary[typings.node.NodeModule]
  type ProcessEnv = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], scala.Unit]
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type SignalsListener = js.Function1[/* signal */ typings.node.NodeJS.Signals, scala.Unit]
  type TypedArray = typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Uint16Array | typings.std.Uint32Array | typings.std.Int8Array | typings.std.Int16Array | typings.std.Int32Array | typings.std.Float32Array | typings.std.Float64Array
  type UncaughtExceptionListener = js.Function1[/* error */ typings.std.Error, scala.Unit]
  type UnhandledRejectionListener = js.Function2[
    /* reason */ js.UndefOr[js.Object | scala.Null], 
    /* promise */ js.Promise[js.Any], 
    scala.Unit
  ]
  type WarningListener = js.Function1[/* warning */ typings.std.Error, scala.Unit]
}
