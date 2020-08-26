package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selector_ extends Container[String] {
  @JSName("type")
  var type_Selector_ : typings.postcssSelectorParser.postcssSelectorParserStrings.selector = js.native
}

object Selector_ {
  @scala.inline
  implicit class Selector_Ops[Self <: Selector_] (val x: Self) extends AnyVal {
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
    def setType(value: typings.postcssSelectorParser.postcssSelectorParserStrings.selector): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

