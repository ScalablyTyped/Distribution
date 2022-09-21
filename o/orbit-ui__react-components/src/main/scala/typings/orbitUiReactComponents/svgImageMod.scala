package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.typesMod.AriaLabelingProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgImageMod {
  
  @JSImport("@orbit-ui/react-components/dist/image/src/SvgImage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerSvgImage(hasSrcSizeWidthHeightStrokeFillAriaLabelForwardedRefRest: InnerSvgImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSvgImage")(hasSrcSizeWidthHeightStrokeFillAriaLabelForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/image/src/SvgImage", "SvgImage")
  @js.native
  val SvgImage: OrbitComponent[HTMLElement, InnerSvgImageProps] = js.native
  
  trait InnerSvgImageProps
    extends StObject
       with AriaLabelingProps {
    
    /**
      * Defines a string value that labels the current element.
      */
    @JSName("aria-label")
    var `aria-label_InnerSvgImageProps`: String
    
    /**
      * The SVG fill attribute. See [MDN](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill).
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * @ignore
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Width and height in a single value.
      */
    var size: js.UndefOr[String] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * An SVG as a React component.
      */
    var src: ElementType[Any]
    
    /**
      * The SVG stroke attribute. See [MDN](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/stroke).
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /**
      * @ignore
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object InnerSvgImageProps {
    
    inline def apply(`aria-label`: String, src: ElementType[Any]): InnerSvgImageProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], forwardedRef = null)
      __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerSvgImageProps]
    }
    
    extension [Self <: InnerSvgImageProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc(value: ElementType[Any]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type SvgImageProps = ComponentProps[OrbitComponent[HTMLElement, InnerSvgImageProps]]
}
