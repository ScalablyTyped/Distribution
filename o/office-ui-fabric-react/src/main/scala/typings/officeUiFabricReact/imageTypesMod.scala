package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageTypesMod {
  
  @js.native
  sealed trait ImageCoverStyle extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageCoverStyle with Double] = js.native
    
    /**
      * The image will be shown at 100% height of container and the width will be scaled accordingly
      */
    @js.native
    sealed trait landscape extends ImageCoverStyle
    /* 0 */ val landscape: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape with Double = js.native
    
    /**
      * The image will be shown at 100% width of container and the height will be scaled accordingly
      */
    @js.native
    sealed trait portrait extends ImageCoverStyle
    /* 1 */ val portrait: typings.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait with Double = js.native
  }
  
  @js.native
  sealed trait ImageFit extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageFit with Double] = js.native
    
    /**
      * The image is not scaled. The image is centered and cropped within the content box.
      */
    @js.native
    sealed trait center extends ImageFit
    /* 0 */ val center: typings.officeUiFabricReact.imageTypesMod.ImageFit.center with Double = js.native
    
    /**
      * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
      * behave as ImageFit.center if the image's natural height and width is less than the Image frame's height and width,
      * but if either natural height or width are larger than the frame it will behave as ImageFit.contain.
      */
    @js.native
    sealed trait centerContain extends ImageFit
    /* 5 */ val centerContain: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerContain with Double = js.native
    
    /**
      * The image will be centered horizontally and vertically within the frame and maintains its aspect ratio. It will
      * behave as ImageFit.center if the image's natural height or width is less than the Image frame's height or width,
      * but if both natural height and width are larger than the frame it will behave as ImageFit.cover.
      */
    @js.native
    sealed trait centerCover extends ImageFit
    /* 4 */ val centerCover: typings.officeUiFabricReact.imageTypesMod.ImageFit.centerCover with Double = js.native
    
    /**
      * The image is scaled to maintain its aspect ratio while being fully contained within the frame. The image will
      * be centered horizontally and vertically within the frame. The space in the top and bottom or in the sides of
      * the frame will be empty depending on the difference in aspect ratio between the image and the frame.
      */
    @js.native
    sealed trait contain extends ImageFit
    /* 1 */ val contain: typings.officeUiFabricReact.imageTypesMod.ImageFit.contain with Double = js.native
    
    /**
      * The image is scaled to maintain its aspect ratio while filling the frame. Portions of the image will be cropped
      * from the top and bottom, or the sides, depending on the difference in aspect ratio between the image and the frame.
      */
    @js.native
    sealed trait cover extends ImageFit
    /* 2 */ val cover: typings.officeUiFabricReact.imageTypesMod.ImageFit.cover with Double = js.native
    
    /**
      * Neither the image nor the frame are scaled. If their sizes do not match, the image will either be cropped or the
      * frame will have empty space.
      */
    @js.native
    sealed trait none extends ImageFit
    /* 3 */ val none: typings.officeUiFabricReact.imageTypesMod.ImageFit.none with Double = js.native
  }
  
  @js.native
  sealed trait ImageLoadState extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.types", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageLoadState with Double] = js.native
    
    /**
      * An error has been encountered while loading the image.
      */
    @js.native
    sealed trait error extends ImageLoadState
    /* 2 */ val error: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.error with Double = js.native
    
    /**
      * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead
      * and rerender the Image with a difference src.
      * @deprecated Use `onLoadingStateChange` instead
      * and rerender the Image with a difference src.
      */
    @js.native
    sealed trait errorLoaded extends ImageLoadState
    /* 3 */ val errorLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded with Double = js.native
    
    /**
      * The image has been loaded successfully.
      */
    @js.native
    sealed trait loaded extends ImageLoadState
    /* 1 */ val loaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded with Double = js.native
    
    /**
      * The image has not yet been loaded, and there is no error yet.
      */
    @js.native
    sealed trait notLoaded extends ImageLoadState
    /* 0 */ val notLoaded: typings.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded with Double = js.native
  }
  
  @js.native
  trait IImage extends StObject
  
  @js.native
  trait IImageProps extends ImgHTMLAttributes[HTMLImageElement] {
    
    /**
      * Specifies the cover style to be used for this image. If not
      * specified, this will be dynamically calculated based on the
      * aspect ratio for the image.
      */
    var coverStyle: js.UndefOr[ImageCoverStyle] = js.native
    
    /**
      * Deprecated at v1.3.6, to replace the src in case of errors, use `onLoadingStateChange` instead and
      * rerender the Image with a difference src.
      * @deprecated Use `onLoadingStateChange` instead and
      * rerender the Image with a difference src.
      */
    var errorSrc: js.UndefOr[String] = js.native
    
    /**
      * Used to determine how the image is scaled and cropped to fit the frame.
      *
      * @defaultvalue If both dimensions are provided, then the image is fit using ImageFit.scale.
      * Otherwise, the image won't be scaled or cropped.
      */
    var imageFit: js.UndefOr[ImageFit] = js.native
    
    /**
      * If true, the image frame will expand to fill its parent container.
      */
    var maximizeFrame: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional callback method for when the image load state has changed.
      * The 'loadState' parameter indicates the current state of the Image.
      */
    var onLoadingStateChange: js.UndefOr[js.Function1[/* loadState */ ImageLoadState, Unit]] = js.native
    
    /**
      * If true, fades the image in when loaded.
      * @defaultvalue true
      */
    var shouldFadeIn: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
      * it is successfully loaded. This disables shouldFadeIn.
      * @defaultvalue false;
      */
    var shouldStartVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IImageStyleProps, IImageStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IImageProps {
    
    @scala.inline
    def apply(): IImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageProps]
    }
    
    @scala.inline
    implicit class IImagePropsMutableBuilder[Self <: IImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverStyle(value: ImageCoverStyle): Self = StObject.set(x, "coverStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverStyleUndefined: Self = StObject.set(x, "coverStyle", js.undefined)
      
      @scala.inline
      def setErrorSrc(value: String): Self = StObject.set(x, "errorSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorSrcUndefined: Self = StObject.set(x, "errorSrc", js.undefined)
      
      @scala.inline
      def setImageFit(value: ImageFit): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFitUndefined: Self = StObject.set(x, "imageFit", js.undefined)
      
      @scala.inline
      def setMaximizeFrame(value: Boolean): Self = StObject.set(x, "maximizeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizeFrameUndefined: Self = StObject.set(x, "maximizeFrame", js.undefined)
      
      @scala.inline
      def setOnLoadingStateChange(value: /* loadState */ ImageLoadState => Unit): Self = StObject.set(x, "onLoadingStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadingStateChangeUndefined: Self = StObject.set(x, "onLoadingStateChange", js.undefined)
      
      @scala.inline
      def setShouldFadeIn(value: Boolean): Self = StObject.set(x, "shouldFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFadeInUndefined: Self = StObject.set(x, "shouldFadeIn", js.undefined)
      
      @scala.inline
      def setShouldStartVisible(value: Boolean): Self = StObject.set(x, "shouldStartVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldStartVisibleUndefined: Self = StObject.set(x, "shouldStartVisible", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IImageStyleProps, IImageStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IImageStyleProps => DeepPartial[IImageStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IImageStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Image height value
      */
    var height: js.UndefOr[Double | String] = js.native
    
    /**
      * ImageFit booleans for center, cover, contain, centerContain, centerCover, none
      */
    var isCenter: js.UndefOr[Boolean] = js.native
    
    var isCenterContain: js.UndefOr[Boolean] = js.native
    
    var isCenterCover: js.UndefOr[Boolean] = js.native
    
    var isContain: js.UndefOr[Boolean] = js.native
    
    var isCover: js.UndefOr[Boolean] = js.native
    
    /**
      * if true image load is in error
      */
    var isError: js.UndefOr[Boolean] = js.native
    
    /**
      * If true the image is coverStyle landscape instead of portrait
      */
    var isLandscape: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the image is loaded
      */
    var isLoaded: js.UndefOr[Boolean] = js.native
    
    var isNone: js.UndefOr[Boolean] = js.native
    
    /**
      * if true, imageFit is undefined
      */
    var isNotImageFit: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the image frame will expand to fill its parent container.
      */
    var maximizeFrame: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, fades the image in when loaded.
      * @defaultvalue true
      */
    var shouldFadeIn: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
      * it is successfully loaded. This disables shouldFadeIn.
      * @defaultvalue false;
      */
    var shouldStartVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
    
    /**
      * Image width value
      */
    var width: js.UndefOr[Double | String] = js.native
  }
  object IImageStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IImageStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageStyleProps]
    }
    
    @scala.inline
    implicit class IImageStylePropsMutableBuilder[Self <: IImageStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsCenter(value: Boolean): Self = StObject.set(x, "isCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCenterContain(value: Boolean): Self = StObject.set(x, "isCenterContain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCenterContainUndefined: Self = StObject.set(x, "isCenterContain", js.undefined)
      
      @scala.inline
      def setIsCenterCover(value: Boolean): Self = StObject.set(x, "isCenterCover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCenterCoverUndefined: Self = StObject.set(x, "isCenterCover", js.undefined)
      
      @scala.inline
      def setIsCenterUndefined: Self = StObject.set(x, "isCenter", js.undefined)
      
      @scala.inline
      def setIsContain(value: Boolean): Self = StObject.set(x, "isContain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsContainUndefined: Self = StObject.set(x, "isContain", js.undefined)
      
      @scala.inline
      def setIsCover(value: Boolean): Self = StObject.set(x, "isCover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCoverUndefined: Self = StObject.set(x, "isCover", js.undefined)
      
      @scala.inline
      def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
      
      @scala.inline
      def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLandscapeUndefined: Self = StObject.set(x, "isLandscape", js.undefined)
      
      @scala.inline
      def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
      
      @scala.inline
      def setIsNone(value: Boolean): Self = StObject.set(x, "isNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNoneUndefined: Self = StObject.set(x, "isNone", js.undefined)
      
      @scala.inline
      def setIsNotImageFit(value: Boolean): Self = StObject.set(x, "isNotImageFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNotImageFitUndefined: Self = StObject.set(x, "isNotImageFit", js.undefined)
      
      @scala.inline
      def setMaximizeFrame(value: Boolean): Self = StObject.set(x, "maximizeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizeFrameUndefined: Self = StObject.set(x, "maximizeFrame", js.undefined)
      
      @scala.inline
      def setShouldFadeIn(value: Boolean): Self = StObject.set(x, "shouldFadeIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFadeInUndefined: Self = StObject.set(x, "shouldFadeIn", js.undefined)
      
      @scala.inline
      def setShouldStartVisible(value: Boolean): Self = StObject.set(x, "shouldStartVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldStartVisibleUndefined: Self = StObject.set(x, "shouldStartVisible", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IImageStyles extends StObject {
    
    /**
      * Style set for the img element.
      */
    var image: IStyle = js.native
    
    /**
      * Style set for the root div element.
      */
    var root: IStyle = js.native
  }
  object IImageStyles {
    
    @scala.inline
    def apply(): IImageStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IImageStyles]
    }
    
    @scala.inline
    implicit class IImageStylesMutableBuilder[Self <: IImageStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage(value: IStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNull: Self = StObject.set(x, "image", null)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
