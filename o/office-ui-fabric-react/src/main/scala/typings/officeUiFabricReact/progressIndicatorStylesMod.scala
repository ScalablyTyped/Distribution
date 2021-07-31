package typings.officeUiFabricReact

import typings.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyleProps
import typings.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IProgressIndicatorStyleProps): IProgressIndicatorStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IProgressIndicatorStyles]
}
