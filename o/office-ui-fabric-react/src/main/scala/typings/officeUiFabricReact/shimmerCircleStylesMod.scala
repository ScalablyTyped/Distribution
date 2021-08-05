package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleStyleProps
import typings.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerCircleStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/ShimmerCircle/ShimmerCircle.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IShimmerCircleStyleProps): IShimmerCircleStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmerCircleStyles]
}
