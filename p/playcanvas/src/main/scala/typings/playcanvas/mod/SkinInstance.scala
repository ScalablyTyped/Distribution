package typings.playcanvas.mod

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
@JSImport("playcanvas", "SkinInstance")
@js.native
class SkinInstance protected ()
  extends typings.playcanvas.pc.SkinInstance {
  def this(skin: typings.playcanvas.pc.Skin) = this()
  /**
    * An array of nodes representing each bone in this skin instance.
    */
  /* CompleteClass */
  override var bones: js.Array[typings.playcanvas.pc.GraphNode] = js.native
}

