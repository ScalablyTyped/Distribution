package typings.officeUiFabricReact

import typings.officeUiFabricReact.plainCardTypesMod.IPlainCardStyleProps
import typings.officeUiFabricReact.plainCardTypesMod.IPlainCardStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plainCardStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/PlainCard/PlainCard.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IPlainCardStyleProps): IPlainCardStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IPlainCardStyles]
}
