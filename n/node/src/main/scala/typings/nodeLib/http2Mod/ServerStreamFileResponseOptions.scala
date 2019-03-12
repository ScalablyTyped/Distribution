package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptions extends js.Object {
  var getTrailers: js.UndefOr[js.Function1[/* trailers */ nodeLib.httpMod.OutgoingHttpHeaders, scala.Unit]] = js.undefined
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
}

object ServerStreamFileResponseOptions {
  @scala.inline
  def apply(
    getTrailers: /* trailers */ nodeLib.httpMod.OutgoingHttpHeaders => scala.Unit = null,
    length: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    statCheck: (/* stats */ nodeLib.fsMod.Stats, /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, /* statOptions */ StatOptions) => scala.Unit | scala.Boolean = null
  ): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (getTrailers != null) __obj.updateDynamic("getTrailers")(js.Any.fromFunction1(getTrailers))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3(statCheck))
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
}

