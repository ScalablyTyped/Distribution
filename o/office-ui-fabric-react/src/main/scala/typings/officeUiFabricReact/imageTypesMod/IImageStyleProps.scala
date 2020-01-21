package typings.officeUiFabricReact.imageTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Image height value
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /**
    * ImageFit booleans for center, cover, contain, centerContain, centerCover, none
    */
  var isCenter: js.UndefOr[Boolean] = js.undefined
  var isCenterContain: js.UndefOr[Boolean] = js.undefined
  var isCenterCover: js.UndefOr[Boolean] = js.undefined
  var isContain: js.UndefOr[Boolean] = js.undefined
  var isCover: js.UndefOr[Boolean] = js.undefined
  /**
    * if true image load is in error
    */
  var isError: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the image is coverStyle landscape instead of portrait
    */
  var isLandscape: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the image is loaded
    */
  var isLoaded: js.UndefOr[Boolean] = js.undefined
  var isNone: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, imageFit is undefined
    */
  var isNotImageFit: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the image frame will expand to fill its parent container.
    */
  var maximizeFrame: js.UndefOr[Boolean] = js.undefined
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
    * Accept theme prop.
    */
  var theme: ITheme
  /**
    * Image width value
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object IImageStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    height: Double | String = null,
    isCenter: js.UndefOr[Boolean] = js.undefined,
    isCenterContain: js.UndefOr[Boolean] = js.undefined,
    isCenterCover: js.UndefOr[Boolean] = js.undefined,
    isContain: js.UndefOr[Boolean] = js.undefined,
    isCover: js.UndefOr[Boolean] = js.undefined,
    isError: js.UndefOr[Boolean] = js.undefined,
    isLandscape: js.UndefOr[Boolean] = js.undefined,
    isLoaded: js.UndefOr[Boolean] = js.undefined,
    isNone: js.UndefOr[Boolean] = js.undefined,
    isNotImageFit: js.UndefOr[Boolean] = js.undefined,
    maximizeFrame: js.UndefOr[Boolean] = js.undefined,
    shouldFadeIn: js.UndefOr[Boolean] = js.undefined,
    shouldStartVisible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): IImageStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isCenter)) __obj.updateDynamic("isCenter")(isCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(isCenterContain)) __obj.updateDynamic("isCenterContain")(isCenterContain.asInstanceOf[js.Any])
    if (!js.isUndefined(isCenterCover)) __obj.updateDynamic("isCenterCover")(isCenterCover.asInstanceOf[js.Any])
    if (!js.isUndefined(isContain)) __obj.updateDynamic("isContain")(isContain.asInstanceOf[js.Any])
    if (!js.isUndefined(isCover)) __obj.updateDynamic("isCover")(isCover.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (!js.isUndefined(isLandscape)) __obj.updateDynamic("isLandscape")(isLandscape.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoaded)) __obj.updateDynamic("isLoaded")(isLoaded.asInstanceOf[js.Any])
    if (!js.isUndefined(isNone)) __obj.updateDynamic("isNone")(isNone.asInstanceOf[js.Any])
    if (!js.isUndefined(isNotImageFit)) __obj.updateDynamic("isNotImageFit")(isNotImageFit.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizeFrame)) __obj.updateDynamic("maximizeFrame")(maximizeFrame.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFadeIn)) __obj.updateDynamic("shouldFadeIn")(shouldFadeIn.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStartVisible)) __obj.updateDynamic("shouldStartVisible")(shouldStartVisible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageStyleProps]
  }
}

