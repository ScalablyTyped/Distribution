package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Value
import typings.orbitUiReactComponents.distBoxSrcBoxMod.BoxProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.input
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutocompleteSrcAutocompleteMod {
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src/Autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src/Autocomplete", "Autocomplete")
  @js.native
  val Autocomplete: OrbitComponent[input, InnerAutocompleteProps] = js.native
  
  inline def InnerAutocomplete(props: InnerAutocompleteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AutocompleteProps = ComponentProps[OrbitComponent[input, InnerAutocompleteProps]]
  
  trait InnerAutocompleteProps
    extends StObject
       with InteractionStatesProps
       with AriaLabelingProps {
    
    /**
      * The horizontal alignment of the autocomplete menu relative to the input.
      */
    var align: js.UndefOr[start | end] = js.undefined
    
    /**
      * Whether or not the autocomplete menu can flip when it will overflow it's boundary area.
      */
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the selection menu position can change to prevent it from being cut off so that it stays visible within its boundary area.
      */
    var allowPreventOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the autocomplete should autofocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the query should be cleared when a result is selected.
      */
    var clearOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial value of open when in auto controlled mode.
      */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value of `value` when uncontrolled.
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * The direction the autocomplete menu will open relative to the input.
      */
    var direction: js.UndefOr[bottom | top] = js.undefined
    
    /**
      * Whether or not the autocomplete is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the autocomplete take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A trigger icon.
      */
    var icon: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Whether or not the autocomplete should display a loading state.
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum characters to query for results.
      */
    var minCharacters: js.UndefOr[Double] = js.undefined
    
    /**
      * @ignore
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Message to display when there are no results matching the query.
      */
    var noResultsMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Called when the autocomplete open state change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {boolean} isOpen - Indicate if the menu is open.
      * @returns {void}
      */
    var onOpenChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean, Unit]
      ] = js.undefined
    
    /**
      * Called when the input query change and new search results are expected.
      * @param {SyntheticEvent} event - React's original event.
      * @param {string} query - The search query.
      * @returns {void}
      */
    var onSearch: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* query */ String, Unit]
      ] = js.undefined
    
    /**
      * Called when the autocomplete value change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {Object} selection - The new selection.
      * @param {string} selection.key - The selected key.
      * @param {string} selection.value - The selected value.
      * @returns {void}
      */
    var onSelectionChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* selection */ Value, Unit]
      ] = js.undefined
    
    /**
      * Whether or not to open the autocomplete element.
      */
    var open: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Additional props to render on the menu of options.
      */
    var overlayProps: js.UndefOr[Partial[OverlayProps]] = js.undefined
    
    /**
      * Temporary text that occupies the autocomplete trigger when no value is selected.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the autocomplete is readonly.
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not a user input is required before form submission.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the autocomplete should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
    
    /**
      * A controlled autocomplete value.
      */
    var value: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Additional props to render on the wrapper element.
      */
    var wrapperProps: js.UndefOr[Partial[BoxProps]] = js.undefined
    
    /**
      * The z-index of the overlay element.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerAutocompleteProps {
    
    inline def apply(): InnerAutocompleteProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerAutocompleteProps]
    }
    
    extension [Self <: InnerAutocompleteProps](x: Self) {
      
      inline def setAlign(value: start | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClearOnSelect(value: Boolean): Self = StObject.set(x, "clearOnSelect", value.asInstanceOf[js.Any])
      
      inline def setClearOnSelectUndefined: Self = StObject.set(x, "clearOnSelect", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: bottom | top): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      inline def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoResultsMessage(value: String): Self = StObject.set(x, "noResultsMessage", value.asInstanceOf[js.Any])
      
      inline def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
      
      inline def setOnOpenChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnSearch(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* query */ String) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelectionChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* selection */ Value) => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenNull: Self = StObject.set(x, "open", null)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlayProps(value: Partial[OverlayProps]): Self = StObject.set(x, "overlayProps", value.asInstanceOf[js.Any])
      
      inline def setOverlayPropsUndefined: Self = StObject.set(x, "overlayProps", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrapperProps(value: Partial[BoxProps]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type OverlayProps = Partial[typings.orbitUiReactComponents.distOverlaySrcOverlayMod.OverlayProps]
}
