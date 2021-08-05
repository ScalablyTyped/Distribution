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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickersMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "Autofill")
  @js.native
  class Autofill protected ()
    extends typings.officeUiFabricReact.baseAutoFillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "BaseAutoFill")
  @js.native
  class BaseAutoFill protected ()
    extends typings.officeUiFabricReact.baseAutoFillMod.BaseAutoFill {
    def this(props: IAutofillProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "BasePeoplePicker")
  @js.native
  class BasePeoplePicker protected ()
    extends typings.officeUiFabricReact.peoplePickerMod.BasePeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "BasePicker")
  @js.native
  class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.basePickerMod.BasePicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  /* static members */
  object BasePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "BasePicker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(newProps: IBasePickerProps[js.Any]): Items | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any]).asInstanceOf[Items | Null]
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "BasePickerListBelow")
  @js.native
  class BasePickerListBelow[T, P /* <: IBasePickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.basePickerMod.BasePickerListBelow[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "CompactPeoplePicker")
  @js.native
  val CompactPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "CompactPeoplePickerBase")
  @js.native
  class CompactPeoplePickerBase protected ()
    extends typings.officeUiFabricReact.peoplePickerMod.CompactPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object CompactPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "CompactPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for CompactPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers", "CompactPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "ListPeoplePicker")
  @js.native
  val ListPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "ListPeoplePickerBase")
  @js.native
  class ListPeoplePickerBase protected ()
    extends typings.officeUiFabricReact.peoplePickerMod.ListPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object ListPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "ListPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for ListPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers", "ListPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "MemberListPeoplePicker")
  @js.native
  class MemberListPeoplePicker protected ()
    extends typings.officeUiFabricReact.peoplePickerMod.MemberListPeoplePicker {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "NormalPeoplePicker")
  @js.native
  val NormalPeoplePicker: FunctionComponent[IPeoplePickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "NormalPeoplePickerBase")
  @js.native
  class NormalPeoplePickerBase protected ()
    extends typings.officeUiFabricReact.peoplePickerMod.NormalPeoplePickerBase {
    def this(basePickerProps: IPeoplePickerProps) = this()
  }
  /* static members */
  object NormalPeoplePickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "NormalPeoplePickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default props for NormalPeoplePicker. */
    @JSImport("office-ui-fabric-react/lib/components/pickers", "NormalPeoplePickerBase.defaultProps")
    @js.native
    def defaultProps: CreateGenericItem = js.native
    inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "PeoplePickerItem")
  @js.native
  val PeoplePickerItem: FunctionComponent[IPeoplePickerItemSelectedProps] = js.native
  
  inline def PeoplePickerItemBase(props: IPeoplePickerItemSelectedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PeoplePickerItemBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "PeoplePickerItemSuggestion")
  @js.native
  val PeoplePickerItemSuggestion: FunctionComponent[IPeoplePickerItemSuggestionProps] = js.native
  
  inline def PeoplePickerItemSuggestionBase(props: IPeoplePickerItemSuggestionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PeoplePickerItemSuggestionBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "SuggestionActionType")
  @js.native
  object SuggestionActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType & Double] = js.native
    
    /* 1 */ val forceResolve: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.forceResolve & Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.none & Double = js.native
    
    /* 2 */ val searchMore: typings.officeUiFabricReact.suggestionsTypesMod.SuggestionActionType.searchMore & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "Suggestions")
  @js.native
  class Suggestions[T] protected ()
    extends typings.officeUiFabricReact.suggestionsMod.Suggestions[T] {
    def this(suggestionsProps: ISuggestionsProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "SuggestionsController")
  @js.native
  class SuggestionsController[T] ()
    extends typings.officeUiFabricReact.suggestionsControllerMod.SuggestionsController[T]
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "SuggestionsItem")
  @js.native
  class SuggestionsItem[T] protected ()
    extends typings.officeUiFabricReact.suggestionsItemMod.SuggestionsItem[T] {
    def this(props: ISuggestionItemProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "TagItem")
  @js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  
  inline def TagItemBase(props: ITagItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TagItemBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "TagItemSuggestion")
  @js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  
  inline def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TagItemSuggestionBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "TagPicker")
  @js.native
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "TagPickerBase")
  @js.native
  class TagPickerBase protected ()
    extends typings.officeUiFabricReact.tagPickerMod.TagPickerBase {
    def this(props: ITagPickerProps) = this()
  }
  /* static members */
  object TagPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "TagPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/pickers", "TagPickerBase.defaultProps")
    @js.native
    def defaultProps: OnRenderItem = js.native
    inline def defaultProps_=(x: OnRenderItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers", "ValidationState")
  @js.native
  object ValidationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.basePickerTypesMod.ValidationState & Double] = js.native
    
    /* 2 */ val invalid: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.invalid & Double = js.native
    
    /* 0 */ val valid: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.valid & Double = js.native
    
    /* 1 */ val warning: typings.officeUiFabricReact.basePickerTypesMod.ValidationState.warning & Double = js.native
  }
  
  inline def createGenericItem(name: String, currentValidationState: ValidationState): IGenericItemkeyKey = (^.asInstanceOf[js.Dynamic].applyDynamic("createGenericItem")(name.asInstanceOf[js.Any], currentValidationState.asInstanceOf[js.Any])).asInstanceOf[IGenericItemkeyKey]
}
