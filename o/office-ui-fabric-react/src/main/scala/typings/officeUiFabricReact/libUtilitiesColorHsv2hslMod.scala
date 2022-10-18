package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IHSL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesColorHsv2hslMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/hsv2hsl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hsv2hsl(h: Double, s: Double, v: Double): IHSL = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[IHSL]
}
