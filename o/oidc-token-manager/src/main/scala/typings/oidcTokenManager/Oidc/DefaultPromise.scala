package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultPromise extends js.Object {
  def `catch`(errorCallback: js.Function0[Unit]): DefaultPromise
  def `then`(
    successCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
    errorCallback: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): DefaultPromise
}

object DefaultPromise {
  @scala.inline
  def apply(
    `catch`: js.Function0[Unit] => DefaultPromise,
    `then`: (js.Function1[/* value */ js.UndefOr[js.Any], Unit], js.Function1[/* reason */ js.UndefOr[js.Any], Unit]) => DefaultPromise
  ): DefaultPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[DefaultPromise]
  }
}

