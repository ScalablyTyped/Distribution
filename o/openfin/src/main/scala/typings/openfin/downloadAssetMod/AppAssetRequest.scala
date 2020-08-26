package typings.openfin.downloadAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppAssetRequest extends js.Object {
  var alias: String = js.native
}

object AppAssetRequest {
  @scala.inline
  def apply(alias: String): AppAssetRequest = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAssetRequest]
  }
  @scala.inline
  implicit class AppAssetRequestOps[Self <: AppAssetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
  }
  
}

