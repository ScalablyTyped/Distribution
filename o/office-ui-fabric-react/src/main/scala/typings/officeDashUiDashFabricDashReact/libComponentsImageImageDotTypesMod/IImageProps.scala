package typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.react.reactMod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageProps extends ImgHTMLAttributes[HTMLImageElement] {
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
  var errorSrc: js.UndefOr[String] = js.undefined
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
  var maximizeFrame: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback method for when the image load state has changed.
    * The 'loadState' parameter indicates the current state of the Image.
    */
  var onLoadingStateChange: js.UndefOr[js.Function1[/* loadState */ ImageLoadState, Unit]] = js.undefined
  /**
    * If true, fades the image in when loaded.
    * @defaultvalue true
    */
  var shouldFadeIn: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables shouldFadeIn.
    * @defaultvalue false;
    */
  var shouldStartVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IImageStyleProps, IImageStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IImageProps {
  @scala.inline
  def apply(
    ImgHTMLAttributes: ImgHTMLAttributes[HTMLImageElement] = null,
    className: String = null,
    coverStyle: ImageCoverStyle = null,
    errorSrc: String = null,
    imageFit: ImageFit = null,
    maximizeFrame: js.UndefOr[Boolean] = js.undefined,
    onLoadingStateChange: /* loadState */ ImageLoadState => Unit = null,
    shouldFadeIn: js.UndefOr[Boolean] = js.undefined,
    shouldStartVisible: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IImageStyleProps, IImageStyles] = null,
    theme: ITheme = null
  ): IImageProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ImgHTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (coverStyle != null) __obj.updateDynamic("coverStyle")(coverStyle)
    if (errorSrc != null) __obj.updateDynamic("errorSrc")(errorSrc)
    if (imageFit != null) __obj.updateDynamic("imageFit")(imageFit)
    if (!js.isUndefined(maximizeFrame)) __obj.updateDynamic("maximizeFrame")(maximizeFrame)
    if (onLoadingStateChange != null) __obj.updateDynamic("onLoadingStateChange")(js.Any.fromFunction1(onLoadingStateChange))
    if (!js.isUndefined(shouldFadeIn)) __obj.updateDynamic("shouldFadeIn")(shouldFadeIn)
    if (!js.isUndefined(shouldStartVisible)) __obj.updateDynamic("shouldStartVisible")(shouldStartVisible)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IImageProps]
  }
}

