package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var location: java.lang.String
}

object IFileDownloadLink {
  @scala.inline
  def apply(location: java.lang.String): IFileDownloadLink = {
    val __obj = js.Dynamic.literal(location = location)
  
    __obj.asInstanceOf[IFileDownloadLink]
  }
}

