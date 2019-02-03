package typings
package officeDashUiDashFabricDashReactLib.libComponentsImageImageDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
@js.native
class ImageBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps, 
      IImageState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps) = this()
  var _coverStyle: js.Any = js.native
  var _frameElement: js.Any = js.native
  var _imageElement: js.Any = js.native
  var _onImageError: js.Any = js.native
  var _onImageLoaded: js.Any = js.native
  /* private */ def _checkImageLoaded(): js.Any = js.native
  /* private */ def _computeCoverStyle(props: js.Any): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MImageBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps,
    prevState: IImageState
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MImageBase(nextProps: officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Image/Image.base", "ImageBase")
@js.native
object ImageBase extends js.Object {
  var _svgRegex: js.Any = js.native
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_ShouldFadeIn = js.native
}

