package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadFilters extends js.Object {
  var max_file_size: js.UndefOr[Double | String] = js.undefined
  var mime_types: js.UndefOr[js.Array[pluploadFiltersMimeTypes]] = js.undefined
  var prevent_duplicates: js.UndefOr[Boolean] = js.undefined
}

object pluploadFilters {
  @scala.inline
  def apply(
    max_file_size: Double | String = null,
    mime_types: js.Array[pluploadFiltersMimeTypes] = null,
    prevent_duplicates: js.UndefOr[Boolean] = js.undefined
  ): pluploadFilters = {
    val __obj = js.Dynamic.literal()
    if (max_file_size != null) __obj.updateDynamic("max_file_size")(max_file_size.asInstanceOf[js.Any])
    if (mime_types != null) __obj.updateDynamic("mime_types")(mime_types.asInstanceOf[js.Any])
    if (!js.isUndefined(prevent_duplicates)) __obj.updateDynamic("prevent_duplicates")(prevent_duplicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadFilters]
  }
}

