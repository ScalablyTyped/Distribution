package typings
package olLib.styleIconImageCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconImageCache", JSImport.Default)
@js.native
class default () extends IconImageCache {
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def expire(): scala.Unit = js.native
  /* CompleteClass */
  override def get(src: java.lang.String, crossOrigin: java.lang.String, color: olLib.colorMod.Color): olLib.styleIconImageMod.default = js.native
  /* CompleteClass */
  override def set(
    src: java.lang.String,
    crossOrigin: java.lang.String,
    color: olLib.colorMod.Color,
    iconImage: olLib.styleIconImageMod.default
  ): scala.Unit = js.native
  /* CompleteClass */
  override def setSize(maxCacheSize: scala.Double): scala.Unit = js.native
}

