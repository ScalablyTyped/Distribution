package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Skin
  * @class A skin contains data about the bones in a hierarchy that drive a skinned mesh animation.
  * Specifically, the skin stores the bone name and inverse bind matrix and for each bone.
  * Inverse bind matrices are instrumental in the mathematics of vertex skinning.
  * @param {pc.GraphicsDevice} graphicsDevice The graphics device used to manage this skin.
  * @param {pc.Mat4[]} ibp The array of inverse bind matrices.
  * @param {String[]} boneNames The array of bone names for the bones referenced by this skin.
  * @author Will Eastcott
  */
@JSGlobal("pc.Skin")
@js.native
class Skin protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice, ibp: js.Array[Mat4], boneNames: js.Array[String]) = this()
}

