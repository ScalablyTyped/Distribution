package typings.officeUiFabricReact

import typings.officeUiFabricReact.pivotTypesMod.IPivotProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.base", "PivotBase")
  @js.native
  class PivotBase protected ()
    extends Component[IPivotProps, IPivotState, js.Any] {
    def this(props: IPivotProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _focusZone: js.Any = js.native
    
    var _getClassNames: js.Any = js.native
    
    /**
      * Gets the set of PivotLinks as array of IPivotItemProps
      * The set of Links is determined by child components of type PivotItem
      */
    var _getPivotLinks: js.Any = js.native
    
    var _getSelectedKey: js.Any = js.native
    
    /**
      * Generates the Id for the tab button.
      */
    var _getTabId: js.Any = js.native
    
    /**
      * whether the key exists in the pivot items.
      */
    var _isKeyValid: js.Any = js.native
    
    /**
      * Handle the onKeyDown event on the PivotLinks
      */
    var _onKeyDown: js.Any = js.native
    
    /**
      * Handles the onClick event on PivotLinks
      */
    var _onLinkClick: js.Any = js.native
    
    var _pivotId: js.Any = js.native
    
    var _renderLinkContent: js.Any = js.native
    
    /**
      * Renders a Pivot Item
      */
    var _renderPivotItem: js.Any = js.native
    
    var _renderPivotLink: js.Any = js.native
    
    /**
      * Renders the set of links to route between pivots
      */
    var _renderPivotLinks: js.Any = js.native
    
    /**
      * Updates the state with the new selected index
      */
    var _updateSelectedItem: js.Any = js.native
    
    /**
      * Sets focus to the first pivot tab.
      */
    def focus(): Unit = js.native
  }
  
  @js.native
  trait IPivotState extends StObject {
    
    var selectedKey: js.UndefOr[String] = js.native
  }
  object IPivotState {
    
    @scala.inline
    def apply(): IPivotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotState]
    }
    
    @scala.inline
    implicit class IPivotStateMutableBuilder[Self <: IPivotState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
