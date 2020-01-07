package typings.ol.styleIconImageCacheMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/IconImageCache", JSImport.Default)
@js.native
class default () extends IconImageCache {
  /* CompleteClass */
  override def canExpireCache(): Boolean = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def expire(): Unit = js.native
  /* CompleteClass */
  override def get(src: String, crossOrigin: String, color: Color): typings.ol.styleIconImageMod.default = js.native
  /* CompleteClass */
  override def set(src: String, crossOrigin: String, color: Color, iconImage: typings.ol.styleIconImageMod.default): Unit = js.native
  /* CompleteClass */
  override def setSize(maxCacheSize: Double): Unit = js.native
}

