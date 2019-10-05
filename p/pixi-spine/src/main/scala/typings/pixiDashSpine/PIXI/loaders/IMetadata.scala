package typings.pixiDashSpine.PIXI.loaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadata extends js.Object {
  var atlasRawData: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[js.Any] = js.undefined
  var imageLoader: js.UndefOr[js.Any] = js.undefined
  var imageMetadata: js.UndefOr[js.Any] = js.undefined
  var imageNamePrefix: js.UndefOr[String] = js.undefined
  var images: js.UndefOr[js.Any] = js.undefined
  var spineAtlas: js.UndefOr[js.Any] = js.undefined
  var spineAtlasFile: js.UndefOr[String] = js.undefined
  var spineAtlasSuffix: js.UndefOr[String] = js.undefined
  var spineMetadata: js.UndefOr[js.Any] = js.undefined
  var spineSkeletonScale: js.UndefOr[Double] = js.undefined
}

object IMetadata {
  @scala.inline
  def apply(
    atlasRawData: String = null,
    image: js.Any = null,
    imageLoader: js.Any = null,
    imageMetadata: js.Any = null,
    imageNamePrefix: String = null,
    images: js.Any = null,
    spineAtlas: js.Any = null,
    spineAtlasFile: String = null,
    spineAtlasSuffix: String = null,
    spineMetadata: js.Any = null,
    spineSkeletonScale: Int | Double = null
  ): IMetadata = {
    val __obj = js.Dynamic.literal()
    if (atlasRawData != null) __obj.updateDynamic("atlasRawData")(atlasRawData)
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageLoader != null) __obj.updateDynamic("imageLoader")(imageLoader)
    if (imageMetadata != null) __obj.updateDynamic("imageMetadata")(imageMetadata)
    if (imageNamePrefix != null) __obj.updateDynamic("imageNamePrefix")(imageNamePrefix)
    if (images != null) __obj.updateDynamic("images")(images)
    if (spineAtlas != null) __obj.updateDynamic("spineAtlas")(spineAtlas)
    if (spineAtlasFile != null) __obj.updateDynamic("spineAtlasFile")(spineAtlasFile)
    if (spineAtlasSuffix != null) __obj.updateDynamic("spineAtlasSuffix")(spineAtlasSuffix)
    if (spineMetadata != null) __obj.updateDynamic("spineMetadata")(spineMetadata)
    if (spineSkeletonScale != null) __obj.updateDynamic("spineSkeletonScale")(spineSkeletonScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadata]
  }
}

