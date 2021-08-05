package typings.officeUiFabricReact

import typings.officeUiFabricReact.separatorTypesMod.ISeparatorStyleProps
import typings.officeUiFabricReact.separatorTypesMod.ISeparatorStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separatorStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Separator/Separator.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ISeparatorStyleProps): ISeparatorStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISeparatorStyles]
}
