package typings.officeUiFabricReact

import typings.uifabricStyling.iconsMod.IIconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconsMod {
  
  @JSImport("office-ui-fabric-react/lib/Icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeIcons(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")().asInstanceOf[Unit]
  inline def initializeIcons(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initializeIcons(baseUrl: String, options: IIconOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initializeIcons(baseUrl: Unit, options: IIconOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeIcons")(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
