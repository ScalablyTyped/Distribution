package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsv2rgbMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/hsv2rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hsv2rgb(h: Double, s: Double, v: Double): IRGB = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[IRGB]
}
