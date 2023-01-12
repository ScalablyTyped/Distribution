package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsImageImageDottypesMod {
  
  @js.native
  sealed trait ImageCoverStyle extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageCoverStyle & Double] = js.native
    
    /**
      * The image will be shown at 100% height of container and the width will be scaled accordingly
      */
    @js.native
    sealed trait landscape
      extends StObject
         with ImageCoverStyle
    /* 0 */ val landscape: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle.landscape & Double = js.native
    
    /**
      * The image will be shown at 100% width of container and the height will be scaled accordingly
      */
    @js.native
    sealed trait portrait
      extends StObject
         with ImageCoverStyle
    /* 1 */ val portrait: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle.portrait & Double = js.native
  }
  
  @js.native
  sealed trait ImageFit extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageFit & Double] = js.native
    
    /**
      * The image is not scaled. The image is centered and cropped within the content box.
      */
    @js.native
    sealed trait center
      extends StObject
         with ImageFit
    /* 0 */ val center: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.center & Double = js.native
    
    /**
      * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
      * behave as ImageFit.center if the image's natural height and width is less than the Image frame's height and width,
      * but if either natural height or width are larger than the frame it will behave as ImageFit.contain.
      */
    @js.native
    sealed trait centerContain
      extends StObject
         with ImageFit
    /* 5 */ val centerContain: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.centerContain & Double = js.native
    
    /**
      * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
      * behave as ImageFit.center if the image's natural height or width is less than the Image frame's height or width,
      * but if both natural height and width are larger than the frame it will behave as ImageFit.cover.
      */
    @js.native
    sealed trait centerCover
      extends StObject
         with ImageFit
    /* 4 */ val centerCover: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.centerCover & Double = js.native
    
    /**
      * The image is scaled to maintain its aspect ratio while being fully contained within the frame. The image will
      * be centered horizontally and vertically within the frame. The space in the top and bottom or in the sides of
      * the frame will be empty depending on the difference in aspect ratio between the image and the frame.
      */
    @js.native
    sealed trait contain
      extends StObject
         with ImageFit
    /* 1 */ val contain: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.contain & Double = js.native
    
    /**
      * The image is scaled to maintain its aspect ratio while filling the frame. Portions of the image will be cropped
      * from the top and bottom, or the sides, depending on the difference in aspect ratio between the image and the frame.
      */
    @js.native
    sealed trait cover
      extends StObject
         with ImageFit
    /* 2 */ val cover: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.cover & Double = js.native
    
    /**
      * Neither the image nor the frame are scaled. If their sizes do not match, the image will either be cropped or the
      * frame will have empty space.
      */
    @js.native
    sealed trait none
      extends StObject
         with ImageFit
    /* 3 */ val none: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.none & Double = js.native
  }
  
  @js.native
  sealed trait ImageLoadState extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageLoadState & Double] = js.native
    
    /**
      * An error has been encountered while loading the image.
      */
    @js.native
    sealed trait error
      extends StObject
         with ImageLoadState
    /* 2 */ val error: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.error & Double = js.native
    
    /**
      * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead
      * and rerender the Image with a difference src.
      * @deprecated Use `onLoadingStateChange` instead
      * and rerender the Image with a difference src.
      */
    @js.native
    sealed trait errorLoaded
      extends StObject
         with ImageLoadState
    /* 3 */ val errorLoaded: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.errorLoaded & Double = js.native
    
    /**
      * The image has been loaded successfully.
      */
    @js.native
    sealed trait loaded
      extends StObject
         with ImageLoadState
    /* 1 */ val loaded: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.loaded & Double = js.native
    
    /**
      * The image has not yet been loaded, and there is no error yet.
      */
    @js.native
    sealed trait notLoaded
      extends StObject
         with ImageLoadState
    /* 0 */ val notLoaded: typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.notLoaded & Double = js.native
  }
  
  trait IImage extends StObject
  
  trait IImageProps
    extends StObject
       with ImgHTMLAttributes[HTMLImageElement] {
    
    /**
      * Specifies the cover style to be used for this image. If not
      * specified, this will be dynamically calculated based on the
      * aspect ratio for the image.
      */
    var coverStyle: js.UndefOr[ImageCoverStyle] = js.undefined
    
    /**
      * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead and
      * rerender the Image with a difference src.
      * @deprecated Use `onLoadingStateChange` instead and
      * rerender the Image with a difference src.
      */
    var errorSrc: js.UndefOr[String] = js.undefined
    
    /**
      * Used to determine how the image is scaled and cropped to fit the frame.
      *
      * @defaultvalue If both dimensions are provided, then the image is fit using ImageFit.scale.
      * Otherwise, the image won't be scaled or cropped.
      */
    var imageFit: js.UndefOr[ImageFit] = js.undefined
    
    /**
      * If true, the image frame will expand to fill its parent container.
      */
    var maximizeFrame: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional callback method for when the image load state has changed.
      * The 'loadState' parameter indicates the current state of the Image.
      */
    var onLoadingStateChange: js.UndefOr[js.Function1[/* loadState */ ImageLoadState, Unit]] = js.undefined
    
    /**
      * If true, fades the image in when loaded.
      * @defaultvalue true
      */
    var shouldFadeIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
      * it is successfully loaded. This disables shouldFadeIn.
      * @defaultvalue false;
      */
    var shouldStartVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IImageStyleProps, IImageStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IImageProps {
    
    inline def apply(): IImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageProps] (val x: Self) extends AnyVal {
      
      inline def setCoverStyle(value: ImageCoverStyle): Self = StObject.set(x, "coverStyle", value.asInstanceOf[js.Any])
      
      inline def setCoverStyleUndefined: Self = StObject.set(x, "coverStyle", js.undefined)
      
      inline def setErrorSrc(value: String): Self = StObject.set(x, "errorSrc", value.asInstanceOf[js.Any])
      
      inline def setErrorSrcUndefined: Self = StObject.set(x, "errorSrc", js.undefined)
      
      inline def setImageFit(value: ImageFit): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      inline def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      inline def setMaximizeFrame(value: Boolean): Self = StObject.set(x, "maximizeFrame", value.asInstanceOf[js.Any])
      
      inline def setMaximizeFrameUndefined: Self = StObject.set(x, "maximizeFrame", js.undefined)
      
      inline def setOnLoadingStateChange(value: /* loadState */ ImageLoadState => Unit): Self = StObject.set(x, "onLoadingStateChange", js.Any.fromFunction1(value))
      
      inline def setOnLoadingStateChangeUndefined: Self = StObject.set(x, "onLoadingStateChange", js.undefined)
      
      inline def setShouldFadeIn(value: Boolean): Self = StObject.set(x, "shouldFadeIn", value.asInstanceOf[js.Any])
      
      inline def setShouldFadeInUndefined: Self = StObject.set(x, "shouldFadeIn", js.undefined)
      
      inline def setShouldStartVisible(value: Boolean): Self = StObject.set(x, "shouldStartVisible", value.asInstanceOf[js.Any])
      
      inline def setShouldStartVisibleUndefined: Self = StObject.set(x, "shouldStartVisible", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IImageStyleProps, IImageStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IImageStyleProps => DeepPartial[IImageStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IImageStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Image height value
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * ImageFit booleans for center, cover, contain, centerContain, centerCover, none
      */
    var isCenter: js.UndefOr[Boolean] = js.undefined
    
    var isCenterContain: js.UndefOr[Boolean] = js.undefined
    
    var isCenterCover: js.UndefOr[Boolean] = js.undefined
    
    var isContain: js.UndefOr[Boolean] = js.undefined
    
    var isCover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if true image load is in error
      */
    var isError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true the image is coverStyle landscape instead of portrait
      */
    var isLandscape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the image is loaded
      */
    var isLoaded: js.UndefOr[Boolean] = js.undefined
    
    var isNone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if true, imageFit is undefined
      */
    var isNotImageFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the image frame will expand to fill its parent container.
      */
    var maximizeFrame: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, fades the image in when loaded.
      * @defaultvalue true
      */
    var shouldFadeIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
      * it is successfully loaded. This disables shouldFadeIn.
      * @defaultvalue false;
      */
    var shouldStartVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
    
    /**
      * Image width value
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object IImageStyleProps {
    
    inline def apply(theme: ITheme): IImageStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsCenter(value: Boolean): Self = StObject.set(x, "isCenter", value.asInstanceOf[js.Any])
      
      inline def setIsCenterContain(value: Boolean): Self = StObject.set(x, "isCenterContain", value.asInstanceOf[js.Any])
      
      inline def setIsCenterContainUndefined: Self = StObject.set(x, "isCenterContain", js.undefined)
      
      inline def setIsCenterCover(value: Boolean): Self = StObject.set(x, "isCenterCover", value.asInstanceOf[js.Any])
      
      inline def setIsCenterCoverUndefined: Self = StObject.set(x, "isCenterCover", js.undefined)
      
      inline def setIsCenterUndefined: Self = StObject.set(x, "isCenter", js.undefined)
      
      inline def setIsContain(value: Boolean): Self = StObject.set(x, "isContain", value.asInstanceOf[js.Any])
      
      inline def setIsContainUndefined: Self = StObject.set(x, "isContain", js.undefined)
      
      inline def setIsCover(value: Boolean): Self = StObject.set(x, "isCover", value.asInstanceOf[js.Any])
      
      inline def setIsCoverUndefined: Self = StObject.set(x, "isCover", js.undefined)
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      inline def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
      
      inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
      
      inline def setIsNone(value: Boolean): Self = StObject.set(x, "isNone", value.asInstanceOf[js.Any])
      
      inline def setIsNoneUndefined: Self = StObject.set(x, "isNone", js.undefined)
      
      inline def setIsNotImageFit(value: Boolean): Self = StObject.set(x, "isNotImageFit", value.asInstanceOf[js.Any])
      
      inline def setIsNotImageFitUndefined: Self = StObject.set(x, "isNotImageFit", js.undefined)
      
      inline def setMaximizeFrame(value: Boolean): Self = StObject.set(x, "maximizeFrame", value.asInstanceOf[js.Any])
      
      inline def setMaximizeFrameUndefined: Self = StObject.set(x, "maximizeFrame", js.undefined)
      
      inline def setShouldFadeIn(value: Boolean): Self = StObject.set(x, "shouldFadeIn", value.asInstanceOf[js.Any])
      
      inline def setShouldFadeInUndefined: Self = StObject.set(x, "shouldFadeIn", js.undefined)
      
      inline def setShouldStartVisible(value: Boolean): Self = StObject.set(x, "shouldStartVisible", value.asInstanceOf[js.Any])
      
      inline def setShouldStartVisibleUndefined: Self = StObject.set(x, "shouldStartVisible", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IImageStyles extends StObject {
    
    /**
      * Style set for the img element.
      */
    var image: IStyle
    
    /**
      * Style set for the root div element.
      */
    var root: IStyle
  }
  object IImageStyles {
    
    inline def apply(): IImageStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageStyles] (val x: Self) extends AnyVal {
      
      inline def setImage(value: IStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
