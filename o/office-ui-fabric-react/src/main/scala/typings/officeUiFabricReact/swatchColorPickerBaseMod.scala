package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.SelectedIndex
import typings.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchColorPickerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/SwatchColorPicker.base", "SwatchColorPickerBase")
  @js.native
  open class SwatchColorPickerBase protected () extends Component[ISwatchColorPickerProps, ISwatchColorPickerState, Any] {
    def this(props: ISwatchColorPickerProps) = this()
    
    /* private */ var _cellFocused: Any = js.native
    
    /* private */ var _getItemsWithIndex: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /**
      * Handle the click on a cell
      * @param item - The cell that the click was fired against
      */
    /* private */ var _onCellClick: Any = js.native
    
    /**
      * Callback passed to the GridCell class that will trigger the onCellFocus callback of the SwatchColorPicker
      */
    /* private */ var _onGridCellFocused: Any = js.native
    
    /**
      * Callback passed to the GridCell class that will trigger the onCellHovered callback of the SwatchColorPicker
      * NOTE: This will not be triggered if shouldFocusOnHover === true
      */
    /* private */ var _onGridCellHovered: Any = js.native
    
    /**
      * Callback that
      */
    /* private */ var _onKeyDown: Any = js.native
    
    /**
      * Callback passed to the GridCell that will manage triggering the onCellHovered callback for mouseEnter
      */
    /* private */ var _onMouseEnter: Any = js.native
    
    /**
      * Callback passed to the GridCell that will manage Hover/Focus updates
      */
    /* private */ var _onMouseLeave: Any = js.native
    
    /**
      * Callback passed to the GridCell that will manage Hover/Focus updates
      */
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _onRenderItem: Any = js.native
    
    /**
      * When the whole swatchColorPicker is blurred,
      * make sure to clear the pending focused stated
      */
    /* private */ var _onSwatchColorPickerBlur: Any = js.native
    
    /**
      * Callback to make sure we don't update the hovered element during mouse wheel
      */
    /* private */ var _onWheel: Any = js.native
    
    /**
      * Render a color cell
      * @param item - The item to render
      * @returns - Element representing the item
      */
    /* private */ var _renderOption: Any = js.native
    
    /**
      * Sets a timeout so we won't process any mouse "hover" events
      * while navigating (via mouseWheel or arrowKeys)
      */
    /* private */ var _setNavigationTimeout: Any = js.native
    
    /* private */ var async: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSwatchColorPickerBase(): Unit = js.native
    
    /* private */ var isNavigationIdle: Any = js.native
    
    /* private */ val navigationIdleDelay: Any = js.native
    
    /* private */ var navigationIdleTimeoutId: Any = js.native
  }
  /* static members */
  object SwatchColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/SwatchColorPicker.base", "SwatchColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker/SwatchColorPicker.base", "SwatchColorPickerBase.defaultProps")
    @js.native
    def defaultProps: ISwatchColorPickerProps = js.native
    inline def defaultProps_=(x: ISwatchColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(newProps: ISwatchColorPickerProps, state: ISwatchColorPickerState): SelectedIndex | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SelectedIndex | Null]
  }
  
  trait ISwatchColorPickerState extends StObject {
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
  }
  object ISwatchColorPickerState {
    
    inline def apply(): ISwatchColorPickerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwatchColorPickerState]
    }
    
    extension [Self <: ISwatchColorPickerState](x: Self) {
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    }
  }
}
