package typings.officeUiFabricReact.documentCardActionsTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
import typings.react.mod.ClassAttributes
import typings.std.Number
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardActionsProps extends ClassAttributes[DocumentCardActionsBase] {
  /**
    * The actions available for this document.
    */
  var actions: js.Array[IButtonProps] = js.native
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardActions]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]
  ] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * The number of views this document has received.
    */
  var views: js.UndefOr[Number] = js.native
}

object IDocumentCardActionsProps {
  @scala.inline
  def apply(actions: js.Array[IButtonProps]): IDocumentCardActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActionsProps]
  }
  @scala.inline
  implicit class IDocumentCardActionsPropsOps[Self <: IDocumentCardActionsProps] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: IButtonProps*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[IButtonProps]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardActions | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardActions]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IDocumentCardActionsStyleProps => DeepPartial[IDocumentCardActionsStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setViews(value: Number): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

