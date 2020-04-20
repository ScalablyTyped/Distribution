package typings.openlayers.mod.layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Render mode for vector tiles:
  *  * `'image'`: Vector tiles are rendered as images. Great performance, but
  *    point symbols and texts are always rotated with the view and pixels are
  *    scaled during zoom animations.
  *  * `'hybrid'`: Polygon and line elements are rendered as images, so pixels
  *    are scaled during zoom animations. Point symbols and texts are accurately
  *    rendered as vectors and can stay upright on rotated views.
  *  * `'vector'`: Vector tiles are rendered as vectors. Most accurate rendering
  *    even during animations, but slower performance than the other options.
  * @api
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.image
  - typings.openlayers.openlayersStrings.hybrid
  - typings.openlayers.openlayersStrings.vector
*/
trait VectorTileRenderType extends js.Object

object VectorTileRenderType {
  @scala.inline
  def hybrid: typings.openlayers.openlayersStrings.hybrid = "hybrid".asInstanceOf[typings.openlayers.openlayersStrings.hybrid]
  @scala.inline
  def image: typings.openlayers.openlayersStrings.image = "image".asInstanceOf[typings.openlayers.openlayersStrings.image]
  @scala.inline
  def vector: typings.openlayers.openlayersStrings.vector = "vector".asInstanceOf[typings.openlayers.openlayersStrings.vector]
}

