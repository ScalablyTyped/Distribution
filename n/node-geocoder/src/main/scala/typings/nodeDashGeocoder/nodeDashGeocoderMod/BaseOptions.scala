package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.http
import typings.nodeDashGeocoder.nodeDashGeocoderStrings.https
import typings.nodeDashGeocoder.nodeDashGeocoderStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var formatter: js.UndefOr[js.Any] = js.undefined
  var formatterPattern: js.UndefOr[String] = js.undefined
  var httpAdapter: js.UndefOr[https | http | request] = js.undefined
  var provider: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    provider: String,
    formatter: js.Any = null,
    formatterPattern: String = null,
    httpAdapter: https | http | request = null,
    timeout: Int | Double = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (formatterPattern != null) __obj.updateDynamic("formatterPattern")(formatterPattern)
    if (httpAdapter != null) __obj.updateDynamic("httpAdapter")(httpAdapter.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

