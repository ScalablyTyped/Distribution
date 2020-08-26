package typings.officeUiFabricReact.documentCardTitleTypesMod

import typings.officeUiFabricReact.documentCardTitleBaseMod.DocumentCardTitleBase
import typings.react.mod.ClassAttributes
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardTitleProps extends ClassAttributes[DocumentCardTitleBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardTitle]] = js.native
  /**
    * Whether we truncate the title to fit within the box. May have a performance impact.
    * @defaultvalue true
    */
  var shouldTruncate: js.UndefOr[Boolean] = js.native
  /**
    * Whether show as title as secondary title style such as smaller font and lighter color.
    * @defaultvalue false
    */
  var showAsSecondaryTitle: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Title text.
    * If the card represents more than one document, this should be the title of one document and a "+X" string.
    * For example, a collection of four documents would have a string of "Document.docx +3".
    */
  var title: String = js.native
}

object IDocumentCardTitleProps {
  @scala.inline
  def apply(title: String): IDocumentCardTitleProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleProps]
  }
  @scala.inline
  implicit class IDocumentCardTitlePropsOps[Self <: IDocumentCardTitleProps] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardTitle | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardTitle]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setShouldTruncate(value: Boolean): Self = this.set("shouldTruncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldTruncate: Self = this.set("shouldTruncate", js.undefined)
    @scala.inline
    def setShowAsSecondaryTitle(value: Boolean): Self = this.set("showAsSecondaryTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAsSecondaryTitle: Self = this.set("showAsSecondaryTitle", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDocumentCardTitleStyleProps => DeepPartial[IDocumentCardTitleStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

