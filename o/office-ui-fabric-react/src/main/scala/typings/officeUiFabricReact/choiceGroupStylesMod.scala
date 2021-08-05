package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupStyleProps
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IChoiceGroupStyleProps): IChoiceGroupStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IChoiceGroupStyles]
}
