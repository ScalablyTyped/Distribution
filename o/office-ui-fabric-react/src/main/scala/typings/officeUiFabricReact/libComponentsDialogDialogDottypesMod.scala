package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libCommonIaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.DialogType
import typings.officeUiFabricReact.libComponentsDialogDialogContentDottypesMod.IDialogContentProps
import typings.officeUiFabricReact.libComponentsDialogDialogDotbaseMod.DialogBase
import typings.officeUiFabricReact.libComponentsModalModalDottypesMod.IModalProps
import typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIrawstylebaseMod.ICSSPixelUnitRule
import typings.uifabricMergeStyles.libIrawstylebaseMod.ICSSRule
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDialogDialogDottypesMod {
  
  trait IDialog extends StObject
  
  trait IDialogProps
    extends StObject
       with ClassAttributes[DialogBase]
       with IWithResponsiveModeState
       with IAccessiblePopupProps {
    
    /**
      * Optional id for aria-DescribedBy
      * @deprecated Pass through via `modalProps.subtitleAriaId` instead.
      */
    var ariaDescribedById: js.UndefOr[String] = js.undefined
    
    /**
      * Optional id for aria-LabelledBy
      * @deprecated Pass through via `modalProps.titleAriaId` instead.
      */
    var ariaLabelledById: js.UndefOr[String] = js.undefined
    
    /**
      * Optional class name to be added to the root class
      * @deprecated Pass through via `modalProps.className` instead
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IDialog interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      * @deprecated Unused, returns no value
      */
    var componentRef: js.UndefOr[IRefObject[IDialog]] = js.undefined
    
    /**
      * Optional override for container class
      * @deprecated Pass through via `modalProps.className` instead
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional override content class
      * @deprecated Pass through via `dialogContentProps` instead as `className`.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Props to be passed through to Dialog Content
      */
    var dialogContentProps: js.UndefOr[IDialogContentProps] = js.undefined
    
    /**
      * Whether the dialog is hidden.
      * @defaultvalue true
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the dialog can be light dismissed by clicking outside the dialog (on the overlay).
      * @defaultvalue false
      * @deprecated Pass through via `modalProps` instead
      */
    var isBlocking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the overlay is dark themed.
      * @defaultvalue true
      * @deprecated Pass through via `modalProps` instead
      */
    var isDarkOverlay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the dialog is displayed.
      * Deprecated, use `hidden` instead.
      * @defaultvalue false
      * @deprecated Use `hidden` instead
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the maximum width for the dialog. It limits the width property to be larger
      * than the value specified in max-width.
      */
    var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
    
    /**
      * Sets the minimum width of the dialog. It limits the width property to be not
      * smaller than the value specified in min-width.
      */
    var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.undefined
    
    /**
      * Props to be passed through to Modal
      */
    var modalProps: js.UndefOr[IModalProps] = js.undefined
    
    /**
      * A callback function for when the Dialog is dismissed from the close button or light dismiss.
      * Can also be specified separately in content and modal.
      */
    var onDismiss: js.UndefOr[
        js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]], Any]
      ] = js.undefined
    
    /**
      * A callback function which is called after the Dialog is dismissed and the animation is complete.
      * @deprecated Pass through via `modalProps` instead
      */
    var onDismissed: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * A callback function for when the Dialog content is mounted on the overlay layer
      * @deprecated Pass through via `modalProps.layerProps` instead
      */
    var onLayerDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Deprecated at 0.81.2, use `onLayerDidMount` instead.
      * @deprecated Use `onLayerDidMount` instead.
      */
    var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]] = js.undefined
    
    /**
      * The subtext to display in the dialog.
      * @deprecated Pass through via `dialogContentProps` instead.
      */
    var subText: js.UndefOr[String] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * The title text to display at the top of the dialog.
      * @deprecated Pass through via `dialogContentProps` instead.
      */
    var title: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Other top buttons that will show up next to the close button
      * @deprecated Pass through via `dialogContentProps` instead.
      */
    var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.undefined
    
    /**
      * The type of Dialog to display.
      * @defaultvalue DialogType.normal
      * @deprecated Pass through via `dialogContentProps` instead.
      */
    var `type`: js.UndefOr[DialogType] = js.undefined
  }
  object IDialogProps {
    
    inline def apply(): IDialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogProps]
    }
    
    extension [Self <: IDialogProps](x: Self) {
      
      inline def setAriaDescribedById(value: String): Self = StObject.set(x, "ariaDescribedById", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByIdUndefined: Self = StObject.set(x, "ariaDescribedById", js.undefined)
      
      inline def setAriaLabelledById(value: String): Self = StObject.set(x, "ariaLabelledById", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByIdUndefined: Self = StObject.set(x, "ariaLabelledById", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDialog]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDialog | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDialogContentProps(value: IDialogContentProps): Self = StObject.set(x, "dialogContentProps", value.asInstanceOf[js.Any])
      
      inline def setDialogContentPropsUndefined: Self = StObject.set(x, "dialogContentProps", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      inline def setIsBlockingUndefined: Self = StObject.set(x, "isBlocking", js.undefined)
      
      inline def setIsDarkOverlay(value: Boolean): Self = StObject.set(x, "isDarkOverlay", value.asInstanceOf[js.Any])
      
      inline def setIsDarkOverlayUndefined: Self = StObject.set(x, "isDarkOverlay", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMaxWidth(value: ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setModalProps(value: IModalProps): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
      
      inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
      
      inline def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLButtonElement, NativeMouseEvent]] => Any): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnDismissed(value: () => Any): Self = StObject.set(x, "onDismissed", js.Any.fromFunction0(value))
      
      inline def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
      
      inline def setOnLayerDidMount(value: () => Unit): Self = StObject.set(x, "onLayerDidMount", js.Any.fromFunction0(value))
      
      inline def setOnLayerDidMountUndefined: Self = StObject.set(x, "onLayerDidMount", js.undefined)
      
      inline def setOnLayerMounted(value: () => Unit): Self = StObject.set(x, "onLayerMounted", js.Any.fromFunction0(value))
      
      inline def setOnLayerMountedUndefined: Self = StObject.set(x, "onLayerMounted", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDialogStyleProps, IDialogStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDialogStyleProps => DeepPartial[IDialogStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setSubText(value: String): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      inline def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTopButtonsProps(value: js.Array[IButtonProps]): Self = StObject.set(x, "topButtonsProps", value.asInstanceOf[js.Any])
      
      inline def setTopButtonsPropsUndefined: Self = StObject.set(x, "topButtonsProps", js.undefined)
      
      inline def setTopButtonsPropsVarargs(value: IButtonProps*): Self = StObject.set(x, "topButtonsProps", js.Array(value*))
      
      inline def setType(value: DialogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IDialogStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional override for container class
      * @deprecated Pass through via `modalProps.className` instead.
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Optional override content class
      * @deprecated Pass through via `dialogContentProps` instead as `className`.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Default max-width for the dialog box.
      * @defaultvalue '340px'
      */
    var dialogDefaultMaxWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.undefined
    
    /**
      * Default min-width for the dialog box.
      * @defaultvalue '288px'
      */
    var dialogDefaultMinWidth: js.UndefOr[String | ICSSRule | ICSSPixelUnitRule] = js.undefined
    
    /**
      * Whether the dialog is hidden.
      * @defaultvalue false
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDialogStyleProps {
    
    inline def apply(theme: ITheme): IDialogStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogStyleProps]
    }
    
    extension [Self <: IDialogStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDialogDefaultMaxWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "dialogDefaultMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setDialogDefaultMaxWidthUndefined: Self = StObject.set(x, "dialogDefaultMaxWidth", js.undefined)
      
      inline def setDialogDefaultMinWidth(value: String | ICSSRule | ICSSPixelUnitRule): Self = StObject.set(x, "dialogDefaultMinWidth", value.asInstanceOf[js.Any])
      
      inline def setDialogDefaultMinWidthUndefined: Self = StObject.set(x, "dialogDefaultMinWidth", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDialogStyles extends StObject {
    
    var main: IStyle
    
    /**
      * Style for the root element.
      */
    var root: IStyle
  }
  object IDialogStyles {
    
    inline def apply(): IDialogStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogStyles]
    }
    
    extension [Self <: IDialogStyles](x: Self) {
      
      inline def setMain(value: IStyle): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainNull: Self = StObject.set(x, "main", null)
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
