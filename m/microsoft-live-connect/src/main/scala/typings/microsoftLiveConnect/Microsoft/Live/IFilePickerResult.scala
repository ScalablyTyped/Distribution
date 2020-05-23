package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned from a successful file picker operation.
  */
trait IFilePickerResult extends js.Object {
  /**
    * Contains data concerning the user's picked files.
    */
  var data: Files
}

object IFilePickerResult {
  @scala.inline
  def apply(data: Files): IFilePickerResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilePickerResult]
  }
}

