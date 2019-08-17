package typings.pixlDashXml.pixlDashXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixlParseOptions extends js.Object {
  var forceArrays: js.UndefOr[Boolean] = js.undefined
  var lowerCase: js.UndefOr[Boolean] = js.undefined
  var preserveAttributes: js.UndefOr[Boolean] = js.undefined
  var preserveDocumentNode: js.UndefOr[Boolean] = js.undefined
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
}

object PixlParseOptions {
  @scala.inline
  def apply(
    forceArrays: js.UndefOr[Boolean] = js.undefined,
    lowerCase: js.UndefOr[Boolean] = js.undefined,
    preserveAttributes: js.UndefOr[Boolean] = js.undefined,
    preserveDocumentNode: js.UndefOr[Boolean] = js.undefined,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  ): PixlParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceArrays)) __obj.updateDynamic("forceArrays")(forceArrays)
    if (!js.isUndefined(lowerCase)) __obj.updateDynamic("lowerCase")(lowerCase)
    if (!js.isUndefined(preserveAttributes)) __obj.updateDynamic("preserveAttributes")(preserveAttributes)
    if (!js.isUndefined(preserveDocumentNode)) __obj.updateDynamic("preserveDocumentNode")(preserveDocumentNode)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    __obj.asInstanceOf[PixlParseOptions]
  }
}

