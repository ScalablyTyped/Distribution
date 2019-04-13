package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compositor extends js.Object {
  def readImages(
    files: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* images */ js.Array[Image], scala.Unit]
  ): scala.Unit
  def render(
    layout: Layout,
    spritePath: java.lang.String,
    options: CompositorOption,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit
}

object Compositor {
  @scala.inline
  def apply(
    readImages: (js.Array[java.lang.String], js.Function2[/* error */ stdLib.Error, /* images */ js.Array[Image], scala.Unit]) => scala.Unit,
    render: (Layout, java.lang.String, CompositorOption, js.Function1[/* error */ stdLib.Error, scala.Unit]) => scala.Unit
  ): Compositor = {
    val __obj = js.Dynamic.literal(readImages = js.Any.fromFunction2(readImages), render = js.Any.fromFunction4(render))
  
    __obj.asInstanceOf[Compositor]
  }
}

