package typings.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import typings.uifabricUtilities.customizerTypesMod.ICustomizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamsCustomizationsMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/customizations/TeamsCustomizations", JSImport.Default)
  @js.native
  val default: ICustomizerProps = js.native
  
  @JSImport("office-ui-fabric-react/lib/customizations/TeamsCustomizations", "TeamsCustomizations")
  @js.native
  val TeamsCustomizations: ICustomizerProps = js.native
  
  type _To = ICustomizerProps
  
  /* This means you don't have to write `default`, but can instead just say `teamsCustomizationsMod.foo` */
  override def _to: ICustomizerProps = default
}
