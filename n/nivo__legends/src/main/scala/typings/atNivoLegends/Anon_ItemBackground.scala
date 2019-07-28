package typings.atNivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemBackground extends js.Object {
  var itemBackground: String
  var itemOpacity: Double
  var itemTextColor: String
  var symbolBorderColor: String
  var symbolBorderWidth: Double
  var symbolSize: Double
}

object Anon_ItemBackground {
  @scala.inline
  def apply(
    itemBackground: String,
    itemOpacity: Double,
    itemTextColor: String,
    symbolBorderColor: String,
    symbolBorderWidth: Double,
    symbolSize: Double
  ): Anon_ItemBackground = {
    val __obj = js.Dynamic.literal(itemBackground = itemBackground, itemOpacity = itemOpacity, itemTextColor = itemTextColor, symbolBorderColor = symbolBorderColor, symbolBorderWidth = symbolBorderWidth, symbolSize = symbolSize)
  
    __obj.asInstanceOf[Anon_ItemBackground]
  }
}

