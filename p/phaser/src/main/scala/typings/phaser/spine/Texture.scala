package typings.phaser.spine

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Texture extends js.Object {
  var _image: HTMLImageElement
  def dispose(): Unit
  def getImage(): HTMLImageElement
  def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit
  def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit
}

object Texture {
  @scala.inline
  def apply(
    _image: HTMLImageElement,
    dispose: () => Unit,
    getImage: () => HTMLImageElement,
    setFilters: (TextureFilter, TextureFilter) => Unit,
    setWraps: (TextureWrap, TextureWrap) => Unit
  ): Texture = {
    val __obj = js.Dynamic.literal(_image = _image.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getImage = js.Any.fromFunction0(getImage), setFilters = js.Any.fromFunction2(setFilters), setWraps = js.Any.fromFunction2(setWraps))
    __obj.asInstanceOf[Texture]
  }
}

