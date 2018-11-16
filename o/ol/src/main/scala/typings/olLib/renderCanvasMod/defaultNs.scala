package typings
package olLib.renderCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
           * @classdesc
           * A concrete subclass of {@link ol.render.VectorContext} that implements
           * direct rendering of features and geometries to an HTML5 Canvas context.
           * Instances of this class are created internally by the library and
           * provided to application code as vectorContext member of the
           * {@link ol.render.Event} object associated with postcompose, precompose and
           * render events emitted by layers and maps.
           *
           * @param context Context.
           * @param pixelRatio Pixel ratio.
           * @param extent Extent.
           * @param transform Transform.
           * @param viewRotation View rotation.
           * @struct
           */
  @js.native
  class Immediate protected ()
    extends openlayersLib.openlayersMod.renderNs.canvasNs.Immediate {
    /**
                 * @classdesc
                 * A concrete subclass of {@link ol.render.VectorContext} that implements
                 * direct rendering of features and geometries to an HTML5 Canvas context.
                 * Instances of this class are created internally by the library and
                 * provided to application code as vectorContext member of the
                 * {@link ol.render.Event} object associated with postcompose, precompose and
                 * render events emitted by layers and maps.
                 *
                 * @param context Context.
                 * @param pixelRatio Pixel ratio.
                 * @param extent Extent.
                 * @param transform Transform.
                 * @param viewRotation View rotation.
                 * @struct
                 */
    def this(context: stdLib.CanvasRenderingContext2D, pixelRatio: scala.Double, extent: openlayersLib.openlayersMod.Extent, transform: js.Any, viewRotation: scala.Double) = this()
  }
  
}

