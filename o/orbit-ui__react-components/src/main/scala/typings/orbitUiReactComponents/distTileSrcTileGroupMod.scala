package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.multiple
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.single
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
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

object distTileSrcTileGroupMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/TileGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTileGroup(param0: InnerTileGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTileGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/TileGroup", "TileGroup")
  @js.native
  val TileGroup: OrbitComponent[HTMLElement, InnerTileGroupProps] = js.native
  
  trait InnerTileGroupProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the first tile of the group should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The initial value of `value`.
      */
    var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not the tiles are disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when any of the children is checked or unchecked..
      * @param {SyntheticEvent} event - React's original event.
      * @param {string[]} value - The new value.
      * @returns {void}
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* value */ js.Array[String], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The orientation of the group tiles.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The number of tiles per row.
      */
    var rowSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of selection that is allowed.
      */
    var selectionMode: js.UndefOr[none | single | multiple] = js.undefined
    
    /**
      * The value of the tile group.
      */
    var value: js.UndefOr[js.Array[String] | Null] = js.undefined
  }
  object InnerTileGroupProps {
    
    inline def apply(): InnerTileGroupProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTileGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InnerTileGroupProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnChange(
        value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* value */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      inline def setSelectionMode(value: none | single | multiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type TileGroupProps = ComponentProps[OrbitComponent[HTMLElement, InnerTileGroupProps]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.OrbitComponent<std.HTMLElement, @orbit-ui/react-components.@orbit-ui/react-components/dist/group/src/Group.InnerGroupProps> extends react.react.JSXElementConstructor<infer P> ? P : @orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.OrbitComponent<std.HTMLElement, @orbit-ui/react-components.@orbit-ui/react-components/dist/group/src/Group.InnerGroupProps> extends keyof react.react.JSX.IntrinsicElements ? react.react.JSX.IntrinsicElements[@orbit-ui/react-components.@orbit-ui/react-components/dist/shared/src/forwardRef.OrbitComponent<std.HTMLElement, @orbit-ui/react-components.@orbit-ui/react-components/dist/group/src/Group.InnerGroupProps>] : {} */ trait UnselectableGroupProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
  }
  object UnselectableGroupProps {
    
    inline def apply(): UnselectableGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnselectableGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnselectableGroupProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    }
  }
}
