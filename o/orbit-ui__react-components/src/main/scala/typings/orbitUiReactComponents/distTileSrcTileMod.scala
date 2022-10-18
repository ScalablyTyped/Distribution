package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
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

object distTileSrcTileMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/Tile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTile(props: InnerTileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTile")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/Tile", "Tile")
  @js.native
  val Tile: OrbitComponent[HTMLElement, InnerTileProps] = js.native
  
  trait InnerTileProps
    extends StObject
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the tile should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * A controlled checked value.
      */
    var checked: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The initial value of `checked` when uncontrolled.
      */
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the tile is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the tile checked state change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {bool} isChecked - Whether the tile is checked or not.
      * @returns {void}
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[typings.std.Element, Event], 
          /* isChecked */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The orientation of the tile.
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The value to associate with when in a group.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object InnerTileProps {
    
    inline def apply(): InnerTileProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTileProps]
    }
    
    extension [Self <: InnerTileProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNull: Self = StObject.set(x, "checked", null)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* isChecked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TileProps = ComponentProps[OrbitComponent[HTMLElement, InnerTileProps]]
}
