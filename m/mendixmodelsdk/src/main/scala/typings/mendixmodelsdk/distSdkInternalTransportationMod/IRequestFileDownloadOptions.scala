package typings.mendixmodelsdk.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestFileDownloadOptions extends js.Object {
  var method: RequestMethod
  var url: String
}

object IRequestFileDownloadOptions {
  @scala.inline
  def apply(method: RequestMethod, url: String): IRequestFileDownloadOptions = {
    val __obj = js.Dynamic.literal(method = method, url = url)
  
    __obj.asInstanceOf[IRequestFileDownloadOptions]
  }
}

