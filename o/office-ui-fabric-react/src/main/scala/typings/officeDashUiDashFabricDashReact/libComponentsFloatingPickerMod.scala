package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod.IBaseFloatingPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.IPeopleFloatingPickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsControlProps
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod.ISuggestionsCoreProps
import typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStoreOptions
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker", JSImport.Namespace)
@js.native
object libComponentsFloatingPickerMod extends js.Object {
  @js.native
  class BaseFloatingPeoplePicker ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class FloatingPeoplePicker ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.FloatingPeoplePicker
  
  @js.native
  class SuggestionsControl[T] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @js.native
  class SuggestionsCore[T] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @js.native
  class SuggestionsHeaderFooterItem ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsHeaderFooterItem
  
  @js.native
  class SuggestionsStore[T] ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
  @js.native
  object SuggestionItemType extends js.Object {
    /* 2 */ val footer: typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.footer with Double = js.native
    /* 0 */ val header: typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.header with Double = js.native
    /* 1 */ val suggestion: typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType with Double
      ] = js.native
  }
  
}

