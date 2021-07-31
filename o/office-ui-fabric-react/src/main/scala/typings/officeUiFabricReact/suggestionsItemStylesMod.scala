package typings.officeUiFabricReact

import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItemStyleProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItemStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsItemStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SuggestionsItemGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.styles", "SuggestionsItemGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.styles", "SuggestionsItemGlobalClassNames.closeButton")
    @js.native
    def closeButton: String = js.native
    @scala.inline
    def closeButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.styles", "SuggestionsItemGlobalClassNames.isSuggested")
    @js.native
    def isSuggested: String = js.native
    @scala.inline
    def isSuggested_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSuggested")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.styles", "SuggestionsItemGlobalClassNames.itemButton")
    @js.native
    def itemButton: String = js.native
    @scala.inline
    def itemButton_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemButton")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.styles", "SuggestionsItemGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getStyles(props: ISuggestionsItemStyleProps): ISuggestionsItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISuggestionsItemStyles]
}
