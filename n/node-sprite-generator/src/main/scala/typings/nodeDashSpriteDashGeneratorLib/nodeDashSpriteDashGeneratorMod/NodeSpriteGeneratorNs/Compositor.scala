package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod.NodeSpriteGeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compositor extends js.Object {
  def readImages(
    files: js.Array[java.lang.String],
    callback: js.Function2[/* error */ nodeLib.Error, /* images */ js.Array[Image], scala.Unit]
  ): scala.Unit
  def render(
    layout: Layout,
    spritePath: java.lang.String,
    options: CompositorOption,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit
}

object Compositor {
  @scala.inline
  def apply(
    readImages: js.Function2[
      js.Array[java.lang.String], 
      js.Function2[/* error */ nodeLib.Error, /* images */ js.Array[Image], scala.Unit], 
      scala.Unit
    ],
    render: js.Function4[
      Layout, 
      java.lang.String, 
      CompositorOption, 
      js.Function1[/* error */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ]
  ): Compositor = {
    val __obj = js.Dynamic.literal(readImages = readImages, render = render)
  
    __obj.asInstanceOf[Compositor]
  }
}

