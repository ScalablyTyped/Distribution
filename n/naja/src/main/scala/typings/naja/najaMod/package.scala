package typings.naja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object najaMod {
  import typings.naja.Anon_Event
  import typings.naja.Anon_EventHandleEvent
  import typings.std.ArrayBuffer
  import typings.std.Blob
  import typings.std.Event
  import typings.std.FormData

  type NajaEventListener[T /* <: Event */] = js.Function1[/* event */ T, Unit | Anon_EventHandleEvent[T]]
  type RequestData = Null | String | Double | js.Array[js.Any] | js.Object | ArrayBuffer | Blob | FormData
  type SnippetUpdateListener = js.Function1[/* event */ SnippetUpdateEvent, Unit | Anon_Event]
}
