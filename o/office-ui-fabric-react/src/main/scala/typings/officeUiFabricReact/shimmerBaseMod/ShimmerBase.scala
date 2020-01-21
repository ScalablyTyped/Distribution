package typings.officeUiFabricReact.shimmerBaseMod

import typings.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.base", "ShimmerBase")
@js.native
class ShimmerBase protected ()
  extends Component[IShimmerProps, IShimmerState, js.Any] {
  def this(props: IShimmerProps) = this()
  var _async: js.Any = js.native
  var _classNames: js.Any = js.native
  var _lastTimeoutId: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MShimmerBase(prevProps: IShimmerProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MShimmerBase(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Shimmer/Shimmer.base", "ShimmerBase")
@js.native
object ShimmerBase extends js.Object {
  var defaultProps: IShimmerProps = js.native
}

