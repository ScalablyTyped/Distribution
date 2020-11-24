package typings.officeUiFabricReact.suggestionsItemTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'className'> & {  suggested :boolean | undefined} */
@js.native
trait ISuggestionsItemStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /** Whether the suggestion item is selected or not. */
  var suggested: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
}
object ISuggestionsItemStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): ISuggestionsItemStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsItemStyleProps]
  }
  
  @scala.inline
  implicit class ISuggestionsItemStylePropsOps[Self <: ISuggestionsItemStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setSuggested(value: Boolean): Self = this.set("suggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggested: Self = this.set("suggested", js.undefined)
  }
}
