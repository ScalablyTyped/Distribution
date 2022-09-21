package typings.officeUiFabricReact

import typings.officeUiFabricReact.pivotTypesMod.IPivotProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.base", "PivotBase")
  @js.native
  open class PivotBase protected () extends Component[IPivotProps, IPivotState, Any] {
    def this(props: IPivotProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _focusZone: Any = js.native
    
    /* private */ var _getClassNames: Any = js.native
    
    /**
      * Gets the set of PivotLinks as array of IPivotItemProps
      * The set of Links is determined by child components of type PivotItem
      */
    /* private */ var _getPivotLinks: Any = js.native
    
    /* private */ var _getSelectedKey: Any = js.native
    
    /**
      * Generates the Id for the tab button.
      */
    /* private */ var _getTabId: Any = js.native
    
    /**
      * whether the key exists in the pivot items.
      */
    /* private */ var _isKeyValid: Any = js.native
    
    /**
      * Handle the onKeyDown event on the PivotLinks
      */
    /* private */ var _onKeyDown: Any = js.native
    
    /**
      * Handles the onClick event on PivotLinks
      */
    /* private */ var _onLinkClick: Any = js.native
    
    /* private */ var _pivotId: Any = js.native
    
    /* private */ var _renderLinkContent: Any = js.native
    
    /**
      * Renders a Pivot Item
      */
    /* private */ var _renderPivotItem: Any = js.native
    
    /* private */ var _renderPivotLink: Any = js.native
    
    /**
      * Renders the set of links to route between pivots
      */
    /* private */ var _renderPivotLinks: Any = js.native
    
    /**
      * Updates the state with the new selected index
      */
    /* private */ var _updateSelectedItem: Any = js.native
    
    /**
      * Sets focus to the first pivot tab.
      */
    def focus(): Unit = js.native
  }
  
  trait IPivotState extends StObject {
    
    var selectedKey: js.UndefOr[String] = js.undefined
  }
  object IPivotState {
    
    inline def apply(): IPivotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotState]
    }
    
    extension [Self <: IPivotState](x: Self) {
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
