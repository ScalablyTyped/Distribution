package typings.ol.iconImageCacheMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconImageCache extends js.Object {
  
  def canExpireCache(): Boolean = js.native
  
  /**
    * FIXME empty description for jsdoc
    */
  def clear(): Unit = js.native
  
  /**
    * FIXME empty description for jsdoc
    */
  def expire(): Unit = js.native
  
  def get(src: String, crossOrigin: String, color: Color): typings.ol.iconImageMod.default = js.native
  
  def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.iconImageMod.default): Unit = js.native
  
  /**
    * Set the cache size of the icon cache. Default is 32. Change this value when
    * your map uses more than 32 different icon images and you are not caching icon
    * styles on the application level.
    */
  def setSize(maxCacheSize: Double): Unit = js.native
}
object IconImageCache {
  
  @scala.inline
  def apply(
    canExpireCache: () => Boolean,
    clear: () => Unit,
    expire: () => Unit,
    get: (String, String, Color) => typings.ol.iconImageMod.default,
    set: (String, String, Color, typings.ol.iconImageMod.default) => Unit,
    setSize: Double => Unit
  ): IconImageCache = {
    val __obj = js.Dynamic.literal(canExpireCache = js.Any.fromFunction0(canExpireCache), clear = js.Any.fromFunction0(clear), expire = js.Any.fromFunction0(expire), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[IconImageCache]
  }
  
  @scala.inline
  implicit class IconImageCacheOps[Self <: IconImageCache] (val x: Self) extends AnyVal {
    
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
    def setCanExpireCache(value: () => Boolean): Self = this.set("canExpireCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpire(value: () => Unit): Self = this.set("expire", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: (String, String, Color) => typings.ol.iconImageMod.default): Self = this.set("get", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSet(value: (String, String, Color, typings.ol.iconImageMod.default) => Unit): Self = this.set("set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetSize(value: Double => Unit): Self = this.set("setSize", js.Any.fromFunction1(value))
  }
}
