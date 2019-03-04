package typings
package mendixmodelsdkLib.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestFileDownloadOptions extends js.Object {
  var method: RequestMethod
  var url: java.lang.String
}

object IRequestFileDownloadOptions {
  @scala.inline
  def apply(method: RequestMethod, url: java.lang.String): IRequestFileDownloadOptions = {
    val __obj = js.Dynamic.literal(method = method, url = url)
  
    __obj.asInstanceOf[IRequestFileDownloadOptions]
  }
}

