package typings.officeUiFabricReact.documentCardStatusTypesMod

import typings.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
import typings.react.mod.Props
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardStatusProps extends Props[DocumentCardStatusBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardStatus]] = js.native
  /**
    * Describe status information. Required field.
    */
  var status: String = js.native
  /**
    * Describes DocumentCard status icon.
    */
  var statusIcon: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IDocumentCardStatusProps {
  @scala.inline
  def apply(status: String): IDocumentCardStatusProps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardStatusProps]
  }
  @scala.inline
  implicit class IDocumentCardStatusPropsOps[Self <: IDocumentCardStatusProps] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardStatus | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardStatus]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setStatusIcon(value: String): Self = this.set("statusIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusIcon: Self = this.set("statusIcon", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDocumentCardStatusStyleProps => DeepPartial[IDocumentCardStatusStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

