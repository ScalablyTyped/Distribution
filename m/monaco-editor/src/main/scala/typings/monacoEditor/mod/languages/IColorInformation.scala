package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorInformation extends js.Object {
  /**
    * The color represented in this range.
    */
  var color: IColor
  /**
    * The range within the model.
    */
  var range: IRange
}

object IColorInformation {
  @scala.inline
  def apply(color: IColor, range: IRange): IColorInformation = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColorInformation]
  }
}

