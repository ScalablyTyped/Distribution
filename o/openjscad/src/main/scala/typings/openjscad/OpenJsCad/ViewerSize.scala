package typings.openjscad.OpenJsCad

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
  var height: Double
  var heightDefault: String
  var heightratio: Double
  var width: Double
  var widthDefault: String
}

object ViewerSize {
  @scala.inline
  def apply(height: Double, heightDefault: String, heightratio: Double, width: Double, widthDefault: String): ViewerSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightDefault = heightDefault.asInstanceOf[js.Any], heightratio = heightratio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthDefault = widthDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerSize]
  }
}

