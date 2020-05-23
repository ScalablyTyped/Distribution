package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CreateGenericItem
import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.anon.IGenericItemkeyKey
import typings.officeUiFabricReact.anon.OnRenderItem
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typings.officeUiFabricReact.peoplePickerMod.IPeoplePickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers", JSImport.Namespace)
@js.native
object pickersMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typings.officeUiFabricReact.baseAutoFillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typings.officeUiFabricReact.autofillAutofillMod.Autofill
  
  @js.native
  class BasePeoplePicker ()
    extends typings.officeUiFabricReact.basePickerMod.BasePicker[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.basePickerMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] ()
    extends typings.officeUiFabricReact.basePickerMod.BasePickerListBelow[T, P]
  
  @js.native
  class CompactPeoplePickerBase ()
    extends typings.officeUiFabricReact.peoplePickerMod.CompactPeoplePickerBase
  
  @js.native
  class ListPeoplePickerBase ()
    extends typings.officeUiFabricReact.peoplePickerMod.ListPeoplePickerBase
  
  @js.native
  class MemberListPeoplePicker ()
    extends typings.officeUiFabricReact.basePickerMod.BasePickerListBelow[IPersonaProps, IPeoplePickerProps]
  
  @js.native
  class NormalPeoplePickerBase ()
    extends typings.officeUiFabricReact.peoplePickerMod.NormalPeoplePickerBase
  
  @js.native
  class Suggestions[T] protected ()
    extends typings.officeUiFabricReact.suggestionsMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @js.native
  class SuggestionsController[T] ()
    extends typings.officeUiFabricReact.suggestionsControllerMod.SuggestionsController[T]
  
  @js.native
  class SuggestionsItem[T] protected ()
    extends typings.officeUiFabricReact.suggestionsItemMod.SuggestionsItem[T] {
    def this(props: ISuggestionItemProps[T]) = this()
  }
  
  @js.native
  class TagPickerBase protected ()
    extends typings.officeUiFabricReact.tagPickerMod.TagPickerBase {
    def this(props: ITagPickerProps) = this()
  }
  
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
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = js.native
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: EnableAutofillOnKeyPress = js.native
  }
  
  /* static members */
  @js.native
  object CompactPeoplePickerBase extends js.Object {
    /** Default props for CompactPeoplePicker. */
    var defaultProps: CreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object ListPeoplePickerBase extends js.Object {
    /** Default props for ListPeoplePicker. */
    var defaultProps: CreateGenericItem = js.native
  }
  
  /* static members */
  @js.native
  object NormalPeoplePickerBase extends js.Object {
    /** Default props for NormalPeoplePicker. */
    var defaultProps: CreateGenericItem = js.native
  }
  
  @js.native
  object SuggestionActionType extends js.Object {
    /* 1 */ val forceResolve: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.forceResolve with Double = js.native
    /* 0 */ val none: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.none with Double = js.native
    /* 2 */ val searchMore: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.searchMore with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: OnRenderItem = js.native
  }
  
  @js.native
  object ValidationState extends js.Object {
    /* 2 */ val invalid: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid with Double = js.native
    /* 0 */ val valid: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.valid with Double = js.native
    /* 1 */ val warning: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.basePickerTypesMod.ValidationState with Double] = js.native
  }
  
}

