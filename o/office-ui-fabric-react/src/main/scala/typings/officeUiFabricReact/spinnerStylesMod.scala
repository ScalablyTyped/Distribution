package typings.officeUiFabricReact

import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerStyleProps
import typings.officeUiFabricReact.spinnerTypesMod.ISpinnerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ISpinnerStyleProps): ISpinnerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISpinnerStyles]
}
