package typings.atNivoWaffle.atNivoWaffleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaffleDatum extends js.Object {
  var id: String | Double
  var label: String | Double
  var value: Double
}

object WaffleDatum {
  @scala.inline
  def apply(id: String | Double, label: String | Double, value: Double): WaffleDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[WaffleDatum]
  }
}

