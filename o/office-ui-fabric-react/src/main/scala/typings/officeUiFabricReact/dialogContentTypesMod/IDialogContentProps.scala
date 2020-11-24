package typings.officeUiFabricReact.dialogContentTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.dialogContentBaseMod.DialogContentBase
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogContentProps extends ClassAttributes[DialogContentBase] {
  
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Label to be passed to to aria-label of close button
    * @defaultvalue Close
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IDialogContent interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IDialogContent]] = js.native
  
  /**
    * The classname for when the header is draggable
    */
  var draggableHeaderClassName: js.UndefOr[String] = js.native
  
  /**
    * Is inside a multiline wrapper
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback for when the Dialog is dismissed from the close button or light dismiss, before the animation completes.
    */
  var onDismiss: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], _]
  ] = js.native
  
  /**
    * Responsive mode passed in from decorator.
    */
  var responsiveMode: js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode] = js.native
  
  /**
    * Show an 'x' close button in the upper-right corner
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]] = js.native
  
  /**
    * The subtext to display in the dialog
    */
  var subText: js.UndefOr[String] = js.native
  
  /**
    * The Id for subText container
    */
  var subTextId: js.UndefOr[String] = js.native
  
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * The title text to display at the top of the dialog.
    */
  var title: js.UndefOr[String | Element] = js.native
  
  /**
    * The Id for title container
    *
    * @deprecated use the `id` attribute in `titleProps` instead.
    */
  var titleId: js.UndefOr[String] = js.native
  
  /**
    * The props for title container.
    */
  var titleProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  /**
    * Other top buttons that will show up next to the close button
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.native
  
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    */
  var `type`: js.UndefOr[DialogType] = js.native
}
object IDialogContentProps {
  
  @scala.inline
  def apply(): IDialogContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogContentProps]
  }
  
  @scala.inline
  implicit class IDialogContentPropsOps[Self <: IDialogContentProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDialogContent | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IDialogContent]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDraggableHeaderClassName(value: String): Self = this.set("draggableHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableHeaderClassName: Self = this.set("draggableHeaderClassName", js.undefined)
    
    @scala.inline
    def setIsMultiline(value: Boolean): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiline: Self = this.set("isMultiline", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setResponsiveMode(value: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode): Self = this.set("responsiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveMode: Self = this.set("responsiveMode", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDialogContentStyleProps => DeepPartial[IDialogContentStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubText(value: String): Self = this.set("subText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubText: Self = this.set("subText", js.undefined)
    
    @scala.inline
    def setSubTextId(value: String): Self = this.set("subTextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTextId: Self = this.set("subTextId", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Element): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleId(value: String): Self = this.set("titleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleId: Self = this.set("titleId", js.undefined)
    
    @scala.inline
    def setTitleProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    
    @scala.inline
    def setTopButtonsPropsVarargs(value: IButtonProps*): Self = this.set("topButtonsProps", js.Array(value :_*))
    
    @scala.inline
    def setTopButtonsProps(value: js.Array[IButtonProps]): Self = this.set("topButtonsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopButtonsProps: Self = this.set("topButtonsProps", js.undefined)
    
    @scala.inline
    def setType(value: DialogType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
