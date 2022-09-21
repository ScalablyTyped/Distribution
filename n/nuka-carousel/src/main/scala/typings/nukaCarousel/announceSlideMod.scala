package typings.nukaCarousel

import typings.nukaCarousel.anon.AriaLive
import typings.nukaCarousel.anon.Count
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announceSlideMod {
  
  @JSImport("nuka-carousel/lib/announce-slide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasMessageAriaLive: AriaLive): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasMessageAriaLive.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def defaultRenderAnnounceSlideMessage(hasCurrentSlideCount: Count): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRenderAnnounceSlideMessage")(hasCurrentSlideCount.asInstanceOf[js.Any]).asInstanceOf[String]
}
