package typings.nivoArcs

import typings.nivoArcs.anon.Animated
import typings.nivoArcs.nivoArcsStrings.path
import typings.nivoCore.mod.ExtractProps
import typings.react.mod.global.JSX.Element
import typings.reactSpringWeb.mod.AnimatedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLineMod {
  
  @JSImport("@nivo/arcs/dist/types/ArcLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLine(param0: ArcLineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLine")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcLineProps = Animated & ExtractProps[AnimatedComponent[path]]
}
