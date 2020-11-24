package typings.officeUiFabricReact.suggestionsTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'className' | 'suggestionsClassName'> & {  forceResolveButtonSelected :boolean | undefined,   searchForMoreButtonSelected :boolean | undefined} */
@js.native
trait ISuggestionsStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /** Whether the forceResolve actionButton is selected. */
  var forceResolveButtonSelected: js.UndefOr[Boolean] = js.native
  
  /** Whether the searchForMore actionButton is selected. */
  var searchForMoreButtonSelected: js.UndefOr[Boolean] = js.native
  
  var suggestionsClassName: js.UndefOr[String] = js.native
  
  var theme: ITheme = js.native
}
object ISuggestionsStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): ISuggestionsStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsStyleProps]
  }
  
  @scala.inline
  implicit class ISuggestionsStylePropsOps[Self <: ISuggestionsStyleProps] (val x: Self) extends AnyVal {
    
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
    def setForceResolveButtonSelected(value: Boolean): Self = this.set("forceResolveButtonSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceResolveButtonSelected: Self = this.set("forceResolveButtonSelected", js.undefined)
    
    @scala.inline
    def setSearchForMoreButtonSelected(value: Boolean): Self = this.set("searchForMoreButtonSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchForMoreButtonSelected: Self = this.set("searchForMoreButtonSelected", js.undefined)
    
    @scala.inline
    def setSuggestionsClassName(value: String): Self = this.set("suggestionsClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsClassName: Self = this.set("suggestionsClassName", js.undefined)
  }
}
