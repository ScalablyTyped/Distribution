package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Size
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.button
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.circular
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.danger
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.ghost
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.primary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.reset
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.rounded
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.secondary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.solid
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.submit
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonSrcIconButtonMod {
  
  @JSImport("@orbit-ui/react-components/dist/button/src/IconButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/button/src/IconButton", "IconButton")
  @js.native
  val IconButton: OrbitComponent[button, InnerIconButtonProps] = js.native
  
  inline def InnerIconButton(props: InnerIconButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIconButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def embedIconButton[Props /* <: Size & (Record[String, Any]) */](element: ReactElement, param1: Props): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embedIconButton")(element.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  type IconButtonProps = ComponentProps[OrbitComponent[button, InnerIconButtonProps]]
  
  trait InnerIconButtonProps
    extends StObject
       with InteractionStatesProps
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether or not the icon button should autoFocus on render.
      */
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The icon button color accent.
      */
    var color: js.UndefOr[primary | secondary | danger | inherit] = js.undefined
    
    /**
      * Whether or not the icon button content should takes additional space.
      */
    var condensed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the icon button is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the button take up the width of its container.
      */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * An icon button can show a loading indicator.
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var onClick: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.undefined
    
    /**
      * The icon button shape.
      */
    var shape: js.UndefOr[rounded | circular] = js.undefined
    
    /**
      * An icon button can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * The icon button type.
      */
    var `type`: js.UndefOr[button | submit | reset] = js.undefined
    
    /**
      * The icon button style to use.
      */
    var variant: js.UndefOr[solid | outline | ghost] = js.undefined
  }
  object InnerIconButtonProps {
    
    inline def apply(): InnerIconButtonProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerIconButtonProps]
    }
    
    extension [Self <: InnerIconButtonProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: primary | secondary | danger | inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCondensed(value: Boolean): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnClick(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setShape(value: rounded | circular): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: `2xs` | xs | sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setType(value: button | submit | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVariant(value: solid | outline | ghost): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
