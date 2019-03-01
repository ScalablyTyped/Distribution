package typings
package ncpLib.ncpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clobber: js.UndefOr[scala.Boolean] = js.undefined
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  var errs: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var filter: js.UndefOr[stdLib.RegExp | (js.Function1[/* filename */ java.lang.String, scala.Boolean])] = js.undefined
  var stopOnErr: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function2[
      /* read */ nodeLib.NodeJSNs.ReadableStream, 
      /* write */ nodeLib.NodeJSNs.WritableStream, 
      scala.Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clobber: js.UndefOr[scala.Boolean] = js.undefined,
    dereference: js.UndefOr[scala.Boolean] = js.undefined,
    errs: nodeLib.NodeJSNs.WritableStream = null,
    filter: stdLib.RegExp | (js.Function1[/* filename */ java.lang.String, scala.Boolean]) = null,
    stopOnErr: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.Function2[
      /* read */ nodeLib.NodeJSNs.ReadableStream, 
      /* write */ nodeLib.NodeJSNs.WritableStream, 
      scala.Unit
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber)
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (errs != null) __obj.updateDynamic("errs")(errs)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnErr)) __obj.updateDynamic("stopOnErr")(stopOnErr)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Options]
  }
}

