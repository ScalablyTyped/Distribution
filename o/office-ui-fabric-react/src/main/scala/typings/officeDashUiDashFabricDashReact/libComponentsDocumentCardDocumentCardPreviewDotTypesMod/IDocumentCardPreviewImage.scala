package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardPreviewDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit
import typings.officeDashUiDashFabricDashReact.libComponentsLinkLinkDotTypesMod.ILinkProps
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
  var accentColor: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  /**
    * Deprecated at v1.3.6, to be removed at \>= v2.0.0.
    * @deprecated To be removed at v2.0.0.
    */
  var errorImageSrc: js.UndefOr[String] = js.undefined
  /**
    * If provided, forces the preview image to be this height.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Path to the icon associated with this document type.
    *
    */
  var iconSrc: js.UndefOr[String] = js.undefined
  /**
    * Used to determine how to size the image to fit the dimensions of the component.
    * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
    */
  var imageFit: js.UndefOr[ImageFit] = js.undefined
  /**
    * Props to pass to Link component
    */
  var linkProps: js.UndefOr[ILinkProps] = js.undefined
  /**
    * File name for the document this preview represents.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The props for the preview icon container classname.
    * If provided, icon container classname will be used..
    */
  var previewIconContainerClass: js.UndefOr[String] = js.undefined
  /**
    * The props for the preview icon.
    * If provided, icon will be rendered instead of image.
    */
  var previewIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Path to the preview image.
    */
  var previewImageSrc: js.UndefOr[String] = js.undefined
  /**
    * URL to view the file.
    * @deprecated Use `href` inside of `linkProps` instead.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * If provided, forces the preview image to be this width.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IDocumentCardPreviewImage {
  @scala.inline
  def apply(
    accentColor: String = null,
    componentRef: IRefObject[js.Object] = null,
    errorImageSrc: String = null,
    height: Int | Double = null,
    iconSrc: String = null,
    imageFit: ImageFit = null,
    linkProps: ILinkProps = null,
    name: String = null,
    previewIconContainerClass: String = null,
    previewIconProps: IIconProps = null,
    previewImageSrc: String = null,
    url: String = null,
    width: Int | Double = null
  ): IDocumentCardPreviewImage = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (errorImageSrc != null) __obj.updateDynamic("errorImageSrc")(errorImageSrc.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconSrc != null) __obj.updateDynamic("iconSrc")(iconSrc.asInstanceOf[js.Any])
    if (imageFit != null) __obj.updateDynamic("imageFit")(imageFit.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (previewIconContainerClass != null) __obj.updateDynamic("previewIconContainerClass")(previewIconContainerClass.asInstanceOf[js.Any])
    if (previewIconProps != null) __obj.updateDynamic("previewIconProps")(previewIconProps.asInstanceOf[js.Any])
    if (previewImageSrc != null) __obj.updateDynamic("previewImageSrc")(previewImageSrc.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewImage]
  }
}

