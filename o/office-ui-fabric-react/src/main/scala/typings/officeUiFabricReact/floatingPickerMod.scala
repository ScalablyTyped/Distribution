package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.floatingPeoplePickerMod.IPeopleFloatingPickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStoreOptions
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPeoplePicker")
  @js.native
  class BaseFloatingPeoplePicker protected ()
    extends typings.officeUiFabricReact.floatingPeoplePickerMod.BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPicker")
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
  @js.native
  class FloatingPeoplePicker protected ()
    extends typings.officeUiFabricReact.floatingPeoplePickerMod.FloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionItemType")
  @js.native
  object SuggestionItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType & Double] = js.native
    
    /* 2 */ val footer: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer & Double = js.native
    
    /* 0 */ val header: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header & Double = js.native
    
    /* 1 */ val suggestion: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsControl")
  @js.native
  class SuggestionsControl[T] protected ()
    extends typings.officeUiFabricReact.suggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsCore")
  @js.native
  class SuggestionsCore[T] protected ()
    extends typings.officeUiFabricReact.suggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsHeaderFooterItem")
  @js.native
  class SuggestionsHeaderFooterItem protected ()
    extends typings.officeUiFabricReact.suggestionsControlMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsStore")
  @js.native
  class SuggestionsStore[T] ()
    extends typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  @scala.inline
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("createItem")(name.asInstanceOf[js.Any], isValid.asInstanceOf[js.Any])).asInstanceOf[ISuggestionModel[IPersonaProps]]
}
