package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Options
import typings.officeUiFabricReact.dropdownTypesMod.IDropdown
import typings.officeUiFabricReact.dropdownTypesMod.IDropdownOption
import typings.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
  @js.native
  class DropdownBase protected ()
    extends Component[IDropdownInternalProps, IDropdownState, js.Any]
       with IDropdown {
    def this(props: IDropdownProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDropdownBase(newProps: IDropdownProps): Unit = js.native
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _copyArray: js.Any = js.native
    
    /* private */ var _dropDown: js.Any = js.native
    
    /* private */ var _focusZone: js.Any = js.native
    
    /* private */ var _getAllSelectedIndices: js.Any = js.native
    
    /* private */ var _getSelectedIndex: js.Any = js.native
    
    /** Get all selected indexes for multi-select mode */
    /* private */ var _getSelectedIndexes: js.Any = js.native
    
    /** Flag for when we get the first mouseMove */
    /* private */ var _gotMouseMove: js.Any = js.native
    
    /* private */ var _host: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /**
      * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
      */
    /* private */ var _isAltOrMeta: js.Any = js.native
    
    /**
      * Because the isDisabled prop is deprecated, we have had to repeat this logic all over the place.
      * This helper method avoids all the repetition.
      */
    /* private */ var _isDisabled: js.Any = js.native
    
    /** Flag for tracking whether focus is triggered by click (alternatively triggered by keyboard nav) */
    /* private */ var _isFocusedByClick: js.Any = js.native
    
    /* private */ var _isScrollIdle: js.Any = js.native
    
    /* private */ var _labelId: js.Any = js.native
    
    /** True if the most recent keydown event was for alt (option) or meta (command). */
    /* private */ var _lastKeyDownWasAltOrMeta: js.Any = js.native
    
    /* private */ var _listId: js.Any = js.native
    
    /**
      * Finds the next valid Dropdown option and sets the selected index to it.
      * @param stepValue - Value of how many items the function should traverse.  Should be -1 or 1.
      * @param index - Index of where the search should start
      * @param selectedIndex - The selectedIndex Dropdown's state
      * @returns The next valid dropdown option's index
      */
    /* private */ var _moveIndex: js.Any = js.native
    
    /* private */ var _onChange: js.Any = js.native
    
    /* private */ var _onDismiss: js.Any = js.native
    
    /* private */ var _onDropdownBlur: js.Any = js.native
    
    /* private */ var _onDropdownClick: js.Any = js.native
    
    /* private */ var _onDropdownKeyDown: js.Any = js.native
    
    /* private */ var _onDropdownKeyUp: js.Any = js.native
    
    /* private */ var _onDropdownMouseDown: js.Any = js.native
    
    /* private */ var _onFocus: js.Any = js.native
    
    /* private */ var _onItemClick: js.Any = js.native
    
    /* private */ var _onItemMouseEnter: js.Any = js.native
    
    /* private */ var _onItemMouseMove: js.Any = js.native
    
    /* private */ var _onMouseItemLeave: js.Any = js.native
    
    /* private */ var _onPositioned: js.Any = js.native
    
    /** Render Caret Down Icon */
    /* private */ var _onRenderCaretDown: js.Any = js.native
    
    /** Render Callout or Panel container and pass in list */
    /* private */ var _onRenderContainer: js.Any = js.native
    
    /* private */ var _onRenderItem: js.Any = js.native
    
    /** Render custom label for drop down item */
    /* private */ var _onRenderItemLabel: js.Any = js.native
    
    /* private */ var _onRenderLabel: js.Any = js.native
    
    /** Render List of items */
    /* private */ var _onRenderList: js.Any = js.native
    
    /** Render content of item (i.e. text/icon inside of button) */
    /* private */ var _onRenderOption: js.Any = js.native
    
    /** Render placeholder text in dropdown input */
    /* private */ var _onRenderPlaceholder: js.Any = js.native
    
    /** Render text in dropdown input */
    /* private */ var _onRenderTitle: js.Any = js.native
    
    /**
      * Scroll handler for the callout to make sure the mouse events
      * for updating focus are not interacting during scroll
      */
    /* private */ var _onScroll: js.Any = js.native
    
    /* private */ var _onZoneKeyDown: js.Any = js.native
    
    /* private */ var _onZoneKeyUp: js.Any = js.native
    
    /* private */ var _optionId: js.Any = js.native
    
    /** Get either props.placeholder (new name) or props.placeHolder (old name) */
    /* private */ val _placeholder: js.Any = js.native
    
    /** Wrap item list in a FocusZone */
    /* private */ var _renderFocusableList: js.Any = js.native
    
    /* private */ var _renderHeader: js.Any = js.native
    
    /* private */ var _renderOption: js.Any = js.native
    
    /* private */ var _renderSeparator: js.Any = js.native
    
    /* private */ var _requestAnimationFrame: js.Any = js.native
    
    /* private */ val _scrollIdleDelay: js.Any = js.native
    
    /* private */ var _scrollIdleTimeoutId: js.Any = js.native
    
    /**
      * We close the menu on key up only if ALL of the following are true:
      * - Most recent key down was alt or meta (command)
      * - The alt/meta key down was NOT followed by some other key (such as down/up arrow to
      *   expand/collapse the menu)
      * - We're not on a Mac (or iOS)
      *
      * This is because on Windows, pressing alt moves focus to the application menu bar or similar,
      * closing any open context menus. There is not a similar behavior on Macs.
      */
    /* private */ var _shouldHandleKeyUp: js.Any = js.native
    
    /* private */ var _shouldIgnoreMouseEvent: js.Any = js.native
    
    /**
      * Returns true if dropdown should set to open on focus.
      * Otherwise, isOpen state should be toggled on click
      */
    /* private */ var _shouldOpenOnFocus: js.Any = js.native
    
    /* private */ var _sizePosCache: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDropdownBase(prevProps: IDropdownProps, prevState: IDropdownState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDropdownBase(): Unit = js.native
    
    def setSelectedIndex(event: FormEvent[HTMLDivElement], index: Double): Unit = js.native
  }
  /* static members */
  object DropdownBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase.defaultProps")
    @js.native
    def defaultProps: Options = js.native
    inline def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState because var conflicts: responsiveMode. Inlined  */ trait IDropdownInternalProps
    extends StObject
       with IDropdownProps
  object IDropdownInternalProps {
    
    inline def apply(options: js.Array[IDropdownOption]): IDropdownInternalProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownInternalProps]
    }
  }
  
  trait IDropdownState extends StObject {
    
    var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.undefined
    
    /** Whether the root dropdown element has focus. */
    var hasFocus: Boolean
    
    var isOpen: Boolean
    
    var selectedIndices: js.Array[Double]
  }
  object IDropdownState {
    
    inline def apply(hasFocus: Boolean, isOpen: Boolean, selectedIndices: js.Array[Double]): IDropdownState = {
      val __obj = js.Dynamic.literal(hasFocus = hasFocus.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedIndices = selectedIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownState]
    }
    
    extension [Self <: IDropdownState](x: Self) {
      
      inline def setCalloutRenderEdge(value: RectangleEdge): Self = StObject.set(x, "calloutRenderEdge", value.asInstanceOf[js.Any])
      
      inline def setCalloutRenderEdgeUndefined: Self = StObject.set(x, "calloutRenderEdge", js.undefined)
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value :_*))
    }
  }
}
