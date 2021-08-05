package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IHSV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsl2hsvMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/hsl2hsv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hsl2hsv(h: Double, s: Double, l: Double): IHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2hsv")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IHSV]
}
