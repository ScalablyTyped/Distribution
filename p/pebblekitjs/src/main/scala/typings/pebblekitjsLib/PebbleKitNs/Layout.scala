package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var icon: java.lang.String
  var subtitleTemplateString: java.lang.String
}

object Layout {
  @scala.inline
  def apply(icon: java.lang.String, subtitleTemplateString: java.lang.String): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("subtitleTemplateString")(subtitleTemplateString)
    __obj.asInstanceOf[Layout]
  }
}

