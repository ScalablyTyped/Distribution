package typings.phaser.spine

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Texture extends js.Object {
  
  var _image: HTMLImageElement = js.native
  
  def dispose(): Unit = js.native
  
  def getImage(): HTMLImageElement = js.native
  
  def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit = js.native
  
  def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit = js.native
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
  
  @scala.inline
  implicit class TextureOps[Self <: Texture] (val x: Self) extends AnyVal {
    
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
    def set_image(value: HTMLImageElement): Self = this.set("_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImage(value: () => HTMLImageElement): Self = this.set("getImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilters(value: (TextureFilter, TextureFilter) => Unit): Self = this.set("setFilters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetWraps(value: (TextureWrap, TextureWrap) => Unit): Self = this.set("setWraps", js.Any.fromFunction2(value))
  }
}
