package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distImageSrcImageMod.InnerImageProps
import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImageSrcAsyncImageMod {
  
  @JSImport("@orbit-ui/react-components/dist/image/src/AsyncImage", "AsyncImage")
  @js.native
  val AsyncImage: OrbitComponent[HTMLElement, InnerAsyncImageProps] = js.native
  
  type AsyncImageProps = ComponentProps[OrbitComponent[HTMLElement, InnerAsyncImageProps]]
  
  trait InnerAsyncImageProps
    extends StObject
       with InnerImageProps {
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The number of milliseconds to delay the rendering of the fallback.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * The allowed number of retry to load the async image.
      */
    var retryCount: js.UndefOr[Double] = js.undefined
  }
  object InnerAsyncImageProps {
    
    inline def apply(alt: String): InnerAsyncImageProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerAsyncImageProps]
    }
    
    extension [Self <: InnerAsyncImageProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    }
  }
}
