package typings.platform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var os: js.UndefOr[Anon_Architecture] = js.undefined
  var prerelease: js.UndefOr[String] = js.undefined
  var product: js.UndefOr[String] = js.undefined
  var ua: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  def parse(ua: String): Platform
}

object Platform {
  @scala.inline
  def apply(
    parse: String => Platform,
    toString: () => String,
    description: String = null,
    layout: String = null,
    manufacturer: String = null,
    name: String = null,
    os: Anon_Architecture = null,
    prerelease: String = null,
    product: String = null,
    ua: String = null,
    version: String = null
  ): Platform = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), toString = js.Any.fromFunction0(toString))
    if (description != null) __obj.updateDynamic("description")(description)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (name != null) __obj.updateDynamic("name")(name)
    if (os != null) __obj.updateDynamic("os")(os)
    if (prerelease != null) __obj.updateDynamic("prerelease")(prerelease)
    if (product != null) __obj.updateDynamic("product")(product)
    if (ua != null) __obj.updateDynamic("ua")(ua)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Platform]
  }
}

