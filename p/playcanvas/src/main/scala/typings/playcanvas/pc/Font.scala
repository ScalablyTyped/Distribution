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
trait Font extends js.Object {
  /**
    * The font intensity.
    */
  var intensity: Double
  /**
    * The font textures.
    */
  var textures: js.Array[Texture]
}

object Font {
  @scala.inline
  def apply(intensity: Double, textures: js.Array[Texture]): Font = {
    val __obj = js.Dynamic.literal(intensity = intensity.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

