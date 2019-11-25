package typings.openlayers.openlayersMod.style

import typings.openlayers.openlayersMod.olx.style.AtlasManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manages the creation of image atlases.
  *
  * Images added to this manager will be inserted into an atlas, which
  * will be used for rendering.
  * The `size` given in the constructor is the size for the first
  * atlas. After that, when new atlases are created, they will have
  * twice the size as the latest atlas (until `maxSize` is reached).
  *
  * If an application uses many images or very large images, it is recommended
  * to set a higher `size` value to avoid the creation of too many atlases.
  *
  * @struct
  * @api
  * @param opt_options Options.
  */
/* tslint:disable-next-line:no-unnecessary-class */
@JSImport("openlayers", "style.AtlasManager")
@js.native
/**
  * Manages the creation of image atlases.
  *
  * Images added to this manager will be inserted into an atlas, which
  * will be used for rendering.
  * The `size` given in the constructor is the size for the first
  * atlas. After that, when new atlases are created, they will have
  * twice the size as the latest atlas (until `maxSize` is reached).
  *
  * If an application uses many images or very large images, it is recommended
  * to set a higher `size` value to avoid the creation of too many atlases.
  *
  * @struct
  * @api
  * @param opt_options Options.
  */
class AtlasManager () extends js.Object {
  def this(opt_options: AtlasManagerOptions) = this()
}

