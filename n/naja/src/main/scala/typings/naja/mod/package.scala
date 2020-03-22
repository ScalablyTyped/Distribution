package typings.naja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NajaEventListener[T /* <: typings.std.Event_ */] = (js.Function1[/* event */ T, js.Promise[scala.Unit] | scala.Unit]) | typings.naja.Anon0[T]
  type RequestData = scala.Null | java.lang.String | scala.Double | js.Array[js.Any] | js.Object | typings.std.ArrayBuffer | typings.std.Blob | typings.std.FormData
  type SnippetUpdateListener = (js.Function1[
    /* event */ typings.naja.mod.SnippetUpdateEvent, 
    js.Promise[scala.Unit] | scala.Unit
  ]) | typings.naja.AnonHandleEvent
}
