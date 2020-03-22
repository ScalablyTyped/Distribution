package typings.pathParser.pathMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalPathOptions extends js.Object {
  var queryParams: js.UndefOr[IOptions] = js.undefined
  var urlParamsEncoding: URLParamsEncodingType
}

object InternalPathOptions {
  @scala.inline
  def apply(urlParamsEncoding: URLParamsEncodingType, queryParams: IOptions = null): InternalPathOptions = {
    val __obj = js.Dynamic.literal(urlParamsEncoding = urlParamsEncoding.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalPathOptions]
  }
}

