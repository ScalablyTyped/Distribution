package typings.officeUiFabricReact

import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calloutContentStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: ICalloutContentStyleProps): ICalloutContentStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ICalloutContentStyles]
}
