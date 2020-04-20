package typings.openlayers.mod.olx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the map logo.
  */
trait LogoOptions extends js.Object {
  var href: String
  var src: String
}

object LogoOptions {
  @scala.inline
  def apply(href: String, src: String): LogoOptions = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoOptions]
  }
}

