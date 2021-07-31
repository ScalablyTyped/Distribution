package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsv2hexMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/hsv2hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hsv2hex(h: Double, s: Double, v: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2hex")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[String]
}
