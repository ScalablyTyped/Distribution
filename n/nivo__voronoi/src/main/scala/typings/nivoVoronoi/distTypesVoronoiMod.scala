package typings.nivoVoronoi

import typings.nivoVoronoi.anon.PartialOmitVoronoiSvgProp
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVoronoiMod {
  
  @JSImport("@nivo/voronoi/dist/types/Voronoi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Voronoi(hasThemeOtherProps: PartialOmitVoronoiSvgProp): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Voronoi")(hasThemeOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
