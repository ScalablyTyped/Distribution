package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorInformation extends js.Object {
  /**
    * The color represented in this range.
    */
  var color: IColor = js.native
  /**
    * The range within the model.
    */
  var range: IRange = js.native
}

object IColorInformation {
  @scala.inline
  def apply(color: IColor, range: IRange): IColorInformation = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorInformation]
  }
  @scala.inline
  implicit class IColorInformationOps[Self <: IColorInformation] (val x: Self) extends AnyVal {
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
    def setColor(value: IColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

