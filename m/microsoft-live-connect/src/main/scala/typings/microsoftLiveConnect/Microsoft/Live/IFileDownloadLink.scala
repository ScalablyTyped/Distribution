package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns when you perform a GET request to /FILE_ID/content.
  */
trait IFileDownloadLink extends js.Object {
  /**
    * A URL download link for the file.
    */
  var location: String
}

object IFileDownloadLink {
  @scala.inline
  def apply(location: String): IFileDownloadLink = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileDownloadLink]
  }
}

