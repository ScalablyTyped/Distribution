package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.asyncImageMod.InnerAsyncImageProps
import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.srcImageMod.InnerImageProps
import typings.orbitUiReactComponents.svgImageMod.InnerSvgImageProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/image/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/image/src", "AsyncImage")
  @js.native
  val AsyncImage: OrbitComponent[HTMLElement, InnerAsyncImageProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/image/src", "Image")
  @js.native
  val Image: OrbitComponent[HTMLElement, InnerImageProps] = js.native
  
  inline def InnerImage(hasShapeSizeWidthHeightFitPositionAsForwardedRefRest: InnerImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerImage")(hasShapeSizeWidthHeightFitPositionAsForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSvgImage(hasSrcSizeWidthHeightStrokeFillAriaLabelForwardedRefRest: InnerSvgImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSvgImage")(hasSrcSizeWidthHeightStrokeFillAriaLabelForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/image/src", "SvgImage")
  @js.native
  val SvgImage: OrbitComponent[HTMLElement, InnerSvgImageProps] = js.native
}
