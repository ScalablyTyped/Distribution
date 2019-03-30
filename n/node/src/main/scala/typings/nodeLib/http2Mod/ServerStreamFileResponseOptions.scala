package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptions extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ nodeLib.fsMod.Stats, 
      /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var waitForTrailers: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerStreamFileResponseOptions {
  @scala.inline
  def apply(
    length: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    statCheck: (/* stats */ nodeLib.fsMod.Stats, /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, /* statOptions */ StatOptions) => scala.Unit | scala.Boolean = null,
    waitForTrailers: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3(statCheck))
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers)
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
}

