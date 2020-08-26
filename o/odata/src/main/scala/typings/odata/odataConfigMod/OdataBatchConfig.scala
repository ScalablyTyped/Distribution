package typings.odata.odataConfigMod

import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OdataBatchConfig extends js.Object {
  var boundaryPrefix: js.UndefOr[String] = js.native
  var changsetBoundaryPrefix: js.UndefOr[String] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var useChangset: Boolean = js.native
}

object OdataBatchConfig {
  @scala.inline
  def apply(useChangset: Boolean): OdataBatchConfig = {
    val __obj = js.Dynamic.literal(useChangset = useChangset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OdataBatchConfig]
  }
  @scala.inline
  implicit class OdataBatchConfigOps[Self <: OdataBatchConfig] (val x: Self) extends AnyVal {
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
    def setUseChangset(value: Boolean): Self = this.set("useChangset", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundaryPrefix(value: String): Self = this.set("boundaryPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryPrefix: Self = this.set("boundaryPrefix", js.undefined)
    @scala.inline
    def setChangsetBoundaryPrefix(value: String): Self = this.set("changsetBoundaryPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangsetBoundaryPrefix: Self = this.set("changsetBoundaryPrefix", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

