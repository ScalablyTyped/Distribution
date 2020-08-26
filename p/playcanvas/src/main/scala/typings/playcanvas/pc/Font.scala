package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the resource of a font asset.
  * @property intensity - The font intensity.
  * @property textures - The font textures.
  * @param textures - The font textures.
  * @param data - The font data.
  */
@js.native
trait Font extends js.Object {
  /**
    * The font intensity.
    */
  var intensity: Double = js.native
  /**
    * The font textures.
    */
  var textures: js.Array[Texture] = js.native
}

object Font {
  @scala.inline
  def apply(intensity: Double, textures: js.Array[Texture]): Font = {
    val __obj = js.Dynamic.literal(intensity = intensity.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
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
    def setIntensity(value: Double): Self = this.set("intensity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexturesVarargs(value: Texture*): Self = this.set("textures", js.Array(value :_*))
    @scala.inline
    def setTextures(value: js.Array[Texture]): Self = this.set("textures", value.asInstanceOf[js.Any])
  }
  
}

