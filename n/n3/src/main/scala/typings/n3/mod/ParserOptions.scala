package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[String] = js.undefined
  var factory: js.UndefOr[typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var prefixes: js.UndefOr[js.Array[String]] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    baseIRI: String = null,
    factory: typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad] = null,
    format: String = null,
    prefixes: js.Array[String] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

