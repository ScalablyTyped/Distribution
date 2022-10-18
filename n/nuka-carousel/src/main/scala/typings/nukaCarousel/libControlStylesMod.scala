package typings.nukaCarousel

import typings.nukaCarousel.libTypesMod.Positions
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libControlStylesMod {
  
  @JSImport("nuka-carousel/lib/control-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getControlContainerStyles(pos: Positions): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlContainerStyles")(pos.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
}
