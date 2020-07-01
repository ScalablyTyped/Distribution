package typings.next.mod

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStaticPropsContext[Q /* <: ParsedUrlQuery */] extends js.Object {
  var params: js.UndefOr[Q] = js.undefined
  var preview: js.UndefOr[Boolean] = js.undefined
  var previewData: js.UndefOr[js.Any] = js.undefined
}

object GetStaticPropsContext {
  @scala.inline
  def apply[/* <: typings.node.querystringMod.ParsedUrlQuery */ Q](params: Q = null, preview: js.UndefOr[Boolean] = js.undefined, previewData: js.Any = null): GetStaticPropsContext[Q] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    if (previewData != null) __obj.updateDynamic("previewData")(previewData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticPropsContext[Q]]
  }
}

