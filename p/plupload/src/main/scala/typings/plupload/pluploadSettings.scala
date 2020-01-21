package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadSettings extends js.Object {
  /** Required Options */
  var browse_button: js.Any
  /** Chunk */
  var chunk_size: js.UndefOr[Double | String] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  /** Drag&Drop Files from the Desktop */
  var drop_element: js.UndefOr[String] = js.undefined
  var file_data_name: js.UndefOr[String] = js.undefined
  /** Filters */
  var filters: js.UndefOr[pluploadFilters] = js.undefined
  var flash_swf_url: js.UndefOr[String] = js.undefined
  /** Control the request */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** Events */
  var init: js.UndefOr[pluploadEvents] = js.undefined
  var max_retries: js.UndefOr[Double] = js.undefined
  /** Useful Options */
  var multi_selection: js.UndefOr[Boolean] = js.undefined
  var multipart: js.UndefOr[Boolean] = js.undefined
  var multipart_params: js.UndefOr[js.Any] = js.undefined
  var required_features: js.UndefOr[String | js.Any] = js.undefined
  /** Client-Side Image Resize */
  var resize: js.UndefOr[pluploadResize] = js.undefined
  /** Optional */
  var runtimes: js.UndefOr[String] = js.undefined
  var silverlight_xap_url: js.UndefOr[String] = js.undefined
  var unique_names: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object pluploadSettings {
  @scala.inline
  def apply(
    browse_button: js.Any,
    url: String,
    chunk_size: Double | String = null,
    container: js.Any = null,
    drop_element: String = null,
    file_data_name: String = null,
    filters: pluploadFilters = null,
    flash_swf_url: String = null,
    headers: js.Any = null,
    init: pluploadEvents = null,
    max_retries: Int | Double = null,
    multi_selection: js.UndefOr[Boolean] = js.undefined,
    multipart: js.UndefOr[Boolean] = js.undefined,
    multipart_params: js.Any = null,
    required_features: String | js.Any = null,
    resize: pluploadResize = null,
    runtimes: String = null,
    silverlight_xap_url: String = null,
    unique_names: js.UndefOr[Boolean] = js.undefined
  ): pluploadSettings = {
    val __obj = js.Dynamic.literal(browse_button = browse_button.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (chunk_size != null) __obj.updateDynamic("chunk_size")(chunk_size.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (drop_element != null) __obj.updateDynamic("drop_element")(drop_element.asInstanceOf[js.Any])
    if (file_data_name != null) __obj.updateDynamic("file_data_name")(file_data_name.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (flash_swf_url != null) __obj.updateDynamic("flash_swf_url")(flash_swf_url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (max_retries != null) __obj.updateDynamic("max_retries")(max_retries.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_selection)) __obj.updateDynamic("multi_selection")(multi_selection.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (multipart_params != null) __obj.updateDynamic("multipart_params")(multipart_params.asInstanceOf[js.Any])
    if (required_features != null) __obj.updateDynamic("required_features")(required_features.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (runtimes != null) __obj.updateDynamic("runtimes")(runtimes.asInstanceOf[js.Any])
    if (silverlight_xap_url != null) __obj.updateDynamic("silverlight_xap_url")(silverlight_xap_url.asInstanceOf[js.Any])
    if (!js.isUndefined(unique_names)) __obj.updateDynamic("unique_names")(unique_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadSettings]
  }
}

