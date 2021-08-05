package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssColorMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/cssColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cssColor(): js.UndefOr[IRGB] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssColor")().asInstanceOf[js.UndefOr[IRGB]]
  inline def cssColor(color: String): js.UndefOr[IRGB] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssColor")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRGB]]
}
