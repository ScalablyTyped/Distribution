package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WRAP_MODES extends js.Object

/**
  * The wrap modes that are supported by pixi.
  *
  * The {@link PIXI.settings.WRAP_MODE} wrap mode affects the default wrapping mode of future operations.
  * It can be re-assigned to either CLAMP or REPEAT, depending upon suitability.
  * If the texture is non power of two then clamp will be used regardless as WebGL can
  * only use REPEAT if the texture is po2.
  *
  * This property only affects WebGL.
  *
  * @name WRAP_MODES
  * @memberof PIXI
  * @static
  * @enum {number}
  * @property {number} CLAMP - The textures uvs are clamped
  * @property {number} REPEAT - The texture uvs tile and repeat
  * @property {number} MIRRORED_REPEAT - The texture uvs tile and repeat with mirroring
  */
@JSGlobal("PIXI.WRAP_MODES")
@js.native
object WRAP_MODES extends js.Object {
  @js.native
  sealed trait CLAMP extends WRAP_MODES
  
  @js.native
  sealed trait MIRRORED_REPEAT extends WRAP_MODES
  
  @js.native
  sealed trait REPEAT extends WRAP_MODES
  
}

