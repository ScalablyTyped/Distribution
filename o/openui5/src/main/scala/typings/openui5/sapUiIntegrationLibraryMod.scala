package typings.openui5

import typings.openui5.sapMLibraryMod.ButtonType
import typings.openui5.sapUiCoreLibraryMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationLibraryMod {
  
  @js.native
  sealed trait AttributesLayoutType extends StObject
  @JSImport("sap/ui/integration/library", "AttributesLayoutType")
  @js.native
  object AttributesLayoutType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AttributesLayoutType & String] = js.native
    
    /**
      * One column.
      */
    @js.native
    sealed trait OneColumn
      extends StObject
         with AttributesLayoutType
    /* "OneColumn" */ val OneColumn: typings.openui5.sapUiIntegrationLibraryMod.AttributesLayoutType.OneColumn & String = js.native
    
    /**
      * Two columns.
      */
    @js.native
    sealed trait TwoColumns
      extends StObject
         with AttributesLayoutType
    /* "TwoColumns" */ val TwoColumns: typings.openui5.sapUiIntegrationLibraryMod.AttributesLayoutType.TwoColumns & String = js.native
  }
  
  @js.native
  sealed trait CardActionType extends StObject
  @JSImport("sap/ui/integration/library", "CardActionType")
  @js.native
  object CardActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CardActionType & String] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.76)
      *
      * Used for custom actions.
      */
    @js.native
    sealed trait Custom
      extends StObject
         with CardActionType
    /* "Custom" */ val Custom: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.Custom & String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.87)
      *
      * Date selection. Available only for Calendar cards.
      */
    @js.native
    sealed trait DateChange
      extends StObject
         with CardActionType
    /* "DateChange" */ val DateChange: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.DateChange & String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.100)
      *
      * Used for hiding the appeared details about the card.
      */
    @js.native
    sealed trait HideCard
      extends StObject
         with CardActionType
    /* "HideCard" */ val HideCard: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.HideCard & String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.87)
      *
      * Month selection. Available only for Calendar cards.
      */
    @js.native
    sealed trait MonthChange
      extends StObject
         with CardActionType
    /* "MonthChange" */ val MonthChange: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.MonthChange & String = js.native
    
    /**
      * Used for navigation actions.
      */
    @js.native
    sealed trait Navigation
      extends StObject
         with CardActionType
    /* "Navigation" */ val Navigation: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.Navigation & String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.100)
      *
      * Used for showing more details about the card.
      */
    @js.native
    sealed trait ShowCard
      extends StObject
         with CardActionType
    /* "ShowCard" */ val ShowCard: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.ShowCard & String = js.native
    
    /**
      * Used for submit actions.
      */
    @js.native
    sealed trait Submit
      extends StObject
         with CardActionType
    /* "Submit" */ val Submit: typings.openui5.sapUiIntegrationLibraryMod.CardActionType.Submit & String = js.native
  }
  
  @js.native
  sealed trait CardArea extends StObject
  @JSImport("sap/ui/integration/library", "CardArea")
  @js.native
  object CardArea extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CardArea & String] = js.native
    
    /**
      * The content area.
      */
    @js.native
    sealed trait Content
      extends StObject
         with CardArea
    /* "Content" */ val Content: typings.openui5.sapUiIntegrationLibraryMod.CardArea.Content & String = js.native
    
    /**
      * The filters area.
      */
    @js.native
    sealed trait Filters
      extends StObject
         with CardArea
    /* "Filters" */ val Filters: typings.openui5.sapUiIntegrationLibraryMod.CardArea.Filters & String = js.native
    
    /**
      * The header.
      */
    @js.native
    sealed trait Header
      extends StObject
         with CardArea
    /* "Header" */ val Header: typings.openui5.sapUiIntegrationLibraryMod.CardArea.Header & String = js.native
  }
  
  @js.native
  sealed trait CardDataMode extends StObject
  @JSImport("sap/ui/integration/library", "CardDataMode")
  @js.native
  object CardDataMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CardDataMode & String] = js.native
    
    /**
      * When in this mode, the card can make requests.
      */
    @js.native
    sealed trait Active
      extends StObject
         with CardDataMode
    /* "Active" */ val Active: typings.openui5.sapUiIntegrationLibraryMod.CardDataMode.Active & String = js.native
    
    /**
      * When in this mode, the card starts processing the manifest when the card is in the viewport.
      */
    @js.native
    sealed trait Auto
      extends StObject
         with CardDataMode
    /* "Auto" */ val Auto: typings.openui5.sapUiIntegrationLibraryMod.CardDataMode.Auto & String = js.native
    
    /**
      * When in this mode, the card cannot make requests.
      */
    @js.native
    sealed trait Inactive
      extends StObject
         with CardDataMode
    /* "Inactive" */ val Inactive: typings.openui5.sapUiIntegrationLibraryMod.CardDataMode.Inactive & String = js.native
  }
  
  trait CardMenuAction extends StObject {
    
    /**
      * The action function.
      */
    var action: js.Function
    
    /**
      * The type of the action button.
      */
    var buttonType: ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String)
    
    /**
      * If the action is enabled. Default value is `true`.
      */
    var enabled: Boolean | js.Function
    
    /**
      * The icon of the action button.
      */
    var icon: URI
    
    /**
      * The parameters of the action.
      */
    var parameters: js.Object
    
    /**
      * The text of the action button.
      */
    var text: String
    
    /**
      * The tooltip of the action button.
      */
    var tooltip: String
    
    /**
      * The type of the action.
      */
    var `type`: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
    
    /**
      * If the action is visible. Default value is `true`.
      */
    var visible: Boolean | js.Function
  }
  object CardMenuAction {
    
    inline def apply(
      action: js.Function,
      buttonType: ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String),
      enabled: Boolean | js.Function,
      icon: URI,
      parameters: js.Object,
      text: String,
      tooltip: String,
      `type`: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String),
      visible: Boolean | js.Function
    ): CardMenuAction = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], buttonType = buttonType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardMenuAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardMenuAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setButtonType(
        value: ButtonType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonType * / any */ String)
      ): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean | js.Function): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: URI): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean | js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
