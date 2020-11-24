package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.floatingPeoplePickerMod.IPeopleFloatingPickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStoreOptions
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker", JSImport.Namespace)
@js.native
object floatingPickerMod extends js.Object {
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  
  @js.native
  class BaseFloatingPeoplePicker ()
    extends typings.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class FloatingPeoplePicker ()
    extends typings.officeUiFabricReact.floatingPeoplePickerMod.FloatingPeoplePicker
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  object SuggestionItemType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType with Double] = js.native
    
    /* 2 */ val footer: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer with Double = js.native
    
    /* 0 */ val header: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header with Double = js.native
    
    /* 1 */ val suggestion: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
  }
  
  @js.native
  class SuggestionsControl[T] protected ()
    extends typings.officeUiFabricReact.suggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @js.native
  class SuggestionsCore[T] protected ()
    extends typings.officeUiFabricReact.suggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @js.native
  class SuggestionsHeaderFooterItem protected ()
    extends typings.officeUiFabricReact.suggestionsControlMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @js.native
  class SuggestionsStore[T] ()
    extends typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
}
