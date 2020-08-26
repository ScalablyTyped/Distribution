package typings.ol.literalStyleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralStyle extends js.Object {
  var filter: js.UndefOr[ExpressionValue] = js.native
  var symbol: js.UndefOr[LiteralSymbolStyle] = js.native
  var variables: js.UndefOr[StringDictionary[Double]] = js.native
}

object LiteralStyle {
  @scala.inline
  def apply(): LiteralStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiteralStyle]
  }
  @scala.inline
  implicit class LiteralStyleOps[Self <: LiteralStyle] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: (js.Any | Double)*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: ExpressionValue): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setSymbol(value: LiteralSymbolStyle): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setVariables(value: StringDictionary[Double]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

