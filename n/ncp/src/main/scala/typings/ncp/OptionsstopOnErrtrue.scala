package typings.ncp

import typings.ncp.mod.File
import typings.ncp.ncpBooleans.`true`
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.fsMod.PathLike
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ncp.ncp.Options & {  stopOnErr  :true} */
trait OptionsstopOnErrtrue extends js.Object {
  var clobber: js.UndefOr[Boolean] = js.undefined
  var dereference: js.UndefOr[Boolean] = js.undefined
  var errs: js.UndefOr[PathLike] = js.undefined
  var filter: js.UndefOr[RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var stopOnErr: js.UndefOr[Boolean with `true`] = js.undefined
  var transform: js.UndefOr[
    js.Function3[/* read */ ReadableStream, /* write */ WritableStream, /* file */ File, Unit]
  ] = js.undefined
}

object OptionsstopOnErrtrue {
  @scala.inline
  def apply(
    clobber: js.UndefOr[Boolean] = js.undefined,
    dereference: js.UndefOr[Boolean] = js.undefined,
    errs: PathLike = null,
    filter: RegExp | (js.Function1[/* filename */ String, Boolean]) = null,
    limit: Int | Double = null,
    stopOnErr: js.UndefOr[Boolean with `true`] = js.undefined,
    transform: (/* read */ ReadableStream, /* write */ WritableStream, /* file */ File) => Unit = null
  ): OptionsstopOnErrtrue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clobber)) __obj.updateDynamic("clobber")(clobber.asInstanceOf[js.Any])
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference.asInstanceOf[js.Any])
    if (errs != null) __obj.updateDynamic("errs")(errs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(stopOnErr)) __obj.updateDynamic("stopOnErr")(stopOnErr.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[OptionsstopOnErrtrue]
  }
}

