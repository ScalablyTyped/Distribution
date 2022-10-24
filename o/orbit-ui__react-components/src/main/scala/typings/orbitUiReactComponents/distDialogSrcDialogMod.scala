package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.alertdialog
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.dialog
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.fullscreen
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogSrcDialogMod {
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src/Dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src/Dialog", "Dialog")
  @js.native
  val Dialog: OrbitComponent[HTMLElement, InnerDialogProps] = js.native
  
  inline def InnerDialog(param0: InnerDialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialog")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DialogProps = ComponentProps[OrbitComponent[HTMLElement, InnerDialogProps]]
  
  trait InnerDialogProps
    extends StObject
       with DomProps
       with AriaLabelingProps
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the dialog should close on outside interactions.
      */
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The dialog role.
      */
    var role: js.UndefOr[dialog | alertdialog] = js.undefined
    
    /**
      * A dialog can vary in size.
      */
    var size: js.UndefOr[sm | md | lg | fullscreen] = js.undefined
    
    /**
      * Additional props to render on the wrapper element.
      */
    var wrapperProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * The z-index of the dialog.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerDialogProps {
    
    inline def apply(): InnerDialogProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerDialogProps]
    }
    
    extension [Self <: InnerDialogProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setRole(value: dialog | alertdialog): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSize(value: sm | md | lg | fullscreen): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWrapperProps(value: Record[String, Any]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
