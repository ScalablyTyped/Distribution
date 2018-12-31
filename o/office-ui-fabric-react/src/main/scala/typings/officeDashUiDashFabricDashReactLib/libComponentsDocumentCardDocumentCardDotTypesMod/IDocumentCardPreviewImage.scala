package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewImage extends js.Object {
  /**
    * Hex color value of the line below the preview, which should correspond to the document type.
    *
    * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
    * @deprecated To be removed at v5.0.0.
    */
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  /**
    * Deprecated at v1.3.6, to be removed at \>= v2.0.0.
    * @deprecated To be removed at v2.0.0.
    */
  var errorImageSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If provided, forces the preview image to be this height.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path to the icon associated with this document type.
    *
    */
  var iconSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to determine how to size the image to fit the dimensions of the component.
    * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
    */
  var imageFit: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageFit] = js.undefined
  /**
    * Props to pass to Link component
    */
  var linkProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsLinkLinkDotTypesMod.ILinkProps] = js.undefined
  /**
    * File name for the document this preview represents.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The props for the preview icon container classname.
    * If provided, icon container classname will be used..
    */
  var previewIconContainerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The props for the preview icon.
    * If provided, icon will be rendered instead of image.
    */
  var previewIconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
    * Path to the preview image.
    */
  var previewImageSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to view the file.
    * @deprecated Use `href` inside of `linkProps` instead.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If provided, forces the preview image to be this width.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

