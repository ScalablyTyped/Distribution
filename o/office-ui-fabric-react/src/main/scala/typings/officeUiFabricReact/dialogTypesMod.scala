package typings.officeUiFabricReact

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
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTypesMod {
  
  @js.native
  trait IDialog extends StObject
  
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
    implicit class IDialogPropsMutableBuilder[Self <: IDialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedById(value: String): Self = StObject.set(x, "ariaDescribedById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByIdUndefined: Self = StObject.set(x, "ariaDescribedById", js.undefined)
      
      @scala.inline
      def setAriaLabelledById(value: String): Self = StObject.set(x, "ariaLabelledById", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByIdUndefined: Self = StObject.set(x, "ariaLabelledById", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDialog]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDialog | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setDialogContentProps(value: IDialogContentProps): Self = StObject.set(x, "dialogContentProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogContentPropsUndefined: Self = StObject.set(x, "dialogContentProps", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBlockingUndefined: Self = StObject.set(x, "isBlocking", js.undefined)
      
      @scala.inline
      def setIsDarkOverlay(value: Boolean): Self = StObject.set(x, "isDarkOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDarkOverlayUndefined: Self = StObject.set(x, "isDarkOverlay", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setModalProps(value: IModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => _): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnDismissed(value: () => _): Self = StObject.set(x, "onDismissed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
      
      @scala.inline
      def setOnLayerDidMount(value: () => Unit): Self = StObject.set(x, "onLayerDidMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerDidMountUndefined: Self = StObject.set(x, "onLayerDidMount", js.undefined)
      
      @scala.inline
      def setOnLayerMounted(value: () => Unit): Self = StObject.set(x, "onLayerMounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerMountedUndefined: Self = StObject.set(x, "onLayerMounted", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDialogStyleProps => DeepPartial[IDialogStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSubText(value: String): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTopButtonsProps(value: js.Array[IButtonProps]): Self = StObject.set(x, "topButtonsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopButtonsPropsUndefined: Self = StObject.set(x, "topButtonsProps", js.undefined)
      
      @scala.inline
      def setTopButtonsPropsVarargs(value: IButtonProps*): Self = StObject.set(x, "topButtonsProps", js.Array(value :_*))
      
      @scala.inline
      def setType(value: DialogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IDialogStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional override for container class
      * @deprecated Pass through via `modalProps.className` instead.
      */
    var containerClassName: js.UndefOr[String] = js.native
    
    /**
      * Optional override content class
      * @deprecated Pass through via `dialogContentProps` instead as `className`.
      */
    var contentClassName: js.UndefOr[String] = js.native
    
    /**
      * Default max-width for the dialog box.
      * @defaultvalue '340px'
      */
    var dialogDefaultMaxWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.native
    
    /**
      * Default min-width for the dialog box.
      * @defaultvalue '288px'
      */
    var dialogDefaultMinWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.native
    
    /**
      * Whether the dialog is hidden.
      * @defaultvalue false
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDialogStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDialogStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogStyleProps]
    }
    
    @scala.inline
    implicit class IDialogStylePropsMutableBuilder[Self <: IDialogStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setDialogDefaultMaxWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "dialogDefaultMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogDefaultMaxWidthUndefined: Self = StObject.set(x, "dialogDefaultMaxWidth", js.undefined)
      
      @scala.inline
      def setDialogDefaultMinWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "dialogDefaultMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogDefaultMinWidthUndefined: Self = StObject.set(x, "dialogDefaultMinWidth", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDialogStyles extends StObject {
    
    var main: IStyle = js.native
    
    /**
      * Style for the root element.
      */
    var root: IStyle = js.native
  }
  object IDialogStyles {
    
    @scala.inline
    def apply(): IDialogStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogStyles]
    }
    
    @scala.inline
    implicit class IDialogStylesMutableBuilder[Self <: IDialogStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMain(value: IStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainNull: Self = StObject.set(x, "main", null)
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
