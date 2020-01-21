package typings.officeUiFabricReact.imageBaseMod

import typings.officeUiFabricReact.AnonShouldFadeIn
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
@js.native
class ImageBase protected ()
  extends Component[IImageProps, IImageState, js.Any] {
  def this(props: IImageProps) = this()
  var _checkImageLoaded: js.Any = js.native
  var _computeCoverStyle: js.Any = js.native
  var _coverStyle: js.Any = js.native
  var _frameElement: js.Any = js.native
  var _imageElement: js.Any = js.native
  var _onImageError: js.Any = js.native
  var _onImageLoaded: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MImageBase(nextProps: IImageProps): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MImageBase(prevProps: IImageProps, prevState: IImageState): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
@js.native
object ImageBase extends js.Object {
  var _svgRegex: js.Any = js.native
  var defaultProps: AnonShouldFadeIn = js.native
}

