package typings.next

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams[Q /* <: ParsedUrlQuery */] extends js.Object {
  var params: js.UndefOr[Q] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
  var previewData: js.UndefOr[js.Any] = js.undefined
}

object AnonParams {
  @scala.inline
  def apply[Q /* <: ParsedUrlQuery */](params: Q = null, preview: js.UndefOr[Boolean] = js.undefined, previewData: js.Any = null): AnonParams[Q] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (previewData != null) __obj.updateDynamic("previewData")(previewData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams[Q]]
  }
}

