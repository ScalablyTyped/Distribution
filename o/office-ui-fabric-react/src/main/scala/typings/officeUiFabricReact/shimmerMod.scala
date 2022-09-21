package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleProps
import typings.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import typings.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import typings.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineProps
import typings.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "Shimmer")
  @js.native
  val Shimmer: FunctionComponent[IShimmerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerBase")
  @js.native
  open class ShimmerBase protected ()
    extends typings.officeUiFabricReact.shimmerBaseMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  /* static members */
  object ShimmerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerBase.defaultProps")
    @js.native
    def defaultProps: IShimmerProps = js.native
    inline def defaultProps_=(x: IShimmerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerCircle")
  @js.native
  val ShimmerCircle: FunctionComponent[IShimmerCircleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerCircleBase")
  @js.native
  val ShimmerCircleBase: FunctionComponent[IShimmerCircleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementType")
  @js.native
  object ShimmerElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType & Double] = js.native
    
    /* 2 */ val circle: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.circle & Double = js.native
    
    /* 3 */ val gap: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.gap & Double = js.native
    
    /* 1 */ val line: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.line & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementsDefaultHeights")
  @js.native
  object ShimmerElementsDefaultHeights extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights & Double
      ] = js.native
    
    /* 24 */ val circle: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.circle & Double = js.native
    
    /* 16 */ val gap: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.gap & Double = js.native
    
    /* 16 */ val line: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.line & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementsGroup")
  @js.native
  val ShimmerElementsGroup: FunctionComponent[IShimmerElementsGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerElementsGroupBase")
  @js.native
  val ShimmerElementsGroupBase: FunctionComponent[IShimmerElementsGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerGap")
  @js.native
  val ShimmerGap: FunctionComponent[IShimmerGapProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerGapBase")
  @js.native
  val ShimmerGapBase: FunctionComponent[IShimmerGapProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerLine")
  @js.native
  val ShimmerLine: FunctionComponent[IShimmerLineProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Shimmer", "ShimmerLineBase")
  @js.native
  val ShimmerLineBase: FunctionComponent[IShimmerLineProps] = js.native
}
