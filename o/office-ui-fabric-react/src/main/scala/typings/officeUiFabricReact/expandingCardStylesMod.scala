package typings.officeUiFabricReact

import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardStyleProps
import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandingCardStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IExpandingCardStyleProps): IExpandingCardStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IExpandingCardStyles]
}
