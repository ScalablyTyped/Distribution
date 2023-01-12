package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit
import typings.officeUiFabricReact.libComponentsLinkLinkDottypesMod.ILinkProps
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libBaseComponentDottypesMod.IBaseProps
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardPreviewDottypesMod {
  
  trait IDocumentCardPreview extends StObject
  
  trait IDocumentCardPreviewImage extends StObject {
    
    /**
      * Hex color value of the line below the preview, which should correspond to the document type.
      *
      * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
      * @deprecated To be removed at v5.0.0.
      */
    var accentColor: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
    
    /**
      * Deprecated at v1.3.6, to be removed at \>= v2.0.0.
      * @deprecated To be removed at v2.0.0.
      */
    var errorImageSrc: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, forces the preview image to be this height.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Path to the icon associated with this document type.
      *
      */
    var iconSrc: js.UndefOr[String] = js.undefined
    
    /**
      * Used to determine how to size the image to fit the dimensions of the component.
      * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
      */
    var imageFit: js.UndefOr[ImageFit] = js.undefined
    
    /**
      * Props to pass to Link component
      */
    var linkProps: js.UndefOr[ILinkProps] = js.undefined
    
    /**
      * File name for the document this preview represents.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The props for the preview icon container classname.
      * If provided, icon container classname will be used..
      */
    var previewIconContainerClass: js.UndefOr[String] = js.undefined
    
    /**
      * The props for the preview icon.
      * If provided, icon will be rendered instead of image.
      */
    var previewIconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Path to the preview image.
      */
    var previewImageSrc: js.UndefOr[String] = js.undefined
    
    /**
      * URL to view the file.
      * @deprecated Use `href` inside of `linkProps` instead.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * If provided, forces the preview image to be this width.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IDocumentCardPreviewImage {
    
    inline def apply(): IDocumentCardPreviewImage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardPreviewImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardPreviewImage] (val x: Self) extends AnyVal {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setErrorImageSrc(value: String): Self = StObject.set(x, "errorImageSrc", value.asInstanceOf[js.Any])
      
      inline def setErrorImageSrcUndefined: Self = StObject.set(x, "errorImageSrc", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIconSrc(value: String): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
      
      inline def setIconSrcUndefined: Self = StObject.set(x, "iconSrc", js.undefined)
      
      inline def setImageFit(value: ImageFit): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      inline def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      inline def setLinkProps(value: ILinkProps): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
      
      inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPreviewIconContainerClass(value: String): Self = StObject.set(x, "previewIconContainerClass", value.asInstanceOf[js.Any])
      
      inline def setPreviewIconContainerClassUndefined: Self = StObject.set(x, "previewIconContainerClass", js.undefined)
      
      inline def setPreviewIconProps(value: IIconProps): Self = StObject.set(x, "previewIconProps", value.asInstanceOf[js.Any])
      
      inline def setPreviewIconPropsUndefined: Self = StObject.set(x, "previewIconProps", js.undefined)
      
      inline def setPreviewImageSrc(value: String): Self = StObject.set(x, "previewImageSrc", value.asInstanceOf[js.Any])
      
      inline def setPreviewImageSrcUndefined: Self = StObject.set(x, "previewImageSrc", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IDocumentCardPreviewProps
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
    var componentRef_IDocumentCardPreviewProps: js.UndefOr[IRefObject[IDocumentCardPreview]] = js.undefined
    
    /**
      * The function return string that will describe the number of overflow documents.
      * such as  (overflowCount: number) =\> `+${ overflowCount } more`,
      */
    var getOverflowDocumentCountText: js.UndefOr[js.Function1[/* overflowCount */ Double, String]] = js.undefined
    
    /**
      * One or more preview images to display.
      */
    var previewImages: js.Array[IDocumentCardPreviewImage]
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]
      ] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDocumentCardPreviewProps {
    
    inline def apply(previewImages: js.Array[IDocumentCardPreviewImage]): IDocumentCardPreviewProps = {
      val __obj = js.Dynamic.literal(previewImages = previewImages.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardPreviewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardPreviewProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardPreview]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardPreview | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setGetOverflowDocumentCountText(value: /* overflowCount */ Double => String): Self = StObject.set(x, "getOverflowDocumentCountText", js.Any.fromFunction1(value))
      
      inline def setGetOverflowDocumentCountTextUndefined: Self = StObject.set(x, "getOverflowDocumentCountText", js.undefined)
      
      inline def setPreviewImages(value: js.Array[IDocumentCardPreviewImage]): Self = StObject.set(x, "previewImages", value.asInstanceOf[js.Any])
      
      inline def setPreviewImagesVarargs(value: IDocumentCardPreviewImage*): Self = StObject.set(x, "previewImages", js.Array(value*))
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardPreviewStyleProps, IDocumentCardPreviewStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardPreviewStyleProps => DeepPartial[IDocumentCardPreviewStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDocumentCardPreviewStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Is it a list of files rather than a preview image?
      */
    var isFileList: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardPreviewStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardPreviewStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardPreviewStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardPreviewStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsFileList(value: Boolean): Self = StObject.set(x, "isFileList", value.asInstanceOf[js.Any])
      
      inline def setIsFileListUndefined: Self = StObject.set(x, "isFileList", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardPreviewStyles extends StObject {
    
    var fileList: IStyle
    
    var fileListIcon: IStyle
    
    var fileListLink: IStyle
    
    var fileListOverflowText: IStyle
    
    var icon: IStyle
    
    var previewIcon: IStyle
    
    var root: IStyle
  }
  object IDocumentCardPreviewStyles {
    
    inline def apply(): IDocumentCardPreviewStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardPreviewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardPreviewStyles] (val x: Self) extends AnyVal {
      
      inline def setFileList(value: IStyle): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListIcon(value: IStyle): Self = StObject.set(x, "fileListIcon", value.asInstanceOf[js.Any])
      
      inline def setFileListIconNull: Self = StObject.set(x, "fileListIcon", null)
      
      inline def setFileListIconUndefined: Self = StObject.set(x, "fileListIcon", js.undefined)
      
      inline def setFileListLink(value: IStyle): Self = StObject.set(x, "fileListLink", value.asInstanceOf[js.Any])
      
      inline def setFileListLinkNull: Self = StObject.set(x, "fileListLink", null)
      
      inline def setFileListLinkUndefined: Self = StObject.set(x, "fileListLink", js.undefined)
      
      inline def setFileListNull: Self = StObject.set(x, "fileList", null)
      
      inline def setFileListOverflowText(value: IStyle): Self = StObject.set(x, "fileListOverflowText", value.asInstanceOf[js.Any])
      
      inline def setFileListOverflowTextNull: Self = StObject.set(x, "fileListOverflowText", null)
      
      inline def setFileListOverflowTextUndefined: Self = StObject.set(x, "fileListOverflowText", js.undefined)
      
      inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      inline def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPreviewIcon(value: IStyle): Self = StObject.set(x, "previewIcon", value.asInstanceOf[js.Any])
      
      inline def setPreviewIconNull: Self = StObject.set(x, "previewIcon", null)
      
      inline def setPreviewIconUndefined: Self = StObject.set(x, "previewIcon", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
