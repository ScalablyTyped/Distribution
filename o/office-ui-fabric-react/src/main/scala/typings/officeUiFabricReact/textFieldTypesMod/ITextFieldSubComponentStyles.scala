package typings.officeUiFabricReact.textFieldTypesMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextFieldSubComponentStyles extends js.Object {
  /**
    * Styling for Label child component.
    */
  var label: IStyleFunctionOrObject[_, _] = js.native
}

object ITextFieldSubComponentStyles {
  @scala.inline
  def apply(label: IStyleFunctionOrObject[_, _]): ITextFieldSubComponentStyles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldSubComponentStyles]
  }
  @scala.inline
  implicit class ITextFieldSubComponentStylesOps[Self <: ITextFieldSubComponentStyles] (val x: Self) extends AnyVal {
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
    def setLabelFunction1(value: _ => DeepPartial[_]): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: IStyleFunctionOrObject[_, _]): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

