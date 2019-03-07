package typings
package olLib.styleAtlasManagerMod

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
@JSImport("ol/style/AtlasManager", JSImport.Default)
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
class default ()
  extends openlayersLib.openlayersMod.styleNs.AtlasManager {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.AtlasManagerOptions) = this()
}

