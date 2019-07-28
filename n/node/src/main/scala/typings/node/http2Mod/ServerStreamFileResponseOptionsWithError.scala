package typings.node.http2Mod

import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.Stats
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptionsWithError extends ServerStreamFileResponseOptions {
  var onError: js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]] = js.undefined
}

object ServerStreamFileResponseOptionsWithError {
  @scala.inline
  def apply(
    length: Int | Double = null,
    offset: Int | Double = null,
    onError: /* err */ ErrnoException => Unit = null,
    statCheck: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean = null,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3(statCheck))
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers)
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
}

