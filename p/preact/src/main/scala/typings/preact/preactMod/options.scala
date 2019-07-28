package typings.preact.preactMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "options")
@js.native
object options extends js.Object {
  var debounceRendering: js.UndefOr[js.Function1[/* render */ js.Function0[Unit], Unit]] = js.native
  var event: js.UndefOr[js.Function1[/* event */ Event, Event]] = js.native
  var syncComponentUpdates: js.UndefOr[Boolean] = js.native
  var vnode: js.UndefOr[js.Function1[/* vnode */ VNode[_], Unit]] = js.native
}

