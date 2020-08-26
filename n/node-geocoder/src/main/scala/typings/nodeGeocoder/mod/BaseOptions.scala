package typings.nodeGeocoder.mod

import typings.nodeGeocoder.nodeGeocoderStrings.http
import typings.nodeGeocoder.nodeGeocoderStrings.https
import typings.nodeGeocoder.nodeGeocoderStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions extends js.Object {
  var formatter: js.UndefOr[js.Any] = js.native
  var formatterPattern: js.UndefOr[String] = js.native
  var httpAdapter: js.UndefOr[https | http | request] = js.native
  var provider: String = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(provider: String): BaseOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatter(value: js.Any): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setFormatterPattern(value: String): Self = this.set("formatterPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatterPattern: Self = this.set("formatterPattern", js.undefined)
    @scala.inline
    def setHttpAdapter(value: https | http | request): Self = this.set("httpAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpAdapter: Self = this.set("httpAdapter", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

