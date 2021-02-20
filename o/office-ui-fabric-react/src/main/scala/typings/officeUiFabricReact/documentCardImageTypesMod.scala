package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.imageTypesMod.ImageFit
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardImageTypesMod {
  
  @js.native
  trait IDocumentCardImage extends StObject
  
  @js.native
  trait IDocumentCardImageProps
    extends IBaseProps[js.Object] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    @JSName("componentRef")
    var componentRef_IDocumentCardImageProps: js.UndefOr[IRefObject[IDocumentCardImage]] = js.native
    
    /**
      * If provided, forces the preview image to be this height.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The props for the icon associated with this document type.
      */
    var iconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * Used to determine how to size the image to fit the dimensions of the component.
      * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
      */
    var imageFit: js.UndefOr[ImageFit] = js.native
    
    /**
      * Path to the preview image.
      */
    var imageSrc: js.UndefOr[String] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * If provided, forces the preview image to be this width.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object IDocumentCardImageProps {
    
    @scala.inline
    def apply(): IDocumentCardImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardImageProps]
    }
    
    @scala.inline
    implicit class IDocumentCardImagePropsMutableBuilder[Self <: IDocumentCardImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardImage]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardImage | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setImageFit(value: ImageFit): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      @scala.inline
      def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardImageStyleProps => DeepPartial[IDocumentCardImageStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type IDocumentCardImageStyleProps = IDocumentCardImageProps
  
  @js.native
  trait IDocumentCardImageStyles extends StObject {
    
    var centeredIcon: IStyle = js.native
    
    var centeredIconWrapper: IStyle = js.native
    
    var cornerIcon: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IDocumentCardImageStyles {
    
    @scala.inline
    def apply(): IDocumentCardImageStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardImageStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardImageStylesMutableBuilder[Self <: IDocumentCardImageStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenteredIcon(value: IStyle): Self = StObject.set(x, "centeredIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredIconNull: Self = StObject.set(x, "centeredIcon", null)
      
      @scala.inline
      def setCenteredIconUndefined: Self = StObject.set(x, "centeredIcon", js.undefined)
      
      @scala.inline
      def setCenteredIconWrapper(value: IStyle): Self = StObject.set(x, "centeredIconWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredIconWrapperNull: Self = StObject.set(x, "centeredIconWrapper", null)
      
      @scala.inline
      def setCenteredIconWrapperUndefined: Self = StObject.set(x, "centeredIconWrapper", js.undefined)
      
      @scala.inline
      def setCornerIcon(value: IStyle): Self = StObject.set(x, "cornerIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerIconNull: Self = StObject.set(x, "cornerIcon", null)
      
      @scala.inline
      def setCornerIconUndefined: Self = StObject.set(x, "cornerIcon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
