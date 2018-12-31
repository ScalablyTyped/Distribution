package typings
package officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageProps
  extends reactLib.reactMod.ReactNs.ImgHTMLAttributes[reactLib.HTMLImageElement] {
  /**
    * Optional callback to access the ICheckbox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IImage]] = js.undefined
  /**
    * Specifies the cover style to be used for this image. If not
    * specified, this will be dynamically calculated based on the
    * aspect ratio for the image.
    */
  var coverStyle: js.UndefOr[ImageCoverStyle] = js.undefined
  /**
    * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead and
    * rerender the Image with a difference src.
    * @deprecated Use `onLoadingStateChange` instead and
    * rerender the Image with a difference src.
    */
  var errorSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to determine how the image is scaled and cropped to fit the frame.
    *
    * @defaultvalue If both dimensions are provided, then the image is fit using ImageFit.scale.
    * Otherwise, the image won't be scaled or cropped.
    */
  var imageFit: js.UndefOr[ImageFit] = js.undefined
  /**
    * If true, the image frame will expand to fill its parent container.
    */
  var maximizeFrame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional callback method for when the image load state has changed.
    * The 'loadState' parameter indicates the current state of the Image.
    */
  var onLoadingStateChange: js.UndefOr[js.Function1[/* loadState */ ImageLoadState, scala.Unit]] = js.undefined
  /**
    * If true, fades the image in when loaded.
    * @defaultvalue true
    */
  var shouldFadeIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables shouldFadeIn.
    * @defaultvalue false;
    */
  var shouldStartVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IImageStyleProps, IImageStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

