package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distImageSrcAsyncImageMod.InnerAsyncImageProps
import typings.orbitUiReactComponents.distImageSrcImageMod.InnerImageProps
import typings.orbitUiReactComponents.distImageSrcSvgImageMod.InnerSvgImageProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImageSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/image/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/image/src", "AsyncImage")
  @js.native
  val AsyncImage: OrbitComponent[HTMLElement, InnerAsyncImageProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/image/src", "Image")
  @js.native
  val Image: OrbitComponent[HTMLElement, InnerImageProps] = js.native
  
  inline def InnerImage(param0: InnerImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerImage")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerSvgImage(param0: InnerSvgImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerSvgImage")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/image/src", "SvgImage")
  @js.native
  val SvgImage: OrbitComponent[HTMLElement, InnerSvgImageProps] = js.native
}
