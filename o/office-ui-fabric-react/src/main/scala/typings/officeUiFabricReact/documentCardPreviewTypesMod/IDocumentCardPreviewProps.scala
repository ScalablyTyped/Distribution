package typings.officeUiFabricReact.documentCardPreviewTypesMod

import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardPreviewProps
  extends IBaseProps[js.Object] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  @JSName("componentRef")
  var componentRef_IDocumentCardPreviewProps: js.UndefOr[IRefObject[IDocumentCardPreview]] = js.undefined
  /**
    * The function return string that will describe the number of overflow documents.
    * such as  (overflowCount: number) =\> `+${ overflowCount } more`,
    */
  var getOverflowDocumentCountText: js.UndefOr[js.Function1[/* overflowCount */ Double, String]] = js.undefined
  /**
    * One or more preview images to display.
    */
  var previewImages: js.Array[IDocumentCardPreviewImage]
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDocumentCardPreviewProps {
  @scala.inline
  def apply(
    previewImages: js.Array[IDocumentCardPreviewImage],
    className: String = null,
    componentRef: IRefObject[IDocumentCardPreview] = null,
    getOverflowDocumentCountText: /* overflowCount */ Double => String = null,
    styles: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles] = null,
    theme: ITheme = null
  ): IDocumentCardPreviewProps = {
    val __obj = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getOverflowDocumentCountText != null) __obj.updateDynamic("getOverflowDocumentCountText")(js.Any.fromFunction1(getOverflowDocumentCountText))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewProps]
  }
}

