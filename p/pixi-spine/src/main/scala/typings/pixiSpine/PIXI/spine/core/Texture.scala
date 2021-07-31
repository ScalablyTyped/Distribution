package typings.pixiSpine.PIXI.spine.core

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
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
  
  @scala.inline
  implicit class TextureMutableBuilder[Self <: Texture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImage(value: () => HTMLImageElement): Self = StObject.set(x, "getImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilters(value: (TextureFilter, TextureFilter) => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetWraps(value: (TextureWrap, TextureWrap) => Unit): Self = StObject.set(x, "setWraps", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_image(value: HTMLImageElement): Self = StObject.set(x, "_image", value.asInstanceOf[js.Any])
  }
}
