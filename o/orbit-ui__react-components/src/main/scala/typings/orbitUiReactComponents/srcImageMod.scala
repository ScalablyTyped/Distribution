package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`scale-down`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.circular
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.contain
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.cover
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.fill
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.rounded
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.straight
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcImageMod {
  
  @JSImport("@orbit-ui/react-components/dist/image/src/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/image/src/Image", "Image")
  @js.native
  val Image: OrbitComponent[HTMLElement, InnerImageProps] = js.native
  
  inline def InnerImage(hasShapeSizeWidthHeightFitPositionAsForwardedRefRest: InnerImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerImage")(hasShapeSizeWidthHeightFitPositionAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ImageProps = ComponentProps[OrbitComponent[HTMLElement, InnerImageProps]]
  
  trait InnerImageProps extends StObject {
    
    /**
      * A text description of the image.
      */
    var alt: String
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * How the image should be resized to fit its container. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/object-fit).
      */
    var fit: js.UndefOr[contain | cover | fill | `scale-down` | none] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * @ignore
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The alignment of the image within it's box. See [MDN](https://developer.mozilla.org/en-US/docs/Web/CSS/object-position).
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * The image shape.
      */
    var shape: js.UndefOr[straight | rounded | circular] = js.undefined
    
    /**
      * Width and height in a single value.
      */
    var size: js.UndefOr[String] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * The path to the image.
      */
    var src: js.UndefOr[String] = js.undefined
    
    /**
      * One or more strings separated by commas, indicating possible image sources for the user agent to use. See [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#attr-srcset).
      */
    var srcSet: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object InnerImageProps {
    
    inline def apply(alt: String): InnerImageProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerImageProps]
    }
    
    extension [Self <: InnerImageProps](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setFit(value: contain | cover | fill | `scale-down` | none): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShape(value: straight | rounded | circular): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
