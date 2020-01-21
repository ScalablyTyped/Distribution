package typings.nodeSpriteGenerator.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compositor extends js.Object {
  def readImages(
    files: js.Array[String],
    callback: js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]
  ): Unit
  def render(
    layout: Layout,
    spritePath: String,
    options: CompositorOption,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit
}

object Compositor {
  @scala.inline
  def apply(
    readImages: (js.Array[String], js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]) => Unit,
    render: (Layout, String, CompositorOption, js.Function1[/* error */ Error, Unit]) => Unit
  ): Compositor = {
    val __obj = js.Dynamic.literal(readImages = js.Any.fromFunction2(readImages), render = js.Any.fromFunction4(render))
  
    __obj.asInstanceOf[Compositor]
  }
}

