package typings.officeUiFabricReact.textFieldTypesMod

import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldSubComponentStyles extends js.Object {
  /**
    * Styling for Label child component.
    */
  var label: IStyleFunctionOrObject[_, _]
}

object ITextFieldSubComponentStyles {
  @scala.inline
  def apply(label: IStyleFunctionOrObject[_, _]): ITextFieldSubComponentStyles = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldSubComponentStyles]
  }
}

