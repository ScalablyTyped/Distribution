package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.agol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgolOptions extends js.Object {
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var provider: agol
}

object AgolOptions {
  @scala.inline
  def apply(provider: agol, client_id: String = null, client_secret: String = null): AgolOptions = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    __obj.asInstanceOf[AgolOptions]
  }
}

