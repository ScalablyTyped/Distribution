package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalStyleProps
import typings.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsModalModalDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Modal/Modal.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Modal/Modal.styles", "animationDuration")
  @js.native
  val animationDuration: String = js.native
  
  inline def getStyles(props: IModalStyleProps): IModalStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IModalStyles]
}
