package typings.nivoSunburst

import typings.nivoSunburst.anon.ArcGenerator
import typings.nivoSunburst.anon.ChildColor
import typings.nivoSunburst.distTypesTypesMod.SunburstCustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/sunburst/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSunburst[RawDatum](param0: ChildColor[RawDatum]): ArcGenerator[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSunburst")(param0.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator[RawDatum]]
  
  inline def useSunburstLayerContext[RawDatum](param0: SunburstCustomLayerProps[RawDatum]): SunburstCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSunburstLayerContext")(param0.asInstanceOf[js.Any]).asInstanceOf[SunburstCustomLayerProps[RawDatum]]
}
