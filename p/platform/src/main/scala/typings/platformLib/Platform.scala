package typings
package platformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var os: js.UndefOr[Anon_Architecture] = js.undefined
  var prerelease: js.UndefOr[java.lang.String] = js.undefined
  var product: js.UndefOr[java.lang.String] = js.undefined
  var ua: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  def parse(ua: java.lang.String): Platform
}

object Platform {
  @scala.inline
  def apply(
    parse: java.lang.String => Platform,
    toString: () => java.lang.String,
    description: java.lang.String = null,
    layout: java.lang.String = null,
    manufacturer: java.lang.String = null,
    name: java.lang.String = null,
    os: Anon_Architecture = null,
    prerelease: java.lang.String = null,
    product: java.lang.String = null,
    ua: java.lang.String = null,
    version: java.lang.String = null
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

