package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardImageDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageFit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardImageProps
  extends IBaseProps[js.Object] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  @JSName("componentRef")
  var componentRef_IDocumentCardImageProps: js.UndefOr[IRefObject[IDocumentCardImage]] = js.undefined
  /**
    * If provided, forces the preview image to be this height.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The props for the icon associated with this document type.
    */
  var iconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Used to determine how to size the image to fit the dimensions of the component.
    * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
    */
  var imageFit: js.UndefOr[ImageFit] = js.undefined
  /**
    * Path to the preview image.
    */
  var imageSrc: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * If provided, forces the preview image to be this width.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IDocumentCardImageProps {
  @scala.inline
  def apply(
    className: String = null,
    componentRef: IRefObject[IDocumentCardImage] = null,
    height: Int | Double = null,
    iconProps: IIconProps = null,
    imageFit: ImageFit = null,
    imageSrc: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles] = null,
    theme: ITheme = null,
    width: Int | Double = null
  ): IDocumentCardImageProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (imageFit != null) __obj.updateDynamic("imageFit")(imageFit)
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardImageProps]
  }
}

