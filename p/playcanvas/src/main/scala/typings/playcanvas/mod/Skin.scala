package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../platform/graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
/** @typedef {import('../core/math/mat4.js').Mat4} Mat4 */
/**
  * A skin contains data about the bones in a hierarchy that drive a skinned mesh animation.
  * Specifically, the skin stores the bone name and inverse bind matrix and for each bone. Inverse
  * bind matrices are instrumental in the mathematics of vertex skinning.
  */
@JSImport("playcanvas", "Skin")
@js.native
open class Skin protected () extends StObject {
  /**
    * Create a new Skin instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this skin.
    * @param {Mat4[]} ibp - The array of inverse bind matrices.
    * @param {string[]} boneNames - The array of bone names for the bones referenced by this skin.
    */
  def this(graphicsDevice: GraphicsDevice, ibp: js.Array[Mat4], boneNames: js.Array[String]) = this()
  
  var boneNames: js.Array[String] = js.native
  
  var device: GraphicsDevice = js.native
  
  var inverseBindPose: js.Array[Mat4] = js.native
}
