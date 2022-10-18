package typings.nukaCarousel

import typings.nukaCarousel.anon.FrameHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseFrameHeightMod {
  
  @JSImport("nuka-carousel/lib/hooks/use-frame-height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFrameHeight(adaptiveHeight: Boolean, slidesToShow: Double, slideCount: Double): FrameHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrameHeight")(adaptiveHeight.asInstanceOf[js.Any], slidesToShow.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any])).asInstanceOf[FrameHeight]
}
