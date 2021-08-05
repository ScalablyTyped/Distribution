package typings.officeUiFabricReact

import typings.officeUiFabricReact.pivotTypesMod.IPivotProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.base", "PivotBase")
  @js.native
  class PivotBase protected ()
    extends Component[IPivotProps, IPivotState, js.Any] {
    def this(props: IPivotProps) = this()
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _focusZone: js.Any = js.native
    
    /* private */ var _getClassNames: js.Any = js.native
    
    /**
      * Gets the set of PivotLinks as array of IPivotItemProps
      * The set of Links is determined by child components of type PivotItem
      */
    /* private */ var _getPivotLinks: js.Any = js.native
    
    /* private */ var _getSelectedKey: js.Any = js.native
    
    /**
      * Generates the Id for the tab button.
      */
    /* private */ var _getTabId: js.Any = js.native
    
    /**
      * whether the key exists in the pivot items.
      */
    /* private */ var _isKeyValid: js.Any = js.native
    
    /**
      * Handle the onKeyDown event on the PivotLinks
      */
    /* private */ var _onKeyDown: js.Any = js.native
    
    /**
      * Handles the onClick event on PivotLinks
      */
    /* private */ var _onLinkClick: js.Any = js.native
    
    /* private */ var _pivotId: js.Any = js.native
    
    /* private */ var _renderLinkContent: js.Any = js.native
    
    /**
      * Renders a Pivot Item
      */
    /* private */ var _renderPivotItem: js.Any = js.native
    
    /* private */ var _renderPivotLink: js.Any = js.native
    
    /**
      * Renders the set of links to route between pivots
      */
    /* private */ var _renderPivotLinks: js.Any = js.native
    
    /**
      * Updates the state with the new selected index
      */
    /* private */ var _updateSelectedItem: js.Any = js.native
    
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
