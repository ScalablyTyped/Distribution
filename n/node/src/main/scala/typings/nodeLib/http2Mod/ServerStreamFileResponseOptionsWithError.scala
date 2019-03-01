package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptionsWithError extends ServerStreamFileResponseOptions {
  var onError: js.UndefOr[js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]] = js.undefined
}

object ServerStreamFileResponseOptionsWithError {
  @scala.inline
  def apply(
    getTrailers: js.Function1[/* trailers */ nodeLib.httpMod.OutgoingHttpHeaders, scala.Unit] = null,
    length: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    onError: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit] = null,
    statCheck: js.Function3[
      /* stats */ nodeLib.fsMod.Stats, 
      /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      scala.Unit | scala.Boolean
    ] = null
  ): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    if (getTrailers != null) __obj.updateDynamic("getTrailers")(getTrailers)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (statCheck != null) __obj.updateDynamic("statCheck")(statCheck)
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
}

