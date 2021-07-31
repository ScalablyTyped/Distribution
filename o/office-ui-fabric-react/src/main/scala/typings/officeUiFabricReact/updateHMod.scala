package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateHMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/updateH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def updateH(color: IColor, h: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateH")(color.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[IColor]
}
