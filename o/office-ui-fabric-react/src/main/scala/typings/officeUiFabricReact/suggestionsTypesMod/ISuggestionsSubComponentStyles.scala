package typings.officeUiFabricReact.suggestionsTypesMod

import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerStyleProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestionsSubComponentStyles extends js.Object {
  
  /** Refers to the Spinner rendered within the Suggestions when searching or loading suggestions. */
  var spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _] = js.native
}
object ISuggestionsSubComponentStyles {
  
  @scala.inline
  def apply(spinner: IStyleFunctionOrObject[ISpinnerStyleProps, _]): ISuggestionsSubComponentStyles = {
    val __obj = js.Dynamic.literal(spinner = spinner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsSubComponentStyles]
  }
  
  @scala.inline
  implicit class ISuggestionsSubComponentStylesOps[Self <: ISuggestionsSubComponentStyles] (val x: Self) extends AnyVal {
    
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
    def setSpinnerFunction1(value: ISpinnerStyleProps => DeepPartial[_]): Self = this.set("spinner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpinner(value: IStyleFunctionOrObject[ISpinnerStyleProps, _]): Self = this.set("spinner", value.asInstanceOf[js.Any])
  }
}
