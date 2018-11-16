package typings
package officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IImageStyleProps extends js.Object {
  /**
       * Accept custom classNames
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Image height valye
       */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
       * ImageFit booleans for center, cover, contain, centerCover, none
       */
  var isCenter: js.UndefOr[scala.Boolean] = js.undefined
  var isCenterCover: js.UndefOr[scala.Boolean] = js.undefined
  var isContain: js.UndefOr[scala.Boolean] = js.undefined
  var isCover: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * if true image load is in error
       */
  var isError: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true the image is coverStyle landscape instead of portrait
       */
  var isLandscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, the image is loaded
       */
  var isLoaded: js.UndefOr[scala.Boolean] = js.undefined
  var isNone: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * if true, imageFit is undefined
       */
  var isNotImageFit: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, the image frame will expand to fill its parent container.
       */
  var maximizeFrame: js.UndefOr[scala.Boolean] = js.undefined
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
       * Accept theme prop.
       */
  var theme: atUifabricStylingLib.libInterfacesIThemeMod.ITheme
  /**
       * Image width valye
       */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

