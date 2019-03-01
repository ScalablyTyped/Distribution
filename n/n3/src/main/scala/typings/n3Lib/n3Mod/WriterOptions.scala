package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterOptions extends js.Object {
  var end: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var prefixes: js.UndefOr[Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode | java.lang.String]] = js.undefined
}

object WriterOptions {
  @scala.inline
  def apply(
    end: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    prefixes: Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode | java.lang.String] = null
  ): WriterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (format != null) __obj.updateDynamic("format")(format)
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes)
    __obj.asInstanceOf[WriterOptions]
  }
}

