package typings.node.http2Mod

import typings.node.NodeJS.ErrnoException
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
    length: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onError: /* err */ ErrnoException => Unit = null,
    statCheck: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean = null,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3(statCheck))
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
}

