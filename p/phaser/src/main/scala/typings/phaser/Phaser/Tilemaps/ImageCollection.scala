package typings.phaser.Phaser.Tilemaps

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
  * 
  * Image Collections are normally created automatically when Tiled data is loaded.
  */
trait ImageCollection extends js.Object {
  /**
    * The Tiled firstgid value.
    * This is the starting index of the first image index this Image Collection contains.
    */
  var firstgid: integer
  /**
    * The height of the tallest image (in pixels).
    */
  val imageHeight: integer
  /**
    * The margin around the images in the collection (in pixels).
    * Use `setSpacing` to change.
    */
  val imageMarge: integer
  /**
    * The spacing between each image in the collection (in pixels).
    * Use `setSpacing` to change.
    */
  val imageSpacing: integer
  /**
    * The width of the widest image (in pixels).
    */
  val imageWidth: integer
  /**
    * The cached images that are a part of this collection.
    */
  val images: js.Array[_]
  /**
    * The name of the Image Collection.
    */
  var name: String
  /**
    * Image Collection-specific properties that are typically defined in the Tiled editor.
    */
  var properties: js.Object
  /**
    * The total number of images in the image collection.
    */
  val total: integer
  /**
    * Add an image to this Image Collection.
    * @param gid The gid of the image in the Image Collection.
    * @param image The the key of the image in the Image Collection and in the cache.
    */
  def addImage(gid: integer, image: String): ImageCollection
  /**
    * Returns true if and only if this image collection contains the given image index.
    * @param imageIndex The image index to search for.
    */
  def containsImageIndex(imageIndex: integer): Boolean
}

object ImageCollection {
  @scala.inline
  def apply(
    addImage: (integer, String) => ImageCollection,
    containsImageIndex: integer => Boolean,
    firstgid: integer,
    imageHeight: integer,
    imageMarge: integer,
    imageSpacing: integer,
    imageWidth: integer,
    images: js.Array[_],
    name: String,
    properties: js.Object,
    total: integer
  ): ImageCollection = {
    val __obj = js.Dynamic.literal(addImage = js.Any.fromFunction2(addImage), containsImageIndex = js.Any.fromFunction1(containsImageIndex), firstgid = firstgid.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageMarge = imageMarge.asInstanceOf[js.Any], imageSpacing = imageSpacing.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCollection]
  }
}

