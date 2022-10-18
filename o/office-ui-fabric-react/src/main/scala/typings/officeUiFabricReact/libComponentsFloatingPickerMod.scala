package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.IPeopleFloatingPickerProps
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsCoreProps
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStoreOptions
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPeoplePicker")
  @js.native
  open class BaseFloatingPeoplePicker protected ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "BaseFloatingPicker")
  @js.native
  open class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
  @js.native
  open class FloatingPeoplePicker protected ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod.FloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionItemType")
  @js.native
  object SuggestionItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType & Double
      ] = js.native
    
    /* 2 */ val footer: typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.footer & Double = js.native
    
    /* 0 */ val header: typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.header & Double = js.native
    
    /* 1 */ val suggestion: typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionItemType.suggestion & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsControl")
  @js.native
  open class SuggestionsControl[T] protected ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsCore")
  @js.native
  open class SuggestionsCore[T] protected ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsCoreMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsHeaderFooterItem")
  @js.native
  open class SuggestionsHeaderFooterItem protected ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsControlMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker", "SuggestionsStore")
  @js.native
  open class SuggestionsStore[T] ()
    extends typings.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  inline def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("createItem")(name.asInstanceOf[js.Any], isValid.asInstanceOf[js.Any])).asInstanceOf[ISuggestionModel[IPersonaProps]]
}
