package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// View
// -------------------------------------

trait View[D] extends js.Object {
  var map: js.UndefOr[js.Function1[/* doc */ D with Document, scala.Unit]] = js.undefined
  var reduce: js.UndefOr[js.Function1[/* doc */ D with Document, scala.Unit]] = js.undefined
}

