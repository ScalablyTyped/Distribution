package typings
package olLib.rendererWebglMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureCacheEntry extends js.Object {
  var magFilter: scala.Double
  var minFilter: scala.Double
  var texture: stdLib.WebGLTexture
}

object TextureCacheEntry {
  @scala.inline
  def apply(magFilter: scala.Double, minFilter: scala.Double, texture: stdLib.WebGLTexture): TextureCacheEntry = {
    val __obj = js.Dynamic.literal(magFilter = magFilter, minFilter = minFilter, texture = texture)
  
    __obj.asInstanceOf[TextureCacheEntry]
  }
}

