package typings.plupload

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

object plupload_events {
  @scala.inline
  def apply(
    BeforeUpload: plupload_event_file = null,
    ChunkUploaded: plupload_event_ChunkUploaded = null,
    Destroy: plupload_event = null,
    Error: plupload_event_Error = null,
    FileFiltered: plupload_event_file = null,
    FileUploaded: plupload_event_FileUploaded = null,
    FilesAdded: plupload_event_files = null,
    FilesRemoved: plupload_event_files = null,
    Init: plupload_event = null,
    OptionChanged: plupload_event_OptionChanged = null,
    PostInit: plupload_event = null,
    QueueChanged: plupload_event = null,
    Refresh: plupload_event = null,
    StateChanged: plupload_event = null,
    UploadComplete: plupload_event_files = null,
    UploadFile: plupload_event_file = null,
    UploadProgress: plupload_event_file = null
  ): plupload_events = {
    val __obj = js.Dynamic.literal()
    if (BeforeUpload != null) __obj.updateDynamic("BeforeUpload")(BeforeUpload)
    if (ChunkUploaded != null) __obj.updateDynamic("ChunkUploaded")(ChunkUploaded)
    if (Destroy != null) __obj.updateDynamic("Destroy")(Destroy)
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (FileFiltered != null) __obj.updateDynamic("FileFiltered")(FileFiltered)
    if (FileUploaded != null) __obj.updateDynamic("FileUploaded")(FileUploaded)
    if (FilesAdded != null) __obj.updateDynamic("FilesAdded")(FilesAdded)
    if (FilesRemoved != null) __obj.updateDynamic("FilesRemoved")(FilesRemoved)
    if (Init != null) __obj.updateDynamic("Init")(Init)
    if (OptionChanged != null) __obj.updateDynamic("OptionChanged")(OptionChanged)
    if (PostInit != null) __obj.updateDynamic("PostInit")(PostInit)
    if (QueueChanged != null) __obj.updateDynamic("QueueChanged")(QueueChanged)
    if (Refresh != null) __obj.updateDynamic("Refresh")(Refresh)
    if (StateChanged != null) __obj.updateDynamic("StateChanged")(StateChanged)
    if (UploadComplete != null) __obj.updateDynamic("UploadComplete")(UploadComplete)
    if (UploadFile != null) __obj.updateDynamic("UploadFile")(UploadFile)
    if (UploadProgress != null) __obj.updateDynamic("UploadProgress")(UploadProgress)
    __obj.asInstanceOf[plupload_events]
  }
}

