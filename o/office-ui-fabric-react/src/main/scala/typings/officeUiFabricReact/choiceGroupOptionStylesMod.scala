package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyleProps
import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupOptionStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IChoiceGroupOptionStyleProps): IChoiceGroupOptionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IChoiceGroupOptionStyles]
}
