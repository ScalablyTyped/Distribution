package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_settings extends js.Object {
  /** Required Options */
  var browse_button: js.Any
  /** Chunk */
  var chunk_size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  /** Drag&Drop Files from the Desktop */
  var drop_element: js.UndefOr[java.lang.String] = js.undefined
  var file_data_name: js.UndefOr[java.lang.String] = js.undefined
  /** Filters */
  var filters: js.UndefOr[plupload_filters] = js.undefined
  var flash_swf_url: js.UndefOr[java.lang.String] = js.undefined
  /** Control the request */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** Events */
  var init: js.UndefOr[plupload_events] = js.undefined
  var max_retries: js.UndefOr[scala.Double] = js.undefined
  /** Useful Options */
  var multi_selection: js.UndefOr[scala.Boolean] = js.undefined
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  var multipart_params: js.UndefOr[js.Any] = js.undefined
  var required_features: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /** Client-Side Image Resize */
  var resize: js.UndefOr[plupload_resize] = js.undefined
  /** Optional */
  var runtimes: js.UndefOr[java.lang.String] = js.undefined
  var silverlight_xap_url: js.UndefOr[java.lang.String] = js.undefined
  var unique_names: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

