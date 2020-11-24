package typings.officeUiFabricReact.imageTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.ImgHTMLAttributes
import typings.std.HTMLImageElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IImagePropsOps[Self <: IImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoverStyle(value: ImageCoverStyle): Self = this.set("coverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverStyle: Self = this.set("coverStyle", js.undefined)
    
    @scala.inline
    def setErrorSrc(value: String): Self = this.set("errorSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorSrc: Self = this.set("errorSrc", js.undefined)
    
    @scala.inline
    def setImageFit(value: ImageFit): Self = this.set("imageFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFit: Self = this.set("imageFit", js.undefined)
    
    @scala.inline
    def setMaximizeFrame(value: Boolean): Self = this.set("maximizeFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizeFrame: Self = this.set("maximizeFrame", js.undefined)
    
    @scala.inline
    def setOnLoadingStateChange(value: /* loadState */ ImageLoadState => Unit): Self = this.set("onLoadingStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadingStateChange: Self = this.set("onLoadingStateChange", js.undefined)
    
    @scala.inline
    def setShouldFadeIn(value: Boolean): Self = this.set("shouldFadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFadeIn: Self = this.set("shouldFadeIn", js.undefined)
    
    @scala.inline
    def setShouldStartVisible(value: Boolean): Self = this.set("shouldStartVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldStartVisible: Self = this.set("shouldStartVisible", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IImageStyleProps => DeepPartial[IImageStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IImageStyleProps, IImageStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
