package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_settings extends js.Object {
  /** Required Options */
  var browse_button: js.Any
  /** Chunk */
  var chunk_size: js.UndefOr[Double | String] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  /** Drag&Drop Files from the Desktop */
  var drop_element: js.UndefOr[String] = js.undefined
  var file_data_name: js.UndefOr[String] = js.undefined
  /** Filters */
  var filters: js.UndefOr[plupload_filters] = js.undefined
  var flash_swf_url: js.UndefOr[String] = js.undefined
  /** Control the request */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** Events */
  var init: js.UndefOr[plupload_events] = js.undefined
  var max_retries: js.UndefOr[Double] = js.undefined
  /** Useful Options */
  var multi_selection: js.UndefOr[Boolean] = js.undefined
  var multipart: js.UndefOr[Boolean] = js.undefined
  var multipart_params: js.UndefOr[js.Any] = js.undefined
  var required_features: js.UndefOr[String | js.Any] = js.undefined
  /** Client-Side Image Resize */
  var resize: js.UndefOr[plupload_resize] = js.undefined
  /** Optional */
  var runtimes: js.UndefOr[String] = js.undefined
  var silverlight_xap_url: js.UndefOr[String] = js.undefined
  var unique_names: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object plupload_settings {
  @scala.inline
  def apply(
    browse_button: js.Any,
    url: String,
    chunk_size: Double | String = null,
    container: js.Any = null,
    drop_element: String = null,
    file_data_name: String = null,
    filters: plupload_filters = null,
    flash_swf_url: String = null,
    headers: js.Any = null,
    init: plupload_events = null,
    max_retries: Int | Double = null,
    multi_selection: js.UndefOr[Boolean] = js.undefined,
    multipart: js.UndefOr[Boolean] = js.undefined,
    multipart_params: js.Any = null,
    required_features: String | js.Any = null,
    resize: plupload_resize = null,
    runtimes: String = null,
    silverlight_xap_url: String = null,
    unique_names: js.UndefOr[Boolean] = js.undefined
  ): plupload_settings = {
    val __obj = js.Dynamic.literal(browse_button = browse_button, url = url)
    if (chunk_size != null) __obj.updateDynamic("chunk_size")(chunk_size.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (drop_element != null) __obj.updateDynamic("drop_element")(drop_element)
    if (file_data_name != null) __obj.updateDynamic("file_data_name")(file_data_name)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (flash_swf_url != null) __obj.updateDynamic("flash_swf_url")(flash_swf_url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (init != null) __obj.updateDynamic("init")(init)
    if (max_retries != null) __obj.updateDynamic("max_retries")(max_retries.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_selection)) __obj.updateDynamic("multi_selection")(multi_selection)
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (multipart_params != null) __obj.updateDynamic("multipart_params")(multipart_params)
    if (required_features != null) __obj.updateDynamic("required_features")(required_features.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (runtimes != null) __obj.updateDynamic("runtimes")(runtimes)
    if (silverlight_xap_url != null) __obj.updateDynamic("silverlight_xap_url")(silverlight_xap_url)
    if (!js.isUndefined(unique_names)) __obj.updateDynamic("unique_names")(unique_names)
    __obj.asInstanceOf[plupload_settings]
  }
}

