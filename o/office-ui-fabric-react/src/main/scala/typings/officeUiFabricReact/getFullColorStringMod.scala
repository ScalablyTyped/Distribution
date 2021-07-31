package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFullColorStringMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/getFullColorString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFullColorString(color: IColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullColorString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
