package typings.officeDashJsDashPreview.ExcelNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeSymbolsSet extends /* index */ NumberDictionary[Icon] {
  var greenCheckSymbol: Icon
  var redCrossSymbol: Icon
  var yellowExclamationSymbol: Icon
}

object ThreeSymbolsSet {
  @scala.inline
  def apply(
    greenCheckSymbol: Icon,
    redCrossSymbol: Icon,
    yellowExclamationSymbol: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeSymbolsSet = {
    val __obj = js.Dynamic.literal(greenCheckSymbol = greenCheckSymbol, redCrossSymbol = redCrossSymbol, yellowExclamationSymbol = yellowExclamationSymbol)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeSymbolsSet]
  }
}

