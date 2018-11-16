package typings
package openjscadLib.OpenJsCadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * options parameter:
     * - drawLines: display wireframe lines
     * - drawFaces: display surfaces
     * - bgColor: canvas background color
     * - color: object color
     * - viewerwidth, viewerheight: set rendering size. Works with any css unit.
     *     viewerheight can also be specified as a ratio to width, ie number e (0, 1]
     * - noWebGL: force render without webGL
     * - verbose: show additional info (currently only time used for rendering)
     */

trait ViewerSize extends js.Object {
  var height: scala.Double
  var heightDefault: java.lang.String
  var heightratio: scala.Double
  var width: scala.Double
  var widthDefault: java.lang.String
}

