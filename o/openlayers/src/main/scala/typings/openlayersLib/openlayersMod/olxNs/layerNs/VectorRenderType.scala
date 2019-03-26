package typings
package openlayersLib.openlayersMod.olxNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Render mode for vector layers:
  *  * `'image'`: Vector layers are rendered as images. Great performance, but
  *    point symbols and texts are always rotated with the view and pixels are
  *    scaled during zoom animations.
  *  * `'vector'`: Vector layers are rendered as vectors. Most accurate rendering
  *    even during animations, but slower performance.
  * Default is `vector`.
  * @api
  */
/* Rewritten from type alias, can be one of: 
  - openlayersLib.openlayersLibStrings.image
  - openlayersLib.openlayersLibStrings.vector
*/
trait VectorRenderType extends js.Object

