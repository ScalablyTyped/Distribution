package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.b
import typings.officeUiFabricReact.officeUiFabricReactStrings.g
import typings.officeUiFabricReact.officeUiFabricReactStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateRGBMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/updateRGB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateRGB(color: IColor, component: r | g | b | a, value: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IColor]
}
