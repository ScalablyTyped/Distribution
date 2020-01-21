package typings.platform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform_ extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var os: js.UndefOr[AnonArchitecture] = js.undefined
  var prerelease: js.UndefOr[String] = js.undefined
  var product: js.UndefOr[String] = js.undefined
  var ua: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  def parse(ua: String): Platform_
}

object Platform_ {
  @scala.inline
  def apply(
    parse: String => Platform_,
    description: String = null,
    layout: String = null,
    manufacturer: String = null,
    name: String = null,
    os: AnonArchitecture = null,
    prerelease: String = null,
    product: String = null,
    ua: String = null,
    version: String = null
  ): Platform_ = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (prerelease != null) __obj.updateDynamic("prerelease")(prerelease.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (ua != null) __obj.updateDynamic("ua")(ua.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform_]
  }
}

