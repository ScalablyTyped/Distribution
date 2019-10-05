package typings.oidcDashTokenDashManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Oidc.DefaultPromise")
@js.native
class DefaultPromise protected () extends js.Object {
  def this(promise: js.Any) = this()
  def `catch`(errorCallback: js.Function0[Unit]): DefaultPromise = js.native
  def `then`(
    successCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
    errorCallback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): DefaultPromise = js.native
}

