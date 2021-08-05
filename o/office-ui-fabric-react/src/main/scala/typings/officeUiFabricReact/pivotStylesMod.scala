package typings.officeUiFabricReact

import typings.officeUiFabricReact.pivotTypesMod.IPivotStyleProps
import typings.officeUiFabricReact.pivotTypesMod.IPivotStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IPivotStyleProps): IPivotStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPivotStyles]
}
