package typings.pebblekitjs.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var icon: String
  var subtitleTemplateString: String
}

object Layout {
  @scala.inline
  def apply(icon: String, subtitleTemplateString: String): Layout = {
    val __obj = js.Dynamic.literal(icon = icon, subtitleTemplateString = subtitleTemplateString)
  
    __obj.asInstanceOf[Layout]
  }
}

