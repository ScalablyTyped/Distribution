package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The wrap modes that are supported by pixi.
  *
  * The {@link PIXI.settings.WRAP_MODE} wrap mode affects the default wrapping mode of future operations.
  * It can be re-assigned to either CLAMP or REPEAT, depending upon suitability.
  * If the texture is non power of two then clamp will be used regardless as webGL can
  * only use REPEAT if the texture is po2.
  *
  * This property only affects WebGL.
  */
@JSImport("pixi.js", "WRAP_MODES")
@js.native
object WRAP_MODES extends js.Object {
  /** The textures uvs are clamped */
  var CLAMP: Double = js.native
  /** The texture uvs tile and repeat */
  var MIRRORED_REPEAT: Double = js.native
  /** The texture uvs tile and repeat with mirroring */
  var REPEAT: Double = js.native
}

