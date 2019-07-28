package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXINs.UniformDataMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Filter")
@js.native
class Filter[U /* <: js.Object */] ()
  extends typings.pixiDotJs.PIXINs.Filter[U] {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String, uniformData: UniformDataMap[U]) = this()
}

/* static members */
@JSImport("pixi.js", "Filter")
@js.native
object Filter extends js.Object {
  var defaultFragmentSrc: String = js.native
  var defaultVertexSrc: String = js.native
}

