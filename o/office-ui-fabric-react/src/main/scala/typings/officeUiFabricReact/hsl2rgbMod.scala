package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsl2rgbMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/hsl2rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hsl2rgb(h: Double, s: Double, l: Double): IRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[IRGB]
}
