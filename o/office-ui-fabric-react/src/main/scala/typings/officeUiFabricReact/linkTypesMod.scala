package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.linkBaseMod.LinkBase
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkTypesMod {
  
  @js.native
  trait ILink extends StObject {
    
    /** Sets focus to the link. */
    def focus(): Unit = js.native
  }
  object ILink {
    
    @scala.inline
    def apply(focus: () => Unit): ILink = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ILink]
    }
    
    @scala.inline
    implicit class ILinkMutableBuilder[Self <: ILink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ILinkHTMLAttributes[T]
    extends HTMLAttributes[T]
       with /* index */ StringDictionary[js.Any] {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var download: js.UndefOr[js.Any] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var hrefLang: js.UndefOr[String] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  }
  object ILinkHTMLAttributes {
    
    @scala.inline
    def apply[T](): ILinkHTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkHTMLAttributes[T]]
    }
    
    @scala.inline
    implicit class ILinkHTMLAttributesMutableBuilder[Self <: ILinkHTMLAttributes[_], T] (val x: Self with ILinkHTMLAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      @scala.inline
      def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      @scala.inline
      def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      @scala.inline
      def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      @scala.inline
      def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ILinkProps extends ILinkHTMLAttributes[HTMLAnchorElement | HTMLButtonElement | HTMLElement | LinkBase] {
    
    /**
      * A component that should be used as the root element of the link returned from the Link component.
      */
    var as: js.UndefOr[
        String | (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object]
      ] = js.native
    
    /**
      * Optional callback to access the ILink interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ILink]] = js.native
    
    /**
      * Optional keytip for this Link
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ILinkStyleProps, ILinkStyles]] = js.native
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ILinkProps {
    
    @scala.inline
    def apply(): ILinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkProps]
    }
    
    @scala.inline
    implicit class ILinkPropsMutableBuilder[Self <: ILinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String | (ComponentClass[js.Object, ComponentState]) | FunctionComponent[js.Object]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ILink]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ILink | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ILinkStyleProps, ILinkStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ILinkStyleProps => DeepPartial[ILinkStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ILinkStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var isButton: js.UndefOr[Boolean] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object ILinkStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ILinkStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILinkStyleProps]
    }
    
    @scala.inline
    implicit class ILinkStylePropsMutableBuilder[Self <: ILinkStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILinkStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object ILinkStyles {
    
    @scala.inline
    def apply(): ILinkStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkStyles]
    }
    
    @scala.inline
    implicit class ILinkStylesMutableBuilder[Self <: ILinkStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
