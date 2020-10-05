package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectOptionsStylized
  extends typings.node.NodeJS.InspectOptions {
  def stylize(text: String, styleType: Style): String = js.native
}

object InspectOptionsStylized {
  @scala.inline
  def apply(stylize: (String, Style) => String): InspectOptionsStylized = {
    val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
    __obj.asInstanceOf[InspectOptionsStylized]
  }
  @scala.inline
  implicit class InspectOptionsStylizedOps[Self <: InspectOptionsStylized] (val x: Self) extends AnyVal {
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
    def setStylize(value: (String, Style) => String): Self = this.set("stylize", js.Any.fromFunction2(value))
  }
  
}

