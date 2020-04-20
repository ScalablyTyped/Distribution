package typings.officeUiFabricReact.textFieldErrorMessageExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFieldErrorMessageExampleState extends js.Object {
  /**
    * Screen readers will read all errors on a page as soon as they are present,
    * making this demo potentially unpleasant when using a screen reader.
    * Not rendering the controls by default makes for a more pleasant experience.
    */
  var showFields: Boolean
}

object ITextFieldErrorMessageExampleState {
  @scala.inline
  def apply(showFields: Boolean): ITextFieldErrorMessageExampleState = {
    val __obj = js.Dynamic.literal(showFields = showFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldErrorMessageExampleState]
  }
}

