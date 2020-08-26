package typings.officeUiFabricReact.documentCardLocationTypesMod

import typings.officeUiFabricReact.documentCardLocationBaseMod.DocumentCardLocationBase
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardLocationProps extends ClassAttributes[DocumentCardLocationBase] {
  /**
    * Aria label for the link to the document location.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardLocation]] = js.native
  /**
    * Text for the location of the document.
    */
  var location: String = js.native
  /**
    * URL to navigate to for this location.
    */
  var locationHref: js.UndefOr[String] = js.native
  /**
    * Function to call when the location is clicked.
    */
  var onClick: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]
  ] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IDocumentCardLocationProps {
  @scala.inline
  def apply(location: String): IDocumentCardLocationProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardLocationProps]
  }
  @scala.inline
  implicit class IDocumentCardLocationPropsOps[Self <: IDocumentCardLocationProps] (val x: Self) extends AnyVal {
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardLocation | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardLocation]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setLocationHref(value: String): Self = this.set("locationHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationHref: Self = this.set("locationHref", js.undefined)
    @scala.inline
    def setOnClick(value: /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDocumentCardLocationStyleProps => DeepPartial[IDocumentCardLocationStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

