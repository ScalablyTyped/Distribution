package typings.ol.iconImageCacheMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconImageCache extends js.Object {
  def canExpireCache(): Boolean
  def clear(): Unit
  def expire(): Unit
  def get(src: String, crossOrigin: String, color: Color): typings.ol.iconImageMod.default
  def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.iconImageMod.default): Unit
  def setSize(maxCacheSize: Double): Unit
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
}

