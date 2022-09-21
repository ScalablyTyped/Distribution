package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import typings.orbitUiReactComponents.typesMod.AriaLabelingProps
import typings.orbitUiReactComponents.typesMod.DomProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMenuMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/Menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMenu(
    hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest: InnerMenuProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenu")(hasIdSelectedKeysPropDefaultSelectedKeysValidationStateOnSelectionChangeSelectionModeNodesPropAutoFocusDefaultFocusTargetFluidAriaLabelAriaLabelledByAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/Menu", "ItemKeyProp")
  @js.native
  val ItemKeyProp: /* "data-o-ui-key" */ String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/Menu", "Menu")
  @js.native
  val Menu: OrbitComponent[HTMLElement, InnerMenuProps] = js.native
  
  type CollectionNode = typings.orbitUiReactComponents.useCollectionMod.CollectionNode
  
  trait InnerMenuProps
    extends StObject
       with DomProps
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the menu should autofocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
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
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A collection of nodes to render instead of children. It should only be used if you embed a Menu inside another component.
      */
    var nodes: js.UndefOr[js.Array[CollectionNode]] = js.undefined
    
    /**
      * Called when the selected keys change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {String[]} keys - The keys of the selected items..
      * @returns {void}
      */
    var onSelectionChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* keys */ js.Array[String], 
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
      * Whether or not the menu should display as "valid" or "invalid".
      */
    var validationState: js.UndefOr[valid | invalid] = js.undefined
  }
  object InnerMenuProps {
    
    inline def apply(): InnerMenuProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerMenuProps]
    }
    
    extension [Self <: InnerMenuProps](x: Self) {
      
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
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setNodes(value: js.Array[CollectionNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: CollectionNode*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setOnSelectionChange(
        value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* keys */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysNull: Self = StObject.set(x, "selectedKeys", null)
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setValidationState(value: valid | invalid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
  
  type MenuProps = ComponentProps[OrbitComponent[HTMLElement, InnerMenuProps]]
  
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
