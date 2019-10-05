package typings.microsoftDashLiveDashConnect.Microsoft.Live

import typings.microsoftDashLiveDashConnect.Anon_Files
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
  var data: Anon_Files
}

object IFilePickerResult {
  @scala.inline
  def apply(data: Anon_Files): IFilePickerResult = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[IFilePickerResult]
  }
}

