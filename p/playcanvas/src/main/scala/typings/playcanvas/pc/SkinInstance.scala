package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A skin instance is responsible for generating the matrix palette that is used to
  skin vertices from object space to world space.
  * @property bones - An array of nodes representing each bone in this skin instance.
  * @param skin - The skin that will provide the inverse bind pose matrices to
  generate the final matrix palette.
  */
trait SkinInstance extends js.Object {
  /**
    * An array of nodes representing each bone in this skin instance.
    */
  var bones: js.Array[GraphNode]
}

object SkinInstance {
  @scala.inline
  def apply(bones: js.Array[GraphNode]): SkinInstance = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinInstance]
  }
}

