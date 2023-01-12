package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libBaseComponentDottypesMod.IBaseProps
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardImageDottypesMod {
  
  trait IDocumentCardImage extends StObject
  
  trait IDocumentCardImageProps
    extends StObject
       with IBaseProps[js.Object] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    @JSName("componentRef")
    var componentRef_IDocumentCardImageProps: js.UndefOr[IRefObject[IDocumentCardImage]] = js.undefined
    
    /**
      * If provided, forces the preview image to be this height.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The props for the icon associated with this document type.
      */
    var iconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Used to determine how to size the image to fit the dimensions of the component.
      * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
      */
    var imageFit: js.UndefOr[ImageFit] = js.undefined
    
    /**
      * Path to the preview image.
      */
    var imageSrc: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * If provided, forces the preview image to be this width.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IDocumentCardImageProps {
    
    inline def apply(): IDocumentCardImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardImageProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardImage]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardImage | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setImageFit(value: ImageFit): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      inline def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardImageStyleProps => DeepPartial[IDocumentCardImageStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type IDocumentCardImageStyleProps = IDocumentCardImageProps
  
  trait IDocumentCardImageStyles extends StObject {
    
    var centeredIcon: IStyle
    
    var centeredIconWrapper: IStyle
    
    var cornerIcon: IStyle
    
    var root: IStyle
  }
  object IDocumentCardImageStyles {
    
    inline def apply(): IDocumentCardImageStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardImageStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardImageStyles] (val x: Self) extends AnyVal {
      
      inline def setCenteredIcon(value: IStyle): Self = StObject.set(x, "centeredIcon", value.asInstanceOf[js.Any])
      
      inline def setCenteredIconNull: Self = StObject.set(x, "centeredIcon", null)
      
      inline def setCenteredIconUndefined: Self = StObject.set(x, "centeredIcon", js.undefined)
      
      inline def setCenteredIconWrapper(value: IStyle): Self = StObject.set(x, "centeredIconWrapper", value.asInstanceOf[js.Any])
      
      inline def setCenteredIconWrapperNull: Self = StObject.set(x, "centeredIconWrapper", null)
      
      inline def setCenteredIconWrapperUndefined: Self = StObject.set(x, "centeredIconWrapper", js.undefined)
      
      inline def setCornerIcon(value: IStyle): Self = StObject.set(x, "cornerIcon", value.asInstanceOf[js.Any])
      
      inline def setCornerIconNull: Self = StObject.set(x, "cornerIcon", null)
      
      inline def setCornerIconUndefined: Self = StObject.set(x, "cornerIcon", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
