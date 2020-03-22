package typings.nise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<nise.nise.FakeServerOptions> */
trait PartialFakeServerOptions extends js.Object {
  var autoRespond: js.UndefOr[Boolean] = js.undefined
  var autoRespondAfter: js.UndefOr[Double] = js.undefined
  var fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined
  var respondImmediately: js.UndefOr[Boolean] = js.undefined
}

object PartialFakeServerOptions {
  @scala.inline
  def apply(
    autoRespond: js.UndefOr[Boolean] = js.undefined,
    autoRespondAfter: Int | Double = null,
    fakeHTTPMethods: js.UndefOr[Boolean] = js.undefined,
    respondImmediately: js.UndefOr[Boolean] = js.undefined
  ): PartialFakeServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRespond)) __obj.updateDynamic("autoRespond")(autoRespond.asInstanceOf[js.Any])
    if (autoRespondAfter != null) __obj.updateDynamic("autoRespondAfter")(autoRespondAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(fakeHTTPMethods)) __obj.updateDynamic("fakeHTTPMethods")(fakeHTTPMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(respondImmediately)) __obj.updateDynamic("respondImmediately")(respondImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFakeServerOptions]
  }
}

