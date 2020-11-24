package typings.officeUiFabricReact.imageTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageStyleProps extends js.Object {
  
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
  implicit class IImageStylePropsOps[Self <: IImageStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsCenter(value: Boolean): Self = this.set("isCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCenter: Self = this.set("isCenter", js.undefined)
    
    @scala.inline
    def setIsCenterContain(value: Boolean): Self = this.set("isCenterContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCenterContain: Self = this.set("isCenterContain", js.undefined)
    
    @scala.inline
    def setIsCenterCover(value: Boolean): Self = this.set("isCenterCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCenterCover: Self = this.set("isCenterCover", js.undefined)
    
    @scala.inline
    def setIsContain(value: Boolean): Self = this.set("isContain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsContain: Self = this.set("isContain", js.undefined)
    
    @scala.inline
    def setIsCover(value: Boolean): Self = this.set("isCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCover: Self = this.set("isCover", js.undefined)
    
    @scala.inline
    def setIsError(value: Boolean): Self = this.set("isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsError: Self = this.set("isError", js.undefined)
    
    @scala.inline
    def setIsLandscape(value: Boolean): Self = this.set("isLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLandscape: Self = this.set("isLandscape", js.undefined)
    
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoaded: Self = this.set("isLoaded", js.undefined)
    
    @scala.inline
    def setIsNone(value: Boolean): Self = this.set("isNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNone: Self = this.set("isNone", js.undefined)
    
    @scala.inline
    def setIsNotImageFit(value: Boolean): Self = this.set("isNotImageFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNotImageFit: Self = this.set("isNotImageFit", js.undefined)
    
    @scala.inline
    def setMaximizeFrame(value: Boolean): Self = this.set("maximizeFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximizeFrame: Self = this.set("maximizeFrame", js.undefined)
    
    @scala.inline
    def setShouldFadeIn(value: Boolean): Self = this.set("shouldFadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFadeIn: Self = this.set("shouldFadeIn", js.undefined)
    
    @scala.inline
    def setShouldStartVisible(value: Boolean): Self = this.set("shouldStartVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldStartVisible: Self = this.set("shouldStartVisible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
