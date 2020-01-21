package typings.oJs.odataConfigMod

import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OdataBatchConfig extends js.Object {
  var boundaryPrefix: js.UndefOr[String] = js.undefined
  var changsetBoundaryPrefix: js.UndefOr[String] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var useChangset: Boolean
}

object OdataBatchConfig {
  @scala.inline
  def apply(
    useChangset: Boolean,
    boundaryPrefix: String = null,
    changsetBoundaryPrefix: String = null,
    endpoint: String = null,
    headers: Headers = null
  ): OdataBatchConfig = {
    val __obj = js.Dynamic.literal(useChangset = useChangset.asInstanceOf[js.Any])
    if (boundaryPrefix != null) __obj.updateDynamic("boundaryPrefix")(boundaryPrefix.asInstanceOf[js.Any])
    if (changsetBoundaryPrefix != null) __obj.updateDynamic("changsetBoundaryPrefix")(changsetBoundaryPrefix.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OdataBatchConfig]
  }
}

