package typings
package olLib.styleIconImageCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconImageCache extends js.Object {
  def clear(): scala.Unit
  def expire(): scala.Unit
  def get(src: java.lang.String, crossOrigin: java.lang.String, color: olLib.colorMod.Color): olLib.styleIconImageMod.default
  def set(
    src: java.lang.String,
    crossOrigin: java.lang.String,
    color: olLib.colorMod.Color,
    iconImage: olLib.styleIconImageMod.default
  ): scala.Unit
  def setSize(maxCacheSize: scala.Double): scala.Unit
}

object IconImageCache {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    expire: () => scala.Unit,
    get: (java.lang.String, java.lang.String, olLib.colorMod.Color) => olLib.styleIconImageMod.default,
    set: (java.lang.String, java.lang.String, olLib.colorMod.Color, olLib.styleIconImageMod.default) => scala.Unit,
    setSize: scala.Double => scala.Unit
  ): IconImageCache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), expire = js.Any.fromFunction0(expire), get = js.Any.fromFunction3(get), set = js.Any.fromFunction4(set), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[IconImageCache]
  }
}

