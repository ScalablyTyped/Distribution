package typings
package atNivoLegendsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemBackground extends js.Object {
  var itemBackground: java.lang.String
  var itemOpacity: scala.Double
  var itemTextColor: java.lang.String
  var symbolBorderColor: java.lang.String
  var symbolBorderWidth: scala.Double
  var symbolSize: scala.Double
}

object Anon_ItemBackground {
  @scala.inline
  def apply(
    itemBackground: java.lang.String,
    itemOpacity: scala.Double,
    itemTextColor: java.lang.String,
    symbolBorderColor: java.lang.String,
    symbolBorderWidth: scala.Double,
    symbolSize: scala.Double
  ): Anon_ItemBackground = {
    val __obj = js.Dynamic.literal(itemBackground = itemBackground, itemOpacity = itemOpacity, itemTextColor = itemTextColor, symbolBorderColor = symbolBorderColor, symbolBorderWidth = symbolBorderWidth, symbolSize = symbolSize)
  
    __obj.asInstanceOf[Anon_ItemBackground]
  }
}

