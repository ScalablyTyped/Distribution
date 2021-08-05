package typings.officeUiFabricReact

import typings.officeUiFabricReact.labelTypesMod.ILabelStyleProps
import typings.officeUiFabricReact.labelTypesMod.ILabelStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Label/Label.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ILabelStyleProps): ILabelStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ILabelStyles]
}
