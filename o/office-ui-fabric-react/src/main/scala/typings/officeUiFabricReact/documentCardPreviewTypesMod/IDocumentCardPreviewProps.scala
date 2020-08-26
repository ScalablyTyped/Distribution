package typings.officeUiFabricReact.documentCardPreviewTypesMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardPreviewProps
  extends IBaseProps[js.Object] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  @JSName("componentRef")
  var componentRef_IDocumentCardPreviewProps: js.UndefOr[IRefObject[IDocumentCardPreview]] = js.native
  /**
    * The function return string that will describe the number of overflow documents.
    * such as  (overflowCount: number) =\> `+${ overflowCount } more`,
    */
  var getOverflowDocumentCountText: js.UndefOr[js.Function1[/* overflowCount */ Double, String]] = js.native
  /**
    * One or more preview images to display.
    */
  var previewImages: js.Array[IDocumentCardPreviewImage] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]
  ] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IDocumentCardPreviewProps {
  @scala.inline
  def apply(previewImages: js.Array[IDocumentCardPreviewImage]): IDocumentCardPreviewProps = {
    val __obj = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardPreviewProps]
  }
  @scala.inline
  implicit class IDocumentCardPreviewPropsOps[Self <: IDocumentCardPreviewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreviewImagesVarargs(value: IDocumentCardPreviewImage*): Self = this.set("previewImages", js.Array(value :_*))
    @scala.inline
    def setPreviewImages(value: js.Array[IDocumentCardPreviewImage]): Self = this.set("previewImages", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardPreview | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardPreview]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setGetOverflowDocumentCountText(value: /* overflowCount */ Double => String): Self = this.set("getOverflowDocumentCountText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetOverflowDocumentCountText: Self = this.set("getOverflowDocumentCountText", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDocumentCardPreviewStyleProps => DeepPartial[IDocumentCardPreviewStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

