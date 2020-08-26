package typings.nodeSpriteGenerator.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compositor extends js.Object {
  def readImages(
    files: js.Array[String],
    callback: js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]
  ): Unit = js.native
  def render(
    layout: Layout,
    spritePath: String,
    options: CompositorOption,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class CompositorOps[Self <: Compositor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReadImages(
      value: (js.Array[String], js.Function2[/* error */ Error, /* images */ js.Array[Image], Unit]) => Unit
    ): Self = this.set("readImages", js.Any.fromFunction2(value))
    @scala.inline
    def setRender(value: (Layout, String, CompositorOption, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("render", js.Any.fromFunction4(value))
  }
  
}

