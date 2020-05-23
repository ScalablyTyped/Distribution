package typings.playcanvas.global.pc

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
@JSGlobal("pc.Font")
@js.native
class Font protected ()
  extends typings.playcanvas.pc.Font {
  def this(textures: js.Array[typings.playcanvas.pc.Texture], data: js.Any) = this()
  /**
    * The font intensity.
    */
  /* CompleteClass */
  override var intensity: Double = js.native
  /**
    * The font textures.
    */
  /* CompleteClass */
  override var textures: js.Array[typings.playcanvas.pc.Texture] = js.native
}

