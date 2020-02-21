package typings.officeUiFabricReact

import typings.officeUiFabricReact.ratingTypesMod.IRatingProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Rating", JSImport.Namespace)
@js.native
object libRatingMod extends js.Object {
  @js.native
  class RatingBase protected ()
    extends typings.officeUiFabricReact.ratingMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  
  val Rating: FunctionComponent[IRatingProps] = js.native
  /* static members */
  @js.native
  object RatingBase extends js.Object {
    var defaultProps: IRatingProps = js.native
  }
  
  @js.native
  object RatingSize extends js.Object {
    /* 1 */ val Large: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Large with Double = js.native
    /* 0 */ val Small: typings.officeUiFabricReact.ratingTypesMod.RatingSize.Small with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.ratingTypesMod.RatingSize with Double] = js.native
  }
  
}

