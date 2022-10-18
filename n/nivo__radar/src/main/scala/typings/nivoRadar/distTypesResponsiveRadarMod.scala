package typings.nivoRadar

import typings.nivoRadar.distTypesTypesMod.RadarSvgProps
import typings.nivoRadar.nivoRadarStrings.height
import typings.nivoRadar.nivoRadarStrings.width
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveRadarMod {
  
  @JSImport("@nivo/radar/dist/types/ResponsiveRadar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveRadar[D /* <: Record[String, Any] */](props: Omit[RadarSvgProps[D], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveRadar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
