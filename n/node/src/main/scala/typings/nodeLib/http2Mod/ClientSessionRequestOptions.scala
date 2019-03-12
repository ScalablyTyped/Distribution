package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSessionRequestOptions extends js.Object {
  var endStream: js.UndefOr[scala.Boolean] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var getTrailers: js.UndefOr[
    js.Function2[
      /* trailers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var parent: js.UndefOr[scala.Double] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object ClientSessionRequestOptions {
  @scala.inline
  def apply(
    endStream: js.UndefOr[scala.Boolean] = js.undefined,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    getTrailers: (/* trailers */ nodeLib.httpMod.OutgoingHttpHeaders, /* flags */ scala.Double) => scala.Unit = null,
    parent: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (getTrailers != null) __obj.updateDynamic("getTrailers")(js.Any.fromFunction2(getTrailers))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
}

