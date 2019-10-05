package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.download method.
  */
trait IDownloadProperties extends js.Object {
  /**
    * The path to the file to download. For information on specifying paths
    * for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String
}

object IDownloadProperties {
  @scala.inline
  def apply(path: String): IDownloadProperties = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[IDownloadProperties]
  }
}

