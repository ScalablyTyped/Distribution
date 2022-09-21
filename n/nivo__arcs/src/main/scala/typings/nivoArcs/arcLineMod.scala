package typings.nivoArcs

import typings.nivoArcs.anon.Animated
import typings.nivoCore.mod.ExtractProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcLineMod {
  
  @JSImport("@nivo/arcs/dist/types/ArcLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLine(hasAnimatedPropsRest: ArcLineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLine")(hasAnimatedPropsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcLineProps = Animated & (ExtractProps[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof animated.path */ Any
  ])
}
