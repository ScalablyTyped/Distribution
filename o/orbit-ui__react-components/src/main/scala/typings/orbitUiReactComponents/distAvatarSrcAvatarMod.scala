package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.Children
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xl`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAvatarSrcAvatarMod {
  
  @JSImport("@orbit-ui/react-components/dist/avatar/src/Avatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/avatar/src/Avatar", "Avatar")
  @js.native
  val Avatar: OrbitComponent[HTMLElement, InnerAvatarProps] = js.native
  
  inline def AvatarText(props: AvatarTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerAvatar(param0: InnerAvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAvatar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AvatarProps = ComponentProps[OrbitComponent[HTMLElement, InnerAvatarProps]]
  
  type AvatarTextProps = Partial[AvatarProps] & Children
  
  trait InnerAvatarProps
    extends StObject
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The name of the person in the avatar.
      */
    var name: String
    
    /**
      * The allowed number of retry to load a remote image.
      */
    var retryCount: js.UndefOr[Double] = js.undefined
    
    /**
      * An avatar can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | `2xl`] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * The url of a remote image or an image object.
      */
    var src: js.UndefOr[String | ReactNode] = js.undefined
  }
  object InnerAvatarProps {
    
    inline def apply(name: String): InnerAvatarProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerAvatarProps]
    }
    
    extension [Self <: InnerAvatarProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | `2xl`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc(value: String | ReactNode): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
