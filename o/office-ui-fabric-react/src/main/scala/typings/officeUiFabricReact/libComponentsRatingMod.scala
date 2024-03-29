package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.IRatingProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRatingMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Rating", "Rating")
  @js.native
  val Rating: FunctionComponent[IRatingProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Rating", "RatingBase")
  @js.native
  open class RatingBase protected ()
    extends typings.officeUiFabricReact.libComponentsRatingRatingDotbaseMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  /* static members */
  object RatingBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Rating", "RatingBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Rating", "RatingBase.defaultProps")
    @js.native
    def defaultProps: IRatingProps = js.native
    inline def defaultProps_=(x: IRatingProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Rating", "RatingSize")
  @js.native
  object RatingSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize & Double
      ] = js.native
    
    /* 1 */ val Large: typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize.Large & Double = js.native
    
    /* 0 */ val Small: typings.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize.Small & Double = js.native
  }
}
