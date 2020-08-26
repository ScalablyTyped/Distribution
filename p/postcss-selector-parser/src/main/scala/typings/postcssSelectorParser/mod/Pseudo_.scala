package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pseudo_ extends Container[String] {
  @JSName("type")
  var type_Pseudo_ : typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo = js.native
}

object Pseudo_ {
  @scala.inline
  implicit class Pseudo_Ops[Self <: Pseudo_] (val x: Self) extends AnyVal {
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
    def setType(value: typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

