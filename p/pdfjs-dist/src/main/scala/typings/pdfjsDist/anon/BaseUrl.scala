package typings.pdfjsDist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUrl extends js.Object {
  var baseUrl: String = js.native
  var isCompressed: Boolean = js.native
}

object BaseUrl {
  @scala.inline
  def apply(baseUrl: String, isCompressed: Boolean): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  @scala.inline
  implicit class BaseUrlOps[Self <: BaseUrl] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompressed(value: Boolean): Self = this.set("isCompressed", value.asInstanceOf[js.Any])
  }
  
}

