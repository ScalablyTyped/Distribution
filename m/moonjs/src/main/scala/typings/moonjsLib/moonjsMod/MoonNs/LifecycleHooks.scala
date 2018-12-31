package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleHooks extends js.Object {
  var destroyed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var mounted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var updated: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

