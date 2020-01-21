package typings.plupload

import typings.plupload.plupload.Uploader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadEvents extends js.Object {
  var BeforeUpload: js.UndefOr[pluploadEventFile] = js.undefined
  var ChunkUploaded: js.UndefOr[pluploadEventChunkUploaded] = js.undefined
  var Destroy: js.UndefOr[pluploadEvent] = js.undefined
  var Error: js.UndefOr[pluploadEventError] = js.undefined
  var FileFiltered: js.UndefOr[pluploadEventFile] = js.undefined
  var FileUploaded: js.UndefOr[pluploadEventFileUploaded] = js.undefined
  var FilesAdded: js.UndefOr[pluploadEventFiles] = js.undefined
  var FilesRemoved: js.UndefOr[pluploadEventFiles] = js.undefined
  var Init: js.UndefOr[pluploadEvent] = js.undefined
  var OptionChanged: js.UndefOr[pluploadEventOptionChanged] = js.undefined
  var PostInit: js.UndefOr[pluploadEvent] = js.undefined
  var QueueChanged: js.UndefOr[pluploadEvent] = js.undefined
  var Refresh: js.UndefOr[pluploadEvent] = js.undefined
  var StateChanged: js.UndefOr[pluploadEvent] = js.undefined
  var UploadComplete: js.UndefOr[pluploadEventFiles] = js.undefined
  var UploadFile: js.UndefOr[pluploadEventFile] = js.undefined
  var UploadProgress: js.UndefOr[pluploadEventFile] = js.undefined
}

object pluploadEvents {
  @scala.inline
  def apply(
    BeforeUpload: (/* uploader */ Uploader, /* file */ js.Any) => js.Any = null,
    ChunkUploaded: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadChunkResponse) => js.Any = null,
    Destroy: /* uploader */ Uploader => js.Any = null,
    Error: (/* uploader */ Uploader, /* error */ pluploadError) => js.Any = null,
    FileFiltered: (/* uploader */ Uploader, /* file */ js.Any) => js.Any = null,
    FileUploaded: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadResponse) => js.Any = null,
    FilesAdded: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any = null,
    FilesRemoved: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any = null,
    Init: /* uploader */ Uploader => js.Any = null,
    OptionChanged: (/* uploader */ Uploader, /* name */ String, /* value */ js.Any, /* oldValue */ js.Any) => js.Any = null,
    PostInit: /* uploader */ Uploader => js.Any = null,
    QueueChanged: /* uploader */ Uploader => js.Any = null,
    Refresh: /* uploader */ Uploader => js.Any = null,
    StateChanged: /* uploader */ Uploader => js.Any = null,
    UploadComplete: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any = null,
    UploadFile: (/* uploader */ Uploader, /* file */ js.Any) => js.Any = null,
    UploadProgress: (/* uploader */ Uploader, /* file */ js.Any) => js.Any = null
  ): pluploadEvents = {
    val __obj = js.Dynamic.literal()
    if (BeforeUpload != null) __obj.updateDynamic("BeforeUpload")(js.Any.fromFunction2(BeforeUpload))
    if (ChunkUploaded != null) __obj.updateDynamic("ChunkUploaded")(js.Any.fromFunction3(ChunkUploaded))
    if (Destroy != null) __obj.updateDynamic("Destroy")(js.Any.fromFunction1(Destroy))
    if (Error != null) __obj.updateDynamic("Error")(js.Any.fromFunction2(Error))
    if (FileFiltered != null) __obj.updateDynamic("FileFiltered")(js.Any.fromFunction2(FileFiltered))
    if (FileUploaded != null) __obj.updateDynamic("FileUploaded")(js.Any.fromFunction3(FileUploaded))
    if (FilesAdded != null) __obj.updateDynamic("FilesAdded")(js.Any.fromFunction2(FilesAdded))
    if (FilesRemoved != null) __obj.updateDynamic("FilesRemoved")(js.Any.fromFunction2(FilesRemoved))
    if (Init != null) __obj.updateDynamic("Init")(js.Any.fromFunction1(Init))
    if (OptionChanged != null) __obj.updateDynamic("OptionChanged")(js.Any.fromFunction4(OptionChanged))
    if (PostInit != null) __obj.updateDynamic("PostInit")(js.Any.fromFunction1(PostInit))
    if (QueueChanged != null) __obj.updateDynamic("QueueChanged")(js.Any.fromFunction1(QueueChanged))
    if (Refresh != null) __obj.updateDynamic("Refresh")(js.Any.fromFunction1(Refresh))
    if (StateChanged != null) __obj.updateDynamic("StateChanged")(js.Any.fromFunction1(StateChanged))
    if (UploadComplete != null) __obj.updateDynamic("UploadComplete")(js.Any.fromFunction2(UploadComplete))
    if (UploadFile != null) __obj.updateDynamic("UploadFile")(js.Any.fromFunction2(UploadFile))
    if (UploadProgress != null) __obj.updateDynamic("UploadProgress")(js.Any.fromFunction2(UploadProgress))
    __obj.asInstanceOf[pluploadEvents]
  }
}

