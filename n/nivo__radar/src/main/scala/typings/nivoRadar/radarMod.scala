package typings.nivoRadar

import typings.nivoRadar.typesMod.RadarSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radarMod {
  
  @JSImport("@nivo/radar/dist/types/Radar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Radar[D /* <: Record[String, Any] */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: RadarSvgProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Radar")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
