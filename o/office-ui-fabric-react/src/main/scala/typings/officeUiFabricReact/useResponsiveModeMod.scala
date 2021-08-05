package typings.officeUiFabricReact

import typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResponsiveModeMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/hooks/useResponsiveMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResponsiveMode(elementRef: RefObject[HTMLElement | Null]): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveMode")(elementRef.asInstanceOf[js.Any]).asInstanceOf[ResponsiveMode]
}
