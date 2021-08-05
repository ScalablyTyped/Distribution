package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.libButtonMod.BaseButton
import typings.officeUiFabricReact.libButtonMod.Button
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBarTypesMod {
  
  @js.native
  sealed trait MessageBarType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.types", "MessageBarType")
  @js.native
  object MessageBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageBarType & Double] = js.native
    
    /** Blocked styled MessageBar */
    @js.native
    sealed trait blocked
      extends StObject
         with MessageBarType
    /* 2 */ val blocked: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.blocked & Double = js.native
    
    /** Error styled MessageBar */
    @js.native
    sealed trait error
      extends StObject
         with MessageBarType
    /* 1 */ val error: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.error & Double = js.native
    
    /** Info styled MessageBar */
    @js.native
    sealed trait info
      extends StObject
         with MessageBarType
    /* 0 */ val info: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.info & Double = js.native
    
    /** SevereWarning styled MessageBar */
    @js.native
    sealed trait severeWarning
      extends StObject
         with MessageBarType
    /* 3 */ val severeWarning: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.severeWarning & Double = js.native
    
    /** Success styled MessageBar */
    @js.native
    sealed trait success
      extends StObject
         with MessageBarType
    /* 4 */ val success: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.success & Double = js.native
    
    /** Warning styled MessageBar */
    @js.native
    sealed trait warning
      extends StObject
         with MessageBarType
    /* 5 */ val warning: typings.officeUiFabricReact.messageBarTypesMod.MessageBarType.warning & Double = js.native
  }
  
  trait IMessageBar extends StObject
  
  trait IMessageBarProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * The actions you want to show on the other side.
      */
    var actions: js.UndefOr[Element] = js.undefined
    
    /**
      * A description of the message bar for the benefit of screen readers.
      * @deprecated Use native prop `aria-label` instead.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IMessageBar interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IMessageBar]] = js.undefined
    
    /**
      * Aria label on dismiss button if onDismiss is defined.
      */
    var dismissButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom icon prop to replace the dismiss icon.
      * If unset, default will be the Fabric Clear icon.
      */
    var dismissIconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Determines if the message bar is multi lined.
      * If false, and the text overflows over buttons or to another line, it is clipped.
      * @defaultvalue true
      */
    var isMultiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom icon prop to replace the message bar icon.
      * If unset, default will be the icon set by messageBarType.
      */
    var messageBarIconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * The type of MessageBar to render.
      * @defaultvalue MessageBarType.info
      */
    var messageBarType: js.UndefOr[MessageBarType] = js.undefined
    
    /**
      * Whether the message bar has a dismiss button and its callback.
      * If null, we don't show a dismiss button.
      * @defaultvalue null
      */
    var onDismiss: js.UndefOr[
        js.Function1[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement | BaseButton | Button, NativeMouseEvent]], 
          js.Any
        ]
      ] = js.undefined
    
    /**
      * Aria label on overflow button if truncated is defined.
      */
    var overflowButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Determines if the message bar text is truncated.
      * If true, a button will render to toggle between a single line view and multiline view.
      * This prop is for single line message bars with no buttons only in a limited space scenario.
      * @defaultvalue false
      */
    var truncated: js.UndefOr[Boolean] = js.undefined
  }
  object IMessageBarProps {
    
    inline def apply(): IMessageBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageBarProps]
    }
    
    extension [Self <: IMessageBarProps](x: Self) {
      
      inline def setActions(value: Element): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IMessageBar]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IMessageBar | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDismissButtonAriaLabel(value: String): Self = StObject.set(x, "dismissButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDismissButtonAriaLabelUndefined: Self = StObject.set(x, "dismissButtonAriaLabel", js.undefined)
      
      inline def setDismissIconProps(value: IIconProps): Self = StObject.set(x, "dismissIconProps", value.asInstanceOf[js.Any])
      
      inline def setDismissIconPropsUndefined: Self = StObject.set(x, "dismissIconProps", js.undefined)
      
      inline def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      inline def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      inline def setMessageBarIconProps(value: IIconProps): Self = StObject.set(x, "messageBarIconProps", value.asInstanceOf[js.Any])
      
      inline def setMessageBarIconPropsUndefined: Self = StObject.set(x, "messageBarIconProps", js.undefined)
      
      inline def setMessageBarType(value: MessageBarType): Self = StObject.set(x, "messageBarType", value.asInstanceOf[js.Any])
      
      inline def setMessageBarTypeUndefined: Self = StObject.set(x, "messageBarType", js.undefined)
      
      inline def setOnDismiss(
        value: /* ev */ js.UndefOr[MouseEvent[HTMLElement | BaseButton | Button, NativeMouseEvent]] => js.Any
      ): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOverflowButtonAriaLabel(value: String): Self = StObject.set(x, "overflowButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonAriaLabelUndefined: Self = StObject.set(x, "overflowButtonAriaLabel", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IMessageBarStyleProps => DeepPartial[IMessageBarStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    }
  }
  
  trait IMessageBarStyleProps extends StObject {
    
    /**
      * Whether the MessageBar contains any action elements.
      */
    var actions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional CSS class(es).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the single line MessageBar is being expanded.
      */
    var expandSingleLine: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the MessageBar is rendered in multi line (as opposed to single line) mode.
      */
    var isMultiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of the MessageBar.
      */
    var messageBarType: js.UndefOr[MessageBarType] = js.undefined
    
    /**
      * Whether the MessageBar contains a dismiss button.
      */
    var onDismiss: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: ITheme
    
    /**
      * Whether the text is truncated.
      */
    var truncated: js.UndefOr[Boolean] = js.undefined
  }
  object IMessageBarStyleProps {
    
    inline def apply(theme: ITheme): IMessageBarStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageBarStyleProps]
    }
    
    extension [Self <: IMessageBarStyleProps](x: Self) {
      
      inline def setActions(value: Boolean): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpandSingleLine(value: Boolean): Self = StObject.set(x, "expandSingleLine", value.asInstanceOf[js.Any])
      
      inline def setExpandSingleLineUndefined: Self = StObject.set(x, "expandSingleLine", js.undefined)
      
      inline def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      inline def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      inline def setMessageBarType(value: MessageBarType): Self = StObject.set(x, "messageBarType", value.asInstanceOf[js.Any])
      
      inline def setMessageBarTypeUndefined: Self = StObject.set(x, "messageBarType", js.undefined)
      
      inline def setOnDismiss(value: Boolean): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    }
  }
  
  trait IMessageBarStyles extends StObject {
    
    /**
      * Style set for the optional element containing the action elements.
      */
    var actions: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the element containing the icon, text, and optional dismiss button.
      */
    var content: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the element containing the dismiss button.
      */
    var dismissSingleLine: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the optional dismiss button.
      */
    var dismissal: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the icon used to expand and collapse the MessageBar.
      */
    var expand: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the element containing the expand icon.
      */
    var expandSingleLine: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the icon.
      */
    var icon: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the element containing the icon.
      */
    var iconContainer: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the text.
      */
    var innerText: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the root element.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the element containing the text.
      */
    var text: js.UndefOr[IStyle] = js.undefined
  }
  object IMessageBarStyles {
    
    inline def apply(): IMessageBarStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageBarStyles]
    }
    
    extension [Self <: IMessageBarStyles](x: Self) {
      
      inline def setActions(value: IStyle): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDismissSingleLine(value: IStyle): Self = StObject.set(x, "dismissSingleLine", value.asInstanceOf[js.Any])
      
      inline def setDismissSingleLineNull: Self = StObject.set(x, "dismissSingleLine", null)
      
      inline def setDismissSingleLineUndefined: Self = StObject.set(x, "dismissSingleLine", js.undefined)
      
      inline def setDismissal(value: IStyle): Self = StObject.set(x, "dismissal", value.asInstanceOf[js.Any])
      
      inline def setDismissalNull: Self = StObject.set(x, "dismissal", null)
      
      inline def setDismissalUndefined: Self = StObject.set(x, "dismissal", js.undefined)
      
      inline def setExpand(value: IStyle): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandNull: Self = StObject.set(x, "expand", null)
      
      inline def setExpandSingleLine(value: IStyle): Self = StObject.set(x, "expandSingleLine", value.asInstanceOf[js.Any])
      
      inline def setExpandSingleLineNull: Self = StObject.set(x, "expandSingleLine", null)
      
      inline def setExpandSingleLineUndefined: Self = StObject.set(x, "expandSingleLine", js.undefined)
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainer(value: IStyle): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerNull: Self = StObject.set(x, "iconContainer", null)
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "iconContainer", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInnerText(value: IStyle): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
      
      inline def setInnerTextNull: Self = StObject.set(x, "innerText", null)
      
      inline def setInnerTextUndefined: Self = StObject.set(x, "innerText", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
