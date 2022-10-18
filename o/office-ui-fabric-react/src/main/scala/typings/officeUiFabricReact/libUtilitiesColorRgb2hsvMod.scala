package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesColorInterfacesMod.IHSV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesColorRgb2hsvMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/rgb2hsv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rgb2hsv(r: Double, g: Double, b: Double): IHSV = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsv")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[IHSV]
}
