package typings.officeUiFabricReact

import typings.officeUiFabricReact.marqueeSelectionTypesMod.IMarqueeSelectionStyleProps
import typings.officeUiFabricReact.marqueeSelectionTypesMod.IMarqueeSelectionStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marqueeSelectionStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MarqueeSelection/MarqueeSelection.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IMarqueeSelectionStyleProps): IMarqueeSelectionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IMarqueeSelectionStyles]
}
