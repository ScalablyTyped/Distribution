package typings.pixiSpine.PIXI.loaders

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
    spineSkeletonScale: js.UndefOr[Double] = js.undefined
  ): IMetadata = {
    val __obj = js.Dynamic.literal()
    if (atlasRawData != null) __obj.updateDynamic("atlasRawData")(atlasRawData.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageLoader != null) __obj.updateDynamic("imageLoader")(imageLoader.asInstanceOf[js.Any])
    if (imageMetadata != null) __obj.updateDynamic("imageMetadata")(imageMetadata.asInstanceOf[js.Any])
    if (imageNamePrefix != null) __obj.updateDynamic("imageNamePrefix")(imageNamePrefix.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (spineAtlas != null) __obj.updateDynamic("spineAtlas")(spineAtlas.asInstanceOf[js.Any])
    if (spineAtlasFile != null) __obj.updateDynamic("spineAtlasFile")(spineAtlasFile.asInstanceOf[js.Any])
    if (spineAtlasSuffix != null) __obj.updateDynamic("spineAtlasSuffix")(spineAtlasSuffix.asInstanceOf[js.Any])
    if (spineMetadata != null) __obj.updateDynamic("spineMetadata")(spineMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(spineSkeletonScale)) __obj.updateDynamic("spineSkeletonScale")(spineSkeletonScale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadata]
  }
}

