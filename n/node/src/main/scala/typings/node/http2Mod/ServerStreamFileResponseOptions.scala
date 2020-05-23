package typings.node.http2Mod

import typings.node.fsMod.Stats
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptions extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ Stats, 
      /* headers */ OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      Unit | Boolean
    ]
  ] = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}

object ServerStreamFileResponseOptions {
  @scala.inline
  def apply(
    length: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    statCheck: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean = null,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3(statCheck))
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
}

