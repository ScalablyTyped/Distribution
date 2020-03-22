package typings.openfin.downloadAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAssetRequest extends js.Object {
  var alias: String
}

object AppAssetRequest {
  @scala.inline
  def apply(alias: String): AppAssetRequest = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppAssetRequest]
  }
}

