package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.IRatingProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Rating", JSImport.Namespace)
@js.native
object libRatingMod extends js.Object {
  @js.native
  class RatingBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsRatingMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  
  val Rating: StatelessComponent[IRatingProps] = js.native
  /* static members */
  @js.native
  object RatingBase extends js.Object {
    var defaultProps: IRatingProps = js.native
  }
  
  @js.native
  object RatingSize extends js.Object {
    /* 1 */ val Large: typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize.Large with Double = js.native
    /* 0 */ val Small: typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize.Small with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsRatingRatingDotTypesMod.RatingSize with Double
      ] = js.native
  }
  
}

