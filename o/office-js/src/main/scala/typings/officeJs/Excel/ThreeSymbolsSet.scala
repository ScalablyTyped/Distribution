package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeSymbolsSet extends /* index */ NumberDictionary[Icon] {
  var greenCheckSymbol: Icon = js.native
  var redCrossSymbol: Icon = js.native
  var yellowExclamationSymbol: Icon = js.native
}

object ThreeSymbolsSet {
  @scala.inline
  def apply(greenCheckSymbol: Icon, redCrossSymbol: Icon, yellowExclamationSymbol: Icon): ThreeSymbolsSet = {
    val __obj = js.Dynamic.literal(greenCheckSymbol = greenCheckSymbol.asInstanceOf[js.Any], redCrossSymbol = redCrossSymbol.asInstanceOf[js.Any], yellowExclamationSymbol = yellowExclamationSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbolsSet]
  }
  @scala.inline
  implicit class ThreeSymbolsSetOps[Self <: ThreeSymbolsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGreenCheckSymbol(value: Icon): Self = this.set("greenCheckSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedCrossSymbol(value: Icon): Self = this.set("redCrossSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowExclamationSymbol(value: Icon): Self = this.set("yellowExclamationSymbol", value.asInstanceOf[js.Any])
  }
  
}

