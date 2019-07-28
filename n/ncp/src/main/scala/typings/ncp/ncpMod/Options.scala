package typings.ncp.ncpMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clobber: js.UndefOr[Boolean] = js.undefined
  var dereference: js.UndefOr[Boolean] = js.undefined
  var errs: js.UndefOr[WritableStream] = js.undefined
  var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
  var stopOnErr: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[js.Function2[/* read */ ReadableStream, /* write */ WritableStream, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clobber: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    errs: WritableStream = null,
    filter: RegExp | (js.Function1[/* filename */ String, Boolean]) = null,
    stopOnErr: js.UndefOr[Boolean] = js.undefined,
    transform: (/* read */ ReadableStream, /* write */ WritableStream) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber)
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (errs != null) __obj.updateDynamic("errs")(errs)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnErr)) __obj.updateDynamic("stopOnErr")(stopOnErr)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[Options]
  }
}

