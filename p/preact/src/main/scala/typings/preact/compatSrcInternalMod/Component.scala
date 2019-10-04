package typings.preact.compatSrcInternalMod

import typings.preact.preactNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[P, S]
  extends typings.preact.srcInternalMod.Component[P, S] {
  var _childDidSuspend: js.UndefOr[js.Function1[/* error */ js.Promise[Unit], Unit]] = js.native
  var isPureReactComponent: js.UndefOr[`true`] = js.native
  var isReactComponent: js.UndefOr[js.Object] = js.native
}

