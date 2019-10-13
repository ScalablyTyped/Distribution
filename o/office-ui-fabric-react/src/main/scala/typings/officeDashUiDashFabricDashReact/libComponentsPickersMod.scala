package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod.IAutofillProps
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSelectedProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSuggestionProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagItemSuggestionProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod.ITagPickerProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers", JSImport.Namespace)
@js.native
object libComponentsPickersMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersAutoFillBaseAutoFillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillMod.Autofill
  
  @js.native
  class BasePeoplePicker ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePicker[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePickerListBelow[T, P]
  
  @js.native
  class CompactPeoplePickerBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.CompactPeoplePickerBase
  
  @js.native
  class ListPeoplePickerBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.ListPeoplePickerBase
  
  @js.native
  class MemberListPeoplePicker ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerMod.BasePickerListBelow[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class NormalPeoplePickerBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.NormalPeoplePickerBase
  
  @js.native
  class Suggestions[T] protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @js.native
  class SuggestionsController[T] ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsControllerMod.SuggestionsController[T]
  
  @js.native
  class SuggestionsItem[T] ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemMod.SuggestionsItem[T]
  
  @js.native
  class TagPickerBase ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerMod.TagPickerBase
  
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  val PeoplePickerItem: FunctionComponent[IPeoplePickerItemSelectedProps] = js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = js.native
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = js.native
  def TagItemBase(props: ITagItemProps): Element = js.native
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = js.native
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItem with Anon_Key = js.native
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: Anon_EnableAutofillOnKeyPress = js.native
  }
  
  /* static members */
  @js.native
  object CompactPeoplePickerBase extends js.Object {
    /** Default props for CompactPeoplePicker. */
    var defaultProps: Anon_CreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object ListPeoplePickerBase extends js.Object {
    /** Default props for ListPeoplePicker. */
    var defaultProps: Anon_CreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object NormalPeoplePickerBase extends js.Object {
    /** Default props for NormalPeoplePicker. */
    var defaultProps: Anon_CreateGenericItem = js.native
  }
  
  @js.native
  object SuggestionActionType extends js.Object {
    /* 1 */ val forceResolve: typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.forceResolve with Double = js.native
    /* 0 */ val none: typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.none with Double = js.native
    /* 2 */ val searchMore: typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType.searchMore with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.SuggestionActionType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: Anon_OnRenderItem = js.native
  }
  
  @js.native
  object ValidationState extends js.Object {
    /* 2 */ val invalid: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.invalid with Double = js.native
    /* 0 */ val valid: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.valid with Double = js.native
    /* 1 */ val warning: typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState with Double
      ] = js.native
  }
  
}

