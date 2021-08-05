package typings.officeUiFabricReact

import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyleProps
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ICheckboxStyleProps): ICheckboxStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICheckboxStyles]
}
