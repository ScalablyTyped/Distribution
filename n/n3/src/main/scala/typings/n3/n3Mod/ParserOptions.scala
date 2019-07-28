package typings.n3.n3Mod

import typings.rdfDashJs.rdfDashJsMod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[String] = js.undefined
  var factory: js.UndefOr[DataFactory] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var prefixes: js.UndefOr[js.Array[String]] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    baseIRI: String = null,
    factory: DataFactory = null,
    format: String = null,
    prefixes: js.Array[String] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI)
    if (factory != null) __obj.updateDynamic("factory")(factory)
    if (format != null) __obj.updateDynamic("format")(format)
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes)
    __obj.asInstanceOf[ParserOptions]
  }
}

