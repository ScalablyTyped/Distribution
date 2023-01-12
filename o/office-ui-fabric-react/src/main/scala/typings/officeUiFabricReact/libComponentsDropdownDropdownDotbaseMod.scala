package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Options
import typings.officeUiFabricReact.libComponentsDropdownDropdownDottypesMod.IDropdown
import typings.officeUiFabricReact.libComponentsDropdownDropdownDottypesMod.IDropdownOption
import typings.officeUiFabricReact.libComponentsDropdownDropdownDottypesMod.IDropdownProps
import typings.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDropdownDropdownDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown/Dropdown.base", "DropdownBase")
  @js.native
  open class DropdownBase protected ()
    extends Component[IDropdownInternalProps, IDropdownState, Any]
       with IDropdown {
    def this(props: IDropdownProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDropdownBase(newProps: IDropdownProps): Unit = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _copyArray: Any = js.native
    
    /* private */ var _dropDown: Any = js.native
    
    /* private */ var _focusZone: Any = js.native
    
    /* private */ var _getAllSelectedIndices: Any = js.native
    
    /** Get either props.placeholder (new name) or props.placeHolder (old name) */
    /* private */ var _getPlaceholder: Any = js.native
    
    /* private */ var _getSelectedIndex: Any = js.native
    
    /** Get all selected indexes for multi-select mode */
    /* private */ var _getSelectedIndexes: Any = js.native
    
    /** Get text in dropdown input as a string */
    /* private */ var _getTitle: Any = js.native
    
    /** Flag for when we get the first mouseMove */
    /* private */ var _gotMouseMove: Any = js.native
    
    /* private */ var _host: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /**
      * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
      */
    /* private */ var _isAltOrMeta: Any = js.native
    
    /**
      * Because the isDisabled prop is deprecated, we have had to repeat this logic all over the place.
      * This helper method avoids all the repetition.
      */
    /* private */ var _isDisabled: Any = js.native
    
    /** Flag for tracking whether focus is triggered by click (alternatively triggered by keyboard nav) */
    /* private */ var _isFocusedByClick: Any = js.native
    
    /* private */ var _isScrollIdle: Any = js.native
    
    /* private */ var _labelId: Any = js.native
    
    /** True if the most recent keydown event was for alt (option) or meta (command). */
    /* private */ var _lastKeyDownWasAltOrMeta: Any = js.native
    
    /* private */ var _listId: Any = js.native
    
    /**
      * Finds the next valid Dropdown option and sets the selected index to it.
      * @param stepValue - Value of how many items the function should traverse.  Should be -1 or 1.
      * @param index - Index of where the search should start
      * @param selectedIndex - The selectedIndex Dropdown's state
      * @returns The next valid dropdown option's index
      */
    /* private */ var _moveIndex: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _onDismiss: Any = js.native
    
    /* private */ var _onDropdownBlur: Any = js.native
    
    /* private */ var _onDropdownClick: Any = js.native
    
    /* private */ var _onDropdownKeyDown: Any = js.native
    
    /* private */ var _onDropdownKeyUp: Any = js.native
    
    /* private */ var _onDropdownMouseDown: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onItemClick: Any = js.native
    
    /* private */ var _onItemMouseEnter: Any = js.native
    
    /* private */ var _onItemMouseMove: Any = js.native
    
    /* private */ var _onMouseItemLeave: Any = js.native
    
    /* private */ var _onPositioned: Any = js.native
    
    /** Render Caret Down Icon */
    /* private */ var _onRenderCaretDown: Any = js.native
    
    /** Render Callout or Panel container and pass in list */
    /* private */ var _onRenderContainer: Any = js.native
    
    /* private */ var _onRenderItem: Any = js.native
    
    /** Render custom label for drop down item */
    /* private */ var _onRenderItemLabel: Any = js.native
    
    /* private */ var _onRenderLabel: Any = js.native
    
    /** Render List of items */
    /* private */ var _onRenderList: Any = js.native
    
    /** Render content of item (i.e. text/icon inside of button) */
    /* private */ var _onRenderOption: Any = js.native
    
    /** Render placeholder text in dropdown input */
    /* private */ var _onRenderPlaceholder: Any = js.native
    
    /** Render text in dropdown input */
    /* private */ var _onRenderTitle: Any = js.native
    
    /**
      * Scroll handler for the callout to make sure the mouse events
      * for updating focus are not interacting during scroll
      */
    /* private */ var _onScroll: Any = js.native
    
    /* private */ var _onZoneKeyDown: Any = js.native
    
    /* private */ var _onZoneKeyUp: Any = js.native
    
    /* private */ var _optionId: Any = js.native
    
    /** Wrap item list in a FocusZone */
    /* private */ var _renderFocusableList: Any = js.native
    
    /* private */ var _renderHeader: Any = js.native
    
    /* private */ var _renderOption: Any = js.native
    
    /* private */ var _renderSeparator: Any = js.native
    
    /* private */ var _requestAnimationFrame: Any = js.native
    
    /* private */ val _scrollIdleDelay: Any = js.native
    
    /* private */ var _scrollIdleTimeoutId: Any = js.native
    
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
    /* private */ var _shouldHandleKeyUp: Any = js.native
    
    /* private */ var _shouldIgnoreMouseEvent: Any = js.native
    
    /**
      * Returns true if dropdown should set to open on focus.
      * Otherwise, isOpen state should be toggled on click
      */
    /* private */ var _shouldOpenOnFocus: Any = js.native
    
    /* private */ var _sizePosCache: Any = js.native
    
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
  - typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState because var conflicts: responsiveMode. Inlined  */ trait IDropdownInternalProps
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDropdownState] (val x: Self) extends AnyVal {
      
      inline def setCalloutRenderEdge(value: RectangleEdge): Self = StObject.set(x, "calloutRenderEdge", value.asInstanceOf[js.Any])
      
      inline def setCalloutRenderEdgeUndefined: Self = StObject.set(x, "calloutRenderEdge", js.undefined)
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndices(value: js.Array[Double]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesVarargs(value: Double*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
    }
  }
}
