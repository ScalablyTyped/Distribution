package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterOptions extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var prefixes: js.UndefOr[Prefixes[typings.rdfJs.mod.NamedNode | String]] = js.undefined
}

object WriterOptions {
  @scala.inline
  def apply(
    end: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    prefixes: Prefixes[typings.rdfJs.mod.NamedNode | String] = null
  ): WriterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriterOptions]
  }
}

