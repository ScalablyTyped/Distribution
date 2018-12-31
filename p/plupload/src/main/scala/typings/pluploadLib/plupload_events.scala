package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_events extends js.Object {
  var BeforeUpload: js.UndefOr[plupload_event_file] = js.undefined
  var ChunkUploaded: js.UndefOr[plupload_event_ChunkUploaded] = js.undefined
  var Destroy: js.UndefOr[plupload_event] = js.undefined
  var Error: js.UndefOr[plupload_event_Error] = js.undefined
  var FileFiltered: js.UndefOr[plupload_event_file] = js.undefined
  var FileUploaded: js.UndefOr[plupload_event_FileUploaded] = js.undefined
  var FilesAdded: js.UndefOr[plupload_event_files] = js.undefined
  var FilesRemoved: js.UndefOr[plupload_event_files] = js.undefined
  var Init: js.UndefOr[plupload_event] = js.undefined
  var OptionChanged: js.UndefOr[plupload_event_OptionChanged] = js.undefined
  var PostInit: js.UndefOr[plupload_event] = js.undefined
  var QueueChanged: js.UndefOr[plupload_event] = js.undefined
  var Refresh: js.UndefOr[plupload_event] = js.undefined
  var StateChanged: js.UndefOr[plupload_event] = js.undefined
  var UploadComplete: js.UndefOr[plupload_event_files] = js.undefined
  var UploadFile: js.UndefOr[plupload_event_file] = js.undefined
  var UploadProgress: js.UndefOr[plupload_event_file] = js.undefined
}

