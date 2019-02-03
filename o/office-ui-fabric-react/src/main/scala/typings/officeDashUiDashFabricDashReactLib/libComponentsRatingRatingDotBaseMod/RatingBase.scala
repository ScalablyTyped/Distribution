package typings
package officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Rating/Rating.base", "RatingBase")
@js.native
class RatingBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.IRatingProps, 
      IRatingState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.IRatingProps) = this()
  var _classNames: js.Any = js.native
  var _id: js.Any = js.native
  var _labelId: js.Any = js.native
  var _min: js.Any = js.native
  /* private */ def _getClampedRating(rating: js.Any): js.Any = js.native
  /* private */ def _getFillingPercentage(starPosition: js.Any): js.Any = js.native
  /* private */ def _getInitialValue(props: js.Any): js.Any = js.native
  /* private */ def _getLabel(rating: js.Any): js.Any = js.native
  /* private */ def _getStarId(index: js.Any): js.Any = js.native
  /* private */ def _onFocus(value: js.Any, ev: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MRatingBase(nextProps: officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.IRatingProps): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Rating/Rating.base", "RatingBase")
@js.native
object RatingBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsRatingRatingDotTypesMod.IRatingProps = js.native
}

