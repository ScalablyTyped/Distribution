package typings.ol.rendererWebglMapMod

import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureCacheEntry extends js.Object {
  var magFilter: Double
  var minFilter: Double
  var texture: WebGLTexture
}

object TextureCacheEntry {
  @scala.inline
  def apply(magFilter: Double, minFilter: Double, texture: WebGLTexture): TextureCacheEntry = {
    val __obj = js.Dynamic.literal(magFilter = magFilter, minFilter = minFilter, texture = texture)
  
    __obj.asInstanceOf[TextureCacheEntry]
  }
}

