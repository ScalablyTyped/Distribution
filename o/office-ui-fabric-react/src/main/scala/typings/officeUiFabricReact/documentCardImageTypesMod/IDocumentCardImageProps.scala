package typings.officeUiFabricReact.documentCardImageTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.imageTypesMod.ImageFit
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IDocumentCardImagePropsOps[Self <: IDocumentCardImageProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardImage | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardImage]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setImageFit(value: ImageFit): Self = this.set("imageFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFit: Self = this.set("imageFit", js.undefined)
    
    @scala.inline
    def setImageSrc(value: String): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSrc: Self = this.set("imageSrc", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDocumentCardImageStyleProps => DeepPartial[IDocumentCardImageStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
