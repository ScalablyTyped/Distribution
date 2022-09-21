package typings.nivoColors

import typings.nivoColors.interpolatorsMod.ColorInterpolatorId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cyclicalMod {
  
  object cyclicalColorInterpolators {
    
    @JSImport("@nivo/colors/dist/types/schemes/cyclical", "cyclicalColorInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/colors/dist/types/schemes/cyclical", "cyclicalColorInterpolators.rainbow")
    @js.native
    def rainbow: js.Function1[/* t */ Double, String] = js.native
    inline def rainbow_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rainbow")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/colors/dist/types/schemes/cyclical", "cyclicalColorInterpolators.sinebow")
    @js.native
    def sinebow: js.Function1[/* t */ Double, String] = js.native
    inline def sinebow_=(x: js.Function1[/* t */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinebow")(x.asInstanceOf[js.Any])
  }
  
  /* keyof @nivo/colors.anon.Rainbow */ /* Rewritten from type alias, can be one of: 
    - typings.nivoColors.nivoColorsStrings.rainbow
    - typings.nivoColors.nivoColorsStrings.sinebow
  */
  trait CyclicalColorInterpolatorId
    extends StObject
       with ColorInterpolatorId
}
