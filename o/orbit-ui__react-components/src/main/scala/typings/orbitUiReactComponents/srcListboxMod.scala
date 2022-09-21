package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.orbitUiReactComponents.sharedMod.FocusManager
import typings.orbitUiReactComponents.typesMod.AriaLabelingProps
import typings.orbitUiReactComponents.typesMod.DomProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcListboxMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/Listbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerListbox(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerListboxProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerListbox")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeOnFocusChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFocusOnHoverUseVirtualFocusTabbableFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/Listbox", "Listbox")
  @js.native
  val Listbox: OrbitComponent[ListboxElement, InnerListboxProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/Listbox", "OptionKeyProp")
  @js.native
  val OptionKeyProp: /* "data-o-ui-key" */ String = js.native
  
  type CollectionNode = typings.orbitUiReactComponents.useCollectionMod.CollectionNode
  
  trait InnerListboxProps
    extends StObject
       with DomProps
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the listbox should autofocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * @ignore
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Default focus target when enabling autofocus.
      */
    var defaultFocusTarget: js.UndefOr[String] = js.undefined
    
    /**
      * The initial value of `selectedKeys` when uncontrolled.
      */
    var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not the listbox take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to focus the hovered item.
      */
    var focusOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A collection of nodes to render instead of children. It should only be used if you embed a Listbox inside another component like a custom Select.
      */
    var nodes: js.UndefOr[js.Array[CollectionNode]] = js.undefined
    
    /**
      * Called when the focus change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {String[]} keys - The keys of the selected items.
      * @returns {void}
      */
    var onFocusChange: js.UndefOr[
        js.Function3[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* key */ String, 
          /* activeElement */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called when the selected keys change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {String[]} keys - The keys of the selected items.
      * @returns {void}
      */
    var onSelectionChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* key */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A controlled set of the selected item keys.
      */
    var selectedKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The type of selection that is allowed.
      */
    var selectionMode: js.UndefOr[SelectionMode] = js.undefined
    
    /**
      * Whether or not the listbox option should be reachable with tabs.
      */
    var tabbable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not focus should be virtual (add a CSS class instead of switching the active element).
      */
    var useVirtualFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the listbox should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object InnerListboxProps {
    
    inline def apply(): InnerListboxProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerListboxProps]
    }
    
    extension [Self <: InnerListboxProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultFocusTarget(value: String): Self = StObject.set(x, "defaultFocusTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocusTargetUndefined: Self = StObject.set(x, "defaultFocusTarget", js.undefined)
      
      inline def setDefaultSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: String*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value*))
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setFocusOnHover(value: Boolean): Self = StObject.set(x, "focusOnHover", value.asInstanceOf[js.Any])
      
      inline def setFocusOnHoverUndefined: Self = StObject.set(x, "focusOnHover", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setNodes(value: js.Array[CollectionNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: CollectionNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnFocusChange(
        value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* key */ String, /* activeElement */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction3(value))
      
      inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
      
      inline def setOnSelectionChange(
        value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* key */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysNull: Self = StObject.set(x, "selectedKeys", null)
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setTabbable(value: Boolean): Self = StObject.set(x, "tabbable", value.asInstanceOf[js.Any])
      
      inline def setTabbableUndefined: Self = StObject.set(x, "tabbable", js.undefined)
      
      inline def setUseVirtualFocus(value: Boolean): Self = StObject.set(x, "useVirtualFocus", value.asInstanceOf[js.Any])
      
      inline def setUseVirtualFocusUndefined: Self = StObject.set(x, "useVirtualFocus", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  @js.native
  trait ListboxElement
    extends StObject
       with HTMLElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var focusManager: js.UndefOr[FocusManager] = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  }
  
  type ListboxProps = ComponentProps[OrbitComponent[ListboxElement, InnerListboxProps]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.single
    - typings.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
  */
  trait SelectionMode extends StObject
  object SelectionMode {
    
    inline def multiple: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple = "multiple".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple]
    
    inline def none: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none = "none".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none]
    
    inline def single: typings.orbitUiReactComponents.orbitUiReactComponentsStrings.single = "single".asInstanceOf[typings.orbitUiReactComponents.orbitUiReactComponentsStrings.single]
  }
}
