package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "options")
@js.native
object options extends js.Object {
  var debounceRendering: js.UndefOr[js.Function1[/* render */ js.Function0[scala.Unit], scala.Unit]] = js.native
  var event: js.UndefOr[js.Function1[/* event */ stdLib.Event, stdLib.Event]] = js.native
  var syncComponentUpdates: js.UndefOr[scala.Boolean] = js.native
  var vnode: js.UndefOr[js.Function1[/* vnode */ preactLib.preactMod.VNode[_], scala.Unit]] = js.native
}

