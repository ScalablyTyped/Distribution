package typings.officeUiFabricReact.documentCardPreviewTypesMod

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.imageTypesMod.ImageFit
import typings.officeUiFabricReact.linkTypesMod.ILinkProps
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardPreviewImage extends js.Object {
  
  /**
    * Hex color value of the line below the preview, which should correspond to the document type.
    *
    * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
    * @deprecated To be removed at v5.0.0.
    */
  var accentColor: js.UndefOr[String] = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  
  /**
    * Deprecated at v1.3.6, to be removed at \>= v2.0.0.
    * @deprecated To be removed at v2.0.0.
    */
  var errorImageSrc: js.UndefOr[String] = js.native
  
  /**
    * If provided, forces the preview image to be this height.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Path to the icon associated with this document type.
    *
    */
  var iconSrc: js.UndefOr[String] = js.native
  
  /**
    * Used to determine how to size the image to fit the dimensions of the component.
    * If both dimensions are provided, then the image is fit using ImageFit.scale, otherwise ImageFit.none is used.
    */
  var imageFit: js.UndefOr[ImageFit] = js.native
  
  /**
    * Props to pass to Link component
    */
  var linkProps: js.UndefOr[ILinkProps] = js.native
  
  /**
    * File name for the document this preview represents.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The props for the preview icon container classname.
    * If provided, icon container classname will be used..
    */
  var previewIconContainerClass: js.UndefOr[String] = js.native
  
  /**
    * The props for the preview icon.
    * If provided, icon will be rendered instead of image.
    */
  var previewIconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * Path to the preview image.
    */
  var previewImageSrc: js.UndefOr[String] = js.native
  
  /**
    * URL to view the file.
    * @deprecated Use `href` inside of `linkProps` instead.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * If provided, forces the preview image to be this width.
    */
  var width: js.UndefOr[Double] = js.native
}
object IDocumentCardPreviewImage {
  
  @scala.inline
  def apply(): IDocumentCardPreviewImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardPreviewImage]
  }
  
  @scala.inline
  implicit class IDocumentCardPreviewImageOps[Self <: IDocumentCardPreviewImage] (val x: Self) extends AnyVal {
    
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[js.Object]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setErrorImageSrc(value: String): Self = this.set("errorImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorImageSrc: Self = this.set("errorImageSrc", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIconSrc(value: String): Self = this.set("iconSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSrc: Self = this.set("iconSrc", js.undefined)
    
    @scala.inline
    def setImageFit(value: ImageFit): Self = this.set("imageFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageFit: Self = this.set("imageFit", js.undefined)
    
    @scala.inline
    def setLinkProps(value: ILinkProps): Self = this.set("linkProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkProps: Self = this.set("linkProps", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreviewIconContainerClass(value: String): Self = this.set("previewIconContainerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewIconContainerClass: Self = this.set("previewIconContainerClass", js.undefined)
    
    @scala.inline
    def setPreviewIconProps(value: IIconProps): Self = this.set("previewIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewIconProps: Self = this.set("previewIconProps", js.undefined)
    
    @scala.inline
    def setPreviewImageSrc(value: String): Self = this.set("previewImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewImageSrc: Self = this.set("previewImageSrc", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
