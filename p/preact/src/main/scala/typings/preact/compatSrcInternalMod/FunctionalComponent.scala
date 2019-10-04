package typings.preact.compatSrcInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionalComponent[P]
  extends typings.preact.srcInternalMod.FunctionalComponent[P] {
  var _forwarded: js.UndefOr[Boolean] = js.native
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* nextProps */ P, Boolean]] = js.native
}

