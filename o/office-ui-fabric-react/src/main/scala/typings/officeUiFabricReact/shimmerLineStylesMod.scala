package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineStyleProps
import typings.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerLineStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/ShimmerLine/ShimmerLine.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IShimmerLineStyleProps): IShimmerLineStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmerLineStyles]
}
