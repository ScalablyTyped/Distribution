package typings.officeUiFabricReact

import typings.officeUiFabricReact.ratingTypesMod.IRatingProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Rating", "Rating")
  @js.native
  val Rating: FunctionComponent[IRatingProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Rating", "RatingBase")
  @js.native
  class RatingBase protected ()
    extends typings.officeUiFabricReact.ratingBaseMod.RatingBase {
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
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.ratingTypesMod.RatingSize & Double] = js.native
    
    /* 1 */ val Large: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Large & Double = js.native
    
    /* 0 */ val Small: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Small & Double = js.native
  }
}
