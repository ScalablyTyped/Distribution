package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CreateGenericItem
import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.anon.IGenericItemkeyKey
import typings.officeUiFabricReact.anon.Items
import typings.officeUiFabricReact.anon.OnRenderItem
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typings.officeUiFabricReact.basePickerTypesMod.ValidationState
import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSuggestionProps
import typings.officeUiFabricReact.peoplePickerMod.IPeoplePickerProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickersMod {
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "Autofill")
  @js.native
  class Autofill protected ()
    extends typings.officeUiFabricReact.pickersMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    @scala.inline
    def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BaseAutoFill")
  @js.native
  class BaseAutoFill protected ()
    extends typings.officeUiFabricReact.pickersMod.BaseAutoFill {
    def this(props: IAutofillProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BasePeoplePicker")
  @js.native
  class BasePeoplePicker protected ()
    extends typings.officeUiFabricReact.pickersMod.BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker")
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.pickersMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  /* static members */
  object BasePicker {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "BasePicker.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(newProps: IBasePickerProps[_]): Items | Null = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "BasePickerListBelow")
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.pickersMod.BasePickerListBelow[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePicker")
  @js.native
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePickerBase")
  @js.native
  class CompactPeoplePickerBase protected ()
    extends typings.officeUiFabricReact.pickersMod.CompactPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object CompactPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for CompactPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/Pickers", "CompactPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    @scala.inline
    def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePicker")
  @js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePickerBase")
  @js.native
  class ListPeoplePickerBase protected ()
    extends typings.officeUiFabricReact.pickersMod.ListPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object ListPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for ListPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/Pickers", "ListPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    @scala.inline
    def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "MemberListPeoplePicker")
  @js.native
  class MemberListPeoplePicker protected ()
    extends typings.officeUiFabricReact.pickersMod.MemberListPeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePicker")
  @js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePickerBase")
  @js.native
  class NormalPeoplePickerBase protected ()
    extends typings.officeUiFabricReact.pickersMod.NormalPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object NormalPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for NormalPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/Pickers", "NormalPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    @scala.inline
    def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "PeoplePickerItem")
  @js.native
  val PeoplePickerItem: FunctionComponent[IPeoplePickerItemSelectedProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "PeoplePickerItemBase")
  @js.native
  def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "PeoplePickerItemSuggestion")
  @js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "PeoplePickerItemSuggestionBase")
  @js.native
  def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionActionType")
  @js.native
  object SuggestionActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType with Double] = js.native
    
    /* 1 */ val forceResolve: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.forceResolve with Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.none with Double = js.native
    
    /* 2 */ val searchMore: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.searchMore with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "Suggestions")
  @js.native
  class Suggestions[T] protected ()
    extends typings.officeUiFabricReact.pickersMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionsController")
  @js.native
  class SuggestionsController[T] ()
    extends typings.officeUiFabricReact.pickersMod.SuggestionsController[T]
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "SuggestionsItem")
  @js.native
  class SuggestionsItem[T] protected ()
    extends typings.officeUiFabricReact.pickersMod.SuggestionsItem[T] {
    def this(props: ISuggestionItemProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagItem")
  @js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagItemBase")
  @js.native
  def TagItemBase(props: ITagItemProps): Element = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagItemSuggestion")
  @js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagItemSuggestionBase")
  @js.native
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagPicker")
  @js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "TagPickerBase")
  @js.native
  class TagPickerBase protected ()
    extends typings.officeUiFabricReact.pickersMod.TagPickerBase {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  object TagPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "TagPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Pickers", "TagPickerBase.defaultProps")
    @js.native
    def defaultProps: OnRenderItem = js.native
    @scala.inline
    def defaultProps_=(x: OnRenderItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "ValidationState")
  @js.native
  object ValidationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.basePickerTypesMod.ValidationState with Double] = js.native
    
    /* 2 */ val invalid: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid with Double = js.native
    
    /* 0 */ val valid: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.valid with Double = js.native
    
    /* 1 */ val warning: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.warning with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Pickers", "createGenericItem")
  @js.native
  def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = js.native
}
