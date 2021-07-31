package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.interfacesMod.IRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getColorFromRGBAMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/getColorFromRGBA", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getColorFromRGBA(rgba: IRGB): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromRGBA")(rgba.asInstanceOf[js.Any]).asInstanceOf[IColor]
}
