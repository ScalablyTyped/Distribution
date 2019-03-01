package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeSymbolsSet
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] {
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
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Icon] = null
  ): ThreeSymbolsSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("greenCheckSymbol")(greenCheckSymbol)
    __obj.updateDynamic("redCrossSymbol")(redCrossSymbol)
    __obj.updateDynamic("yellowExclamationSymbol")(yellowExclamationSymbol)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeSymbolsSet]
  }
}

