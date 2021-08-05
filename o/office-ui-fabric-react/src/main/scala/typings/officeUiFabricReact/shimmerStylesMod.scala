package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerTypesMod.IShimmerStyleProps
import typings.officeUiFabricReact.shimmerTypesMod.IShimmerStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IShimmerStyleProps): IShimmerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmerStyles]
}
