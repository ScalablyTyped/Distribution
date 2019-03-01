package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[java.lang.String] = js.undefined
  var factory: js.UndefOr[rdfDashJsLib.rdfDashJsMod.DataFactory] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var prefixes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    baseIRI: java.lang.String = null,
    factory: rdfDashJsLib.rdfDashJsMod.DataFactory = null,
    format: java.lang.String = null,
    prefixes: js.Array[java.lang.String] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    if (format != null) __obj.updateDynamic("format")(format)
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes)
    __obj.asInstanceOf[ParserOptions]
  }
}

