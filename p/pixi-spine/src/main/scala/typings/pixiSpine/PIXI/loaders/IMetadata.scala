package typings.pixiSpine.PIXI.loaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadata extends js.Object {
  var atlasRawData: js.UndefOr[String] = js.native
  var image: js.UndefOr[js.Any] = js.native
  var imageLoader: js.UndefOr[js.Any] = js.native
  var imageMetadata: js.UndefOr[js.Any] = js.native
  var imageNamePrefix: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Any] = js.native
  var spineAtlas: js.UndefOr[js.Any] = js.native
  var spineAtlasFile: js.UndefOr[String] = js.native
  var spineAtlasSuffix: js.UndefOr[String] = js.native
  var spineMetadata: js.UndefOr[js.Any] = js.native
  var spineSkeletonScale: js.UndefOr[Double] = js.native
}

object IMetadata {
  @scala.inline
  def apply(): IMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetadata]
  }
  @scala.inline
  implicit class IMetadataOps[Self <: IMetadata] (val x: Self) extends AnyVal {
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
    def setAtlasRawData(value: String): Self = this.set("atlasRawData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtlasRawData: Self = this.set("atlasRawData", js.undefined)
    @scala.inline
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageLoader(value: js.Any): Self = this.set("imageLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLoader: Self = this.set("imageLoader", js.undefined)
    @scala.inline
    def setImageMetadata(value: js.Any): Self = this.set("imageMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageMetadata: Self = this.set("imageMetadata", js.undefined)
    @scala.inline
    def setImageNamePrefix(value: String): Self = this.set("imageNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageNamePrefix: Self = this.set("imageNamePrefix", js.undefined)
    @scala.inline
    def setImages(value: js.Any): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setSpineAtlas(value: js.Any): Self = this.set("spineAtlas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpineAtlas: Self = this.set("spineAtlas", js.undefined)
    @scala.inline
    def setSpineAtlasFile(value: String): Self = this.set("spineAtlasFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpineAtlasFile: Self = this.set("spineAtlasFile", js.undefined)
    @scala.inline
    def setSpineAtlasSuffix(value: String): Self = this.set("spineAtlasSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpineAtlasSuffix: Self = this.set("spineAtlasSuffix", js.undefined)
    @scala.inline
    def setSpineMetadata(value: js.Any): Self = this.set("spineMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpineMetadata: Self = this.set("spineMetadata", js.undefined)
    @scala.inline
    def setSpineSkeletonScale(value: Double): Self = this.set("spineSkeletonScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpineSkeletonScale: Self = this.set("spineSkeletonScale", js.undefined)
  }
  
}

