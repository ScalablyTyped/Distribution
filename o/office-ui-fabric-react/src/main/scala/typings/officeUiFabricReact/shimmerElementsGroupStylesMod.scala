package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupStyleProps
import typings.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerElementsGroupStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer/ShimmerElementsGroup/ShimmerElementsGroup.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IShimmerElementsGroupStyleProps): IShimmerElementsGroupStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmerElementsGroupStyles]
}
