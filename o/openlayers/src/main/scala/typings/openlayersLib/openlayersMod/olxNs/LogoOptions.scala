package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the map logo.
  */
trait LogoOptions extends js.Object {
  var href: java.lang.String
  var src: java.lang.String
}

object LogoOptions {
  @scala.inline
  def apply(href: java.lang.String, src: java.lang.String): LogoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[LogoOptions]
  }
}

