package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapStyleProps
import typings.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerGapStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/ShimmerGap/ShimmerGap.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IShimmerGapStyleProps): IShimmerGapStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmerGapStyles]
}
