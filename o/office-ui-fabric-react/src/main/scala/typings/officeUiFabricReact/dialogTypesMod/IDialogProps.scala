package typings.officeUiFabricReact.dialogTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.dialogBaseMod.DialogBase
import typings.officeUiFabricReact.dialogContentTypesMod.DialogType
import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typings.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.modalTypesMod.IModalProps
import typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.irawstylebaseMod.ICSSPixelUnitRule
import typings.uifabricMergeStyles.irawstylebaseMod.ICSSRule
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogProps
  extends ClassAttributes[DialogBase]
     with IWithResponsiveModeState
     with IAccessiblePopupProps {
  
  /**
    * Optional id for aria-DescribedBy
    * @deprecated Pass through via `modalProps.subtitleAriaId` instead.
    */
  var ariaDescribedById: js.UndefOr[String] = js.native
  
  /**
    * Optional id for aria-LabelledBy
    * @deprecated Pass through via `modalProps.titleAriaId` instead.
    */
  var ariaLabelledById: js.UndefOr[String] = js.native
  
  /**
    * Optional class name to be added to the root class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IDialog interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    * @deprecated Unused, returns no value
    */
  var componentRef: js.UndefOr[IRefObject[IDialog]] = js.native
  
  /**
    * Optional override for container class
    * @deprecated Pass through via `modalProps.className` instead
    */
  var containerClassName: js.UndefOr[String] = js.native
  
  /**
    * Optional override content class
    * @deprecated Pass through via `dialogContentProps` instead as `className`.
    */
  var contentClassName: js.UndefOr[String] = js.native
  
  /**
    * Props to be passed through to Dialog Content
    */
  var dialogContentProps: js.UndefOr[IDialogContentProps] = js.native
  
  /**
    * Whether the dialog is hidden.
    * @defaultvalue true
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
    * @defaultvalue false
    * @deprecated Pass through via `modalProps` instead
    */
  var isBlocking: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the overlay is dark themed.
    * @defaultvalue true
    * @deprecated Pass through via `modalProps` instead
    */
  var isDarkOverlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the dialog is displayed.
    * Deprecated, use `hidden` instead.
    * @defaultvalue false
    * @deprecated Use `hidden` instead
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the maximum width for the dialog. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  
  /**
    * Sets the minimum width of the dialog. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  
  /**
    * Props to be passed through to Modal
    */
  var modalProps: js.UndefOr[IModalProps] = js.native
  
  /**
    * A callback function for when the Dialog is dismissed from the close button or light dismiss.
    * Can also be specified separately in content and modal.
    */
  var onDismiss: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], _]
  ] = js.native
  
  /**
    * A callback function which is called after the Dialog is dismissed and the animation is complete.
    * @deprecated Pass through via `modalProps` instead
    */
  var onDismissed: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * A callback function for when the Dialog content is mounted on the overlay layer
    * @deprecated Pass through via `modalProps.layerProps` instead
    */
  var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Deprecated at 0.81.2, use `onLayerDidMount` instead.
    * @deprecated Use `onLayerDidMount` instead.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]] = js.native
  
  /**
    * The subtext to display in the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var subText: js.UndefOr[String] = js.native
  
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * The title text to display at the top of the dialog.
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var title: js.UndefOr[String | Element] = js.native
  
  /**
    * Other top buttons that will show up next to the close button
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.native
  
  /**
    * The type of Dialog to display.
    * @defaultvalue DialogType.normal
    * @deprecated Pass through via `dialogContentProps` instead.
    */
  var `type`: js.UndefOr[DialogType] = js.native
}
object IDialogProps {
  
  @scala.inline
  def apply(): IDialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogProps]
  }
  
  @scala.inline
  implicit class IDialogPropsOps[Self <: IDialogProps] (val x: Self) extends AnyVal {
    
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
    def setAriaDescribedById(value: String): Self = this.set("ariaDescribedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedById: Self = this.set("ariaDescribedById", js.undefined)
    
    @scala.inline
    def setAriaLabelledById(value: String): Self = this.set("ariaLabelledById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledById: Self = this.set("ariaLabelledById", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDialog | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IDialog]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setDialogContentProps(value: IDialogContentProps): Self = this.set("dialogContentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogContentProps: Self = this.set("dialogContentProps", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIsBlocking(value: Boolean): Self = this.set("isBlocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBlocking: Self = this.set("isBlocking", js.undefined)
    
    @scala.inline
    def setIsDarkOverlay(value: Boolean): Self = this.set("isDarkOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDarkOverlay: Self = this.set("isDarkOverlay", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: ICSSRule | ICSSPixelUnitRule): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setModalProps(value: IModalProps): Self = this.set("modalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalProps: Self = this.set("modalProps", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnDismissed(value: () => _): Self = this.set("onDismissed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismissed: Self = this.set("onDismissed", js.undefined)
    
    @scala.inline
    def setOnLayerDidMount(value: () => Unit): Self = this.set("onLayerDidMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLayerDidMount: Self = this.set("onLayerDidMount", js.undefined)
    
    @scala.inline
    def setOnLayerMounted(value: () => Unit): Self = this.set("onLayerMounted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLayerMounted: Self = this.set("onLayerMounted", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDialogStyleProps => DeepPartial[IDialogStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubText(value: String): Self = this.set("subText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubText: Self = this.set("subText", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Element): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
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
