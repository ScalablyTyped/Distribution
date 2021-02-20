package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIIconStyles
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.react.mod.ComponentType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconTypesMod {
  
  @js.native
  sealed trait IconType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Icon/Icon.types", "IconType")
  @js.native
  object IconType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IconType with Double] = js.native
    
    /**
      * Render using the fabric icon font.
      * @deprecated Icon type is inferred based on presence of `IIconProps.imageProps`
      */
    @js.native
    sealed trait default extends IconType
    /* 0 */ val default: typings.officeUiFabricReact.iconTypesMod.IconType.default with Double = js.native
    
    /**
      * Deprecated, use `default`.
      * @deprecated Use `default`.
      */
    @js.native
    sealed trait Default extends IconType
    /* 100000 */ val Default: typings.officeUiFabricReact.iconTypesMod.IconType.Default with Double = js.native
    
    /**
      * Deprecated, use `image`.
      * @deprecated Use `image`.
      */
    @js.native
    sealed trait Image extends IconType
    /* 100001 */ val Image: typings.officeUiFabricReact.iconTypesMod.IconType.Image with Double = js.native
    
    /**
      * Render using an image, where imageProps would be used.
      * @deprecated Icon type is inferred based on presence of `IIconProps.imageProps`
      */
    @js.native
    sealed trait image extends IconType
    /* 1 */ val image: typings.officeUiFabricReact.iconTypesMod.IconType.image with Double = js.native
  }
  
  @js.native
  trait IFontIconProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * The name of the icon to use from the icon font.
      * If string is empty, a placeholder icon will be rendered the same width as an icon.
      */
    var iconName: js.UndefOr[String] = js.native
  }
  object IFontIconProps {
    
    @scala.inline
    def apply(): IFontIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFontIconProps]
    }
    
    @scala.inline
    implicit class IFontIconPropsMutableBuilder[Self <: IFontIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    }
  }
  
  @js.native
  trait IIconProps
    extends HTMLAttributes[HTMLElement]
       with IBaseProps[js.Any] {
    
    /**
      * The aria label of the icon for the benefit of screen readers.
      * @deprecated Use the native prop `aria-label`
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * The name of the icon to use from the icon font.
      * If string is empty, a placeholder icon will be rendered the same width as an icon.
      */
    var iconName: js.UndefOr[String] = js.native
    
    /**
      * The type of icon to render (image or icon font).
      * @deprecated Inferred based on the presence of `imageProps`
      */
    var iconType: js.UndefOr[IconType] = js.native
    
    /**
      * If rendering an image icon, this component will be rendered in the event that loading the image fails.
      */
    var imageErrorAs: js.UndefOr[ComponentType[IImageProps]] = js.native
    
    /**
      * If rendering an image icon, these props will be passed to the Image component.
      */
    var imageProps: js.UndefOr[IImageProps] = js.native
    
    /**
      * Gets the styles for an Icon.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IIconStyleProps, IIconStyles]] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IIconProps {
    
    @scala.inline
    def apply(): IIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIconProps]
    }
    
    @scala.inline
    implicit class IIconPropsMutableBuilder[Self <: IIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
      
      @scala.inline
      def setIconType(value: IconType): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
      
      @scala.inline
      def setImageErrorAs(value: ComponentType[IImageProps]): Self = StObject.set(x, "imageErrorAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageErrorAsUndefined: Self = StObject.set(x, "imageErrorAs", js.undefined)
      
      @scala.inline
      def setImageProps(value: IImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IIconStyleProps, IIconStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IIconStyleProps => DeepPartial[IIconStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IIconStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var iconClassName: js.UndefOr[String] = js.native
    
    var isImage: Boolean = js.native
    
    var isPlaceholder: Boolean = js.native
    
    var styles: js.UndefOr[PartialIIconStyles] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IIconStyleProps {
    
    @scala.inline
    def apply(isImage: Boolean, isPlaceholder: Boolean): IIconStyleProps = {
      val __obj = js.Dynamic.literal(isImage = isImage.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconStyleProps]
    }
    
    @scala.inline
    implicit class IIconStylePropsMutableBuilder[Self <: IIconStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      @scala.inline
      def setIsImage(value: Boolean): Self = StObject.set(x, "isImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPlaceholder(value: Boolean): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: PartialIIconStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IIconStyles extends StObject {
    
    /**
      * Deprecated. Use `root`.
      * @deprecated Use `root`.
      */
    var imageContainer: js.UndefOr[IStyle] = js.native
    
    var root: js.UndefOr[IStyle] = js.native
  }
  object IIconStyles {
    
    @scala.inline
    def apply(): IIconStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIconStyles]
    }
    
    @scala.inline
    implicit class IIconStylesMutableBuilder[Self <: IIconStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageContainer(value: IStyle): Self = StObject.set(x, "imageContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageContainerNull: Self = StObject.set(x, "imageContainer", null)
      
      @scala.inline
      def setImageContainerUndefined: Self = StObject.set(x, "imageContainer", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  @js.native
  trait IImageIconProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * Props passed to the Image component.
      */
    var imageProps: IImageProps = js.native
  }
  object IImageIconProps {
    
    @scala.inline
    def apply(imageProps: IImageProps): IImageIconProps = {
      val __obj = js.Dynamic.literal(imageProps = imageProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageIconProps]
    }
    
    @scala.inline
    implicit class IImageIconPropsMutableBuilder[Self <: IImageIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageProps(value: IImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    }
  }
}
