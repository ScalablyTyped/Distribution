package typings.officeUiFabricReact

import typings.officeUiFabricReact.ratingTypesMod.IRatingProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Rating", JSImport.Namespace)
@js.native
object libRatingMod extends js.Object {
  
  val Rating: FunctionComponent[IRatingProps] = js.native
  
  @js.native
  class RatingBase protected ()
    extends typings.officeUiFabricReact.ratingMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  /* static members */
  @js.native
  object RatingBase extends js.Object {
    
    var defaultProps: IRatingProps = js.native
  }
  
  @js.native
  object RatingSize extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.ratingTypesMod.RatingSize with Double] = js.native
    
    /* 1 */ val Large: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Large with Double = js.native
    
    /* 0 */ val Small: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Small with Double = js.native
  }
}
