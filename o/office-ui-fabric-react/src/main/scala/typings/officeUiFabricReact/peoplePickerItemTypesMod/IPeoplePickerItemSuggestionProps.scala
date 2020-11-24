package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPeoplePickerItemSuggestionProps extends IPeoplePickerItemSharedProps {
  
  /**
    * Flag that controls whether each suggested PeoplePicker item (Persona) is rendered with or without secondary text
    * for compact look.
    * @defaultvalue false
    */
  var compact: js.UndefOr[Boolean] = js.native
  
  /** Persona props for each suggested for picking PeoplePicker item. */
  var personaProps: js.UndefOr[IPersonaProps] = js.native
  
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
  ] = js.native
  
  /** General common props for all PeoplePicker items suggestions. */
  var suggestionsProps: js.UndefOr[IBasePickerSuggestionsProps[_]] = js.native
}
object IPeoplePickerItemSuggestionProps {
  
  @scala.inline
  def apply(): IPeoplePickerItemSuggestionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeoplePickerItemSuggestionProps]
  }
  
  @scala.inline
  implicit class IPeoplePickerItemSuggestionPropsOps[Self <: IPeoplePickerItemSuggestionProps] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setPersonaProps(value: IPersonaProps): Self = this.set("personaProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonaProps: Self = this.set("personaProps", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IPeoplePickerItemSuggestionStyleProps => DeepPartial[IPeoplePickerItemSuggestionStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(
      value: IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
    ): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSuggestionsProps(value: IBasePickerSuggestionsProps[_]): Self = this.set("suggestionsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsProps: Self = this.set("suggestionsProps", js.undefined)
  }
}
