package typings.microsoftDashLiveDashConnect.MicrosoftNs.LiveNs

import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.backgroundDownload method.
  */
trait IBackgroundDownloadProperties extends js.Object {
  /**
    * The file output object to which the downloaded file data is written.
    */
  var file_output: js.UndefOr[StorageFile] = js.undefined
  /**
    * The path to the file to download. For information on specifying paths
    * for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String
}

object IBackgroundDownloadProperties {
  @scala.inline
  def apply(path: String, file_output: StorageFile = null): IBackgroundDownloadProperties = {
    val __obj = js.Dynamic.literal(path = path)
    if (file_output != null) __obj.updateDynamic("file_output")(file_output)
    __obj.asInstanceOf[IBackgroundDownloadProperties]
  }
}

